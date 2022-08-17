<details open="open">
  <summary>Table of contents</summary>

  - [Overview](#overview)
  - [How it works](#how-it-works)
  - [Deploying univer***REMOVED***l connector](#deploying-univer***REMOVED***l-connector)
  - [Monitoring univer***REMOVED***l connector  connections](#monitoring-univer***REMOVED***l-connector-connections)
  - [Policies](#policies)
  - [Known limitations](#known-limitations)
  - [FAQs](#faqs)
  - [Developing plug-ins](developing-plug-ins)
  - [Packaging Guardium Insights univer***REMOVED***l connector plug-ins](#packaging-guardium-insights-univer***REMOVED***l-connector-plug-ins)
  - [Creating custom univer***REMOVED***l connector plug-ins](#creating-custom-univer***REMOVED***l-connector-plug-ins)
  - [Contributing](#contributing)
  - [Contact us](#contact-us)
  - [Licensing](#licensing)

</details>

## Overview

The Guardium univer***REMOVED***l connector enables Guardium Data Protection and Guardium Insights to get data from potentially any data source's native activity logs without using S-TAPs. The Guardium Univer***REMOVED***l Connector includes support for MongoDB, MySQL, and Amazon S3, requiring minimal configuration. Users can easily develop plug-ins for other data sources, and install them in Guardium.

Figure 1. Guardium univer***REMOVED***l connector architecture

![Univer***REMOVED***l Connector](/docs/images/guc.jpg)

data flow from input plugin to guardium sniffer

The Guardium univer***REMOVED***l connector supports many platforms and connectivity options. It supports pull and push modes, multi-protocols, on-premises, and cloud platforms. For the data sources with pre-defined plug-ins, you configure Guardium to accept audit logs from the data source.

For data sources that do not have pre-defined plug-ins, you can customize the filtering and parsing components of audit trails and log formats. The open architecture enables reuse of prebuilt filters and parsers, and creation of shared library for the Guardium community.

The Guardium univer***REMOVED***l connector identifies and parses the received events, and converts them to a standard Guardium format. The output of the Guardium univer***REMOVED***l connector is forwarded to the Guardium sniffer on the collector, for policy and auditing enforcements. The Guardium policy, as usual, determines whether the activities are legitimate or not, when to alert, and the auditing level per activity.

The Guardium univer***REMOVED***l connector scales by adding Guardium collectors. It has a load-balancing and fail-over mechanism among multiple Guardium collectors.

Connections to databases that are configured with the Guardium univer***REMOVED***l connector are handled the ***REMOVED***me as all other datasources in Guardium. You can apply policies, view reports, monitor connections, for example.

## How it works

The Univer***REMOVED***l Connectors consist of a series of three plug-ins within a Logstash pipeline that ingest, filter, and output events in a normalized, common format:

1. Input plug-in: Settings to pull events from APIs or receive push of events.

2. Filter plug-in: Parses, filters, and modifies events into a common format.

3. Output plug-in: Sends normalized events to locations to be consumed by security applications.

![Univer***REMOVED***l Connector - Logstash pipeline](/docs/images/uc_overview.png)

Univer***REMOVED***l Connector plug-ins are packaged and deployed in a Docker container environment.

[Technical demo](https://youtu.be/LAYhVoYMb28)

## Deploying Univer***REMOVED***l Connector

Overall, deploying the univer***REMOVED***l connector involves the following workflow:

a. uploading and installing a plugin

b. configuring native auditing on the data source

c. sending native audit logs to the univer***REMOVED***l connector (not all plugins require this)

d. configuring the univer***REMOVED***l connector to read the native audit logs

However, the specific steps for each workflow may differ slightly per different data sources. See our [list of of available plugins](https://github.com/IBM/univer***REMOVED***l-connectors/blob/main/docs/available_plugins.md) to view detailed, step-by-step instructions for each supported data source/plug-in.


## Monitoring UC connections

The Univer***REMOVED***l connector is monitored via tools that are already familiar to Guardium Data Protection and Guardium Insights users. As well as some unique tools that can be found in the following links. 

a. [Monitoring UC connections in Guardium Data Protection](/docs/monitoring_gdp.md)

b. [Monitoring UC connections in Guardium Data Protection](/docs/monitoring_gi.md)

## Policies

With a few exceptions, using data from the univer***REMOVED***l connector is no different than using data from any other source in Guardium Data Protection or Guardium Insights. For Guardium Data Protection, there are a few unique policies that can be found in this link:

a. [separate readme for  GDP UC policies, based off existing GDP doc]


## Known limitations

The univer***REMOVED***l connector has the following known limitations:

### Guardium Data Protection

 * When configuring univer***REMOVED***l connectors, only use port numbers higher than 5000. Use a new port for each future connection.

* S3 SQS and S3 Cloudwatch plug-ins are not supported on IPV6 Guardium systems.

* The DynamoDB plug-in does not support IPV6.

* MySQL plug-ins do not send the DB name to Guardium, if the DB commands are performed by using MySQL native client.

* When connected with a MySQL plug-in, queries for non-existent tables are not logged to GDM_CONSTRUCT.

* MongoDB plug-ins do not send the client source program to Guardium.

* Use only the packages that are supplied by IBM. Do not use extra spaces in the title.

***Limitations associated with specific datasources are described in the UC plugin readme files for each datasource***

### Guardium Insights

Known limitations for Guardium insights can be found in the UC plugin readme files for each datasource



## FAQs

[Here](docs/faqs_gdp.md) is a list of frequently asked questions for Guardium Data Protection. 

[Here](docs/faqs_gi.md) is a list of frequently asked questions for Guardium Insights. 

***Need to decide if it's 2 seperate readmes for GDP and GI, or one readme with 2 different sections- GDP and GI. Possibly a 3rd section- univer***REMOVED***l, overlapping FAQs for GDP AND GI.***

## Developing plug-ins

Users can develop their own univer***REMOVED***l connector plugins, if needed, and contribute them back to the open source project, if desired. 

[Here](docs/developing_plugins_gdp.md) is a guide for developing new plug-ins for Guardium Data Protection. 

[Here](docs/developing_plugins_gi.md) is a guide for developing new plug-ins for Guardium Insights. 

### To make your connector plug-in available to the community, submit your connector to this repository for IBM Certification. We also accept updates or bug fixes to existing plug-ins, to keep them current:

### - [Guidelines for contributing](CONTRIBUTING.md)
### - Benefits include:

  **- Free, comprehensive testing and certification.**
  
  **- Expanding the reach of product APIs.** 
  
  **- Driving u***REMOVED***ge of a product or solution.**


## Contact Us
If you find any problems or want to make suggestions for future features, please create [issues and suggestions on Github](https://github.com/IBM/univer***REMOVED***l-connectors/issues).


## Licensing

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
