# Dynamodb-Guardium Logstash filter plug-in

This is a [Logstash](https://github.com/elastic/logstash) filter plug-in for the universal connector that is featured in IBM Security Guardium. It parses events and messages from the Amazon DynamoDB audit log into a [Guardium record](https://github.com/IBM/universal-connectors/blob/main/common/src/main/java/com/ibm/guardium/universalconnector/commons/structures/Record.java) instance (which is a standard structure made out of several parts). The information is then sent over to Guardium. Guardium records include the accessor (the person who tried to access the data), the session, data, and exceptions. If there are no errors, the data contains details about the query "construct". The construct details the main action (verb) and collections (objects) involved.

The plug-in is free and open-source (Apache 2.0). It can be used as a starting point to develop additional filter plug-ins for Guardium universal connector.


## 1. Configuring Amazon DynamoDB

In the AWS web interface, configure the service for Dynamodb.

### Procedure

1. Go to https://console.aws.amazon.com/
2. Click **Services** in the top left menu.
3. Underneath **All services**, click on **Database**.
4. On the right panel, click **DynamoDB**.
5. At the top right, click on the dropdown menu and select your region.
6. Click the orange **Create Table** button.
7. Enter a table name.
8. Enter a partition key.
9. Scroll down and click the orange **Create table** button.

## 2. Enabling audit logs 

There are different methods for auditing and logging. We will use CloudTrail for this example since it supports all required parameters. The following events are supported for auditing in AWS.


### Procedure

1. Click **Services** in the top left menu.
2. Underneath **All services**, click on **Management & Governance**.
3. On the right panel, click **Cloud Trail**.
4. Click **Create trail** button.
5. Provide a trail name under **Trail name**.
6. Under **Storage location**, verify that **Create new S3 bucket** is selected.
7. Under **Log file SSE-KMS encryption**, clear the Enabled box.
8. If the logs are to be monitored through CloudWatch, then forward them to Cloudwatch using steps 9 to 13. (If not, skip those steps).
9. Under **CloudWatch Logs**, check the **Enabled** box.
10. Verify **New** is selected for **Log group**.
11. Under **Log group name**, provide a new log group name.
12. Verify **New** is selected for **IAM Role**.
13. For **Role name**, provide a new role name.
14. Click **Next**.
15. For **Event type**, select **Management events** and **Data events**.
16. Verify that **Read** and **Write** are selected for **API Activity**.
17. In the **Data Events** section, click **Switch to basic event selectors**.
18. Click **Continue** to confirm.
19. Click **Add data event type**.
20. Click **Data event source** and select **DynamoDB**.
21. Click **NEXT**.
22. Verify that all parameters shown are correct.
23. Click **Create trail**.


## 3. Viewing the logs on CloudWatch

### Procedure

1. Click the Service drop down.
2. On the `Recently visited` panel, click **CloudWatch**.
3. On the left panel, click **Log**.
4. Click on **Log groups** under Logs.
5. In the search box, enter the name of the log group that you created in the previous STEP 9.
6. Click on the log group that appears in the search.
7. All logs display under log streams in the format: <account_id>_CloudTrail_<region>

#### Note
Before making any changes to the lambda function code, first disable the above rule.
Deploy the change and then re-enable the rule.

### Limitations

1. The Dynamo DB plug-in does not support IPV6.

2. You may need to disable management events in order to avoid heavy traffic and data loss in Guardium. Disabling management events disables logging of the following events: 
CreateTable, DeleteTable, ListTable, UpdateTable, DescribeTable events.



## 4. Configuring the Dynamodb filters in Guardium

The Guardium universal connector is the Guardium entry point for native audit logs. The universal connector identifies and parses received events, and then converts them to a standard Guardium format. The output of the universal connector is forwarded to the Guardium sniffer on the collector, for policy and auditing enforcements. Configure Guardium to read the native audit logs by customizing the dynamodb template.

### Authorizing outgoing traffic from AWS to Guardium

#### Procedure

1. Log in to the Guardium Collector's APIs.
2. Issue the following commands:
```
grdapi add_domain_to_universal_connector_allowed_domains domain=amazonaws.com
grdapi add_domain_to_universal_connector_allowed_domains domain=amazon.com
```

#### Before you begin
• Configure the policies you require. See [policies](https://github.com/IBM/universal-connectors/tree/main/docs#policies) for more information.

• You must have permission for the S-Tap Management role. The admin user includes this role by default.

• Download the [cloudtrail_codec_plugin.zip](DynamodbOverCloudtrailPackage/DynamoDB/cloudtrail_codec_plugin.zip) plug-in, if the logs are to be pulled directly from CloudTrail.

• Download the [logstash-filter-dynamodb_guardium_plugin_filter.zip plug-in.](./logstash-filter-dynamodb_guardium_plugin_filter.zip)

### Procedure
1. On the collector, go to **Setup** > **Tools and Views** > **Configure Universal Connector**.
2. Enable the connector if it is already disabled, before proceeding to upload the UC.
3. Click **Upload File**, 
	* If the audit logs are to be fetched from CloudTrail, select the
      1. [cloudtrail_codec_plugin.zip](./DynamodbOverCloudtrailPackage/DynamoDB/cloudtrail_codec_plugin.zip) plug-in. After it is uploaded, click **OK**. This is specifically for CloudTrail only. Other types of inputs do not require this file to be uploaded.
	* Select [logstash-filter-dynamodb_guardium_plugin_filter.zip](logstash-filter-dynamodb_guardium_plugin_filter.zip) plug-in. After it is uploaded, click **OK**.
4. Click the Plus sign to open the Connector Configuration dialog box.
5. Type a name in the **Connector name** field.
6. If the audit logs are to be fetched from CloudWatch, use the details from the [dynamodbCloudwatch.conf](DynamodbOverCloudwatchPackage/DynamoDB/dynamodbCloudwatch.conf)
   file. If the audit logs are to be fetched from CloudTrail, use the details from the [dynamodbCloudtrail.conf](DynamodbOverCloudtrailPackage/DynamoDB/dynamodbCloudtrail.conf) file. Update the input section to add the details from the corresponding file's input part, omitting the keyword "input{" at the beginning and its corresponding "}" at the end. More details on how to configure the relevant input plug-in can be found [here](../../input-plugin/logstash-input-cloudwatch-logs/README.md).
7. If the audit logs are to be fetched from CloudWatch, use the details from the [dynamodbCloudwatch.conf](DynamodbOverCloudwatchPackage/DynamoDB/dynamodbCloudwatch.conf)
   file. If the audit logs are to be fetched from CloudTrail, use the details from the [dynamodbCloudtrail.conf](DynamodbOverCloudtrailPackage/DynamoDB/dynamodbCloudtrail.conf) file. 
   Update the filter section to add the details from the corresponding file's input part, omitting the keyword "filter{" at the beginning and its corresponding "}"
   at the end.
8. The "type" fields should match in input and filter configuration sections. This field should be unique for every individual connector added.
9. Click **Save**. Guardium validates the new connector, and enables the universal connector if it was
   disabled. After it is validated, it appears in the Configure Universal Connector page.


## Configuring the dynamodb filters in Guardium Insights

Depending on your environment, see the instructions for configuring the DynamoDB filters in one of the following 
locations,

* Guardium Insights SaaS, follow [this guide](https://github.com/IBM/universal-connectors/blob/main/docs/Guardium%20Insights/SaaS_1.0/UC_Configuration_GI.md).
* Guardium Insights on-premises, follow [this guide](https://github.com/IBM/universal-connectors/blob/main/docs/Guardium%20Insights/3.2.x/UC_Configuration_GI.md).

In the input configuration section, refer to the CloudWatch_logs section.
