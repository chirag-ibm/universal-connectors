/*
� Copyright IBM Corp. 2021, 2022 All rights reserved.
SPDX-License-Identifier: Apache-2.0
*/
package com.ibm.guardium.apachesolrdb;

public class ApplicationConstantTest {

	public static final String TIMESTAMP_VALUE = "2022-02-09 06:44:21.089";
	public static final String QUERYSTRING_VALUE = "{commitWithin=1000&overwrite=true&wt=json&_=1644230869164}";
	public static final String COLLECTION_VALUE = "c:firstdemo s:shard2 r:core_node8 x:firstdemo_shard2_replica_n6";
	public static final String SERVERHOSTNAME_VALUE = "apachesolronazure";
	public static final String SERVERIP_VALUE = "10.1.0.4";
	public static final String SERVER_IPv6_VALUE = "fe80::222:48ff:fe2d:b53b";
	public static final String INCORRECT_TIMESTAMP_VALUE = "2022-02-0906:49:31.070";
	public static final String SERVEROS_VALUE = "Ubuntu";
	public static final String LOG_INFO_VALUE = "INFO";
	public static final String INVALID_VERB = "INVALID";
	public static final String LOG_ERROR_VALUE = "ERROR";
	public static final String ERRORMSG_VALUE = "o.a.s.h.RequestHandlerBase org.apache.solr.common.SolrException:Cannot parse provided JSON: Expected key,value separator ':': char=;,position=7 AFTER='[{ \\\\\\\"id\\\\\\\";' BEFORE='yyashi, \\\\\\\"name\\\\\\\":\\\\\\\"ashi\\\\\\\"}]'";
	public static final String PATH_CREATE_VALUE = "CREATE";
	public static final String PATH_RENAME_VALUE = "RENAME";
	public static final String PATH_DELETE_VALUE = "DELETE";
	public static final String PATH_UPDATE_VALUE = "/update";
	public static final String UPDATE_CLASS_VALUE = "o.a.s.u.p.LogUpdateProcessorFactory";
	public static final String SOLR_QTP_ERROR_STRING_VALUE = "o.a.s.h.RequestHandlerBase org.apache.solr.common.SolrException";
	public static final String USERNAME_VALUE = "solr";
	public static final String WEBAPP_VALUE = "/solr";
	public static final String WEBAPP_VALUE_NULL = "null";
	public static final String PATH_SELECT_VALUE = "/select";
	public static final String PATH_SQL_VALUE = "sql";
	public static final String QUERYSTRING_ADD_VALUE = "{commitWithin=1000&overwrite=true&wt=json&_=1643965367564}{add=[yashi (1724179189492350976)]} 0 30";
	public static final String QUERYSTRING_SELECT_VALUE = "{q=id:401&_=1644230860222}";
	public static final String QUERYSTRING_DELETE_VALUE = "{commitWithin=1000&overwrite=true&wt=json&_=1648123036274}{delete=[1234 (-1728273303680843776)]}";
	public static final String QUERYSTRING_CORECREATE_VALUE = "{name=Solr_***REMOVED***mple_core&action=CREATE&instanceDir=Solr_***REMOVED***mple_core&wt=json}";
	public static final String QUERYSTRING_COREUPDATE_VALUE = "{core=Solr_***REMOVED***mple_core&other=Sample&action=RENAME}";
	public static final String QUERYSTRING_COREDELETE_VALUE = "{deleteInstanceDir=true&core=Solr_***REMOVED***mple_core&deleteDataDir=true&action=UNLOAD&wt=json&deleteIndex=true}";
	public static final String HTTP_SOLR_CALL_VALUE = "o.a.s.s.HttpSolrCall";
	public static final String SOLR_QTP_REQUEST_VALUE = "o.a.s.c.S.Request";
	public static final String ERROR_DESCRIPTION = "o.a.s.h.RequestHandlerBase org.apache.solr.common.SolrException:Cannot parse provided JSON: Expected key,value separator ':': char=;,position=7 AFTER='[{ \\\"id\\\";' BEFORE='yyashi, \\\"name\\\":\\\"ashi\\\"}]'";
	public static final String REQUEST_SEARCH_VALUE = "SEARCH";
	public static final String SERVER_TYPE_VALUE = "SolrDB";
	public static final String STATUS_VALUE = "400";
	public static final String QUERYSTRING_SHARD_ADD_VALUE = "{}{add=[adata, apple, asus, ati, belkin, canon, cor***REMOVED***ir, dell, maxtor, ***REMOVED***msung, ... (11 adds)]}";
	public static final String COLLECTION_SHARD_VALUE = "c:techproducts s:shard2 r:core_node8 x:techproducts_shard2_replica_n6";
	public static final String QUERYSTRING_COLLECTIONUPDATE_VALUE = "{name=films&action=RENAME&target=rfilms}";
	public static final String COLLECTION_ERRORMSG_VALUE = "o.a.s.c.a.c.OverseerCollectionMes***REMOVED***geHandler Collection: renamedTest3 operation: delete failed => org.apache.solr.common.SolrException: Collection : renamedTest3 is part of aliases: [Test3], remove or modify the aliases before removing this collection.";
	public static final String QUERYSTRING_CREATECOLLECTION_VALUE = "{replicationFactor=2&maxShardsPerNode=-1&collection.configName=techproducts&name=techproducts&action=CREATE&numShards=2&wt=json}";
	public static final String ADMIN_COLLECTION_VALUE = "/admin/collections";
	public static final String QUERYSTRING_RENAMECOLLECTION_VALUE = "{name=films&action=RENAME&target=rfilms}";
	public static final String QUERYSTRING_DELETECOLLECTION_VALUE = "{name=Test3&action=DELETE}";
	public static final String QUERYSTRING_LISTCOLLECTION_VALUE = "{action=LIST}";
	public static final String QUERYSTRING_SKIP_LISTCOLLECTION_VALUE = "{action=LIST&wt=json&_=1652856928210}";
	public static final String QUERYSTRING_COLLECTION_PROP_VALUE = "{propertyName=name&name=proptest&action=COLLECTIONPROP&propertyValue=testprop1}";
	public static final String QUERYSTRING_COLLECTION_STATUS_VALUE = "{action=COLSTATUS&sizeInfo=true&collection=proptest&fieldInfo=true&coreInfo=true&segments=true}";
	public static final String QUERYSTRING_MODIFY_COLLECTION_VALUE = "{replicationFactor=1&action=MODIFYCOLLECTION&numShards=2&collection=proptest}";
	public static final String QUERYSTRING_RELOAD_COLLECTION_VALUE = "{name=proptest&action=RELOAD}";
	public static final String QUERYSTRING_COLLECTION_MIGRATE_VALUE = "{split.key=a!&target.collection=Test111&action=MIGRATE&collection=proptest&wt=xml}";
	public static final String QUERYSTRING_COLLECTION_REINDEX_VALUE = "{name=Test111&action=REINDEXCOLLECTION} ";
	public static final String QUERYSTRING_COLLECTION_BACKUP_VALUE = "{name=myBackupName2&action=BACKUP&location=C:\\SolrCloud\\solr-8.11.1\\example\\cloud\\node1\\solr&collection=Test111}";
	public static final String QUERYSTRING_COLLECTION_RESTORE_VALUE = "{name=myBackupName2&action=RESTORE&location=C:\\SolrCloud\\solr-8.11.1\\example\\cloud\\node1\\solr&collection=myRestoredCollectionName}";
	public static final String QUERYSTRING_COLLECTION_REBALANCELEADERS_VALUE = "{action=REBALANCELEADERS&collection=proptest&wt=json}";
	public static final String QUERYSTRING_SPLIT_SHARD_VALUE = "{action=SPLITSHARD&collection=demo&shard=shard1&wt=xml}";
	public static final String QUERYSTRING_DELETE_SHARD_VALUE = "{action=DELETESHARD&collection=demo&shard=shard1&wt=xml}";
	public static final String QUERYSTRING_FORCE_LEADER_VALUE = "{action=FORCELEADER&collection=demo1&shard=shard1}";
	public static final String QUERYSTRING_REQUEST_STATUS_VALUE = "{requestid=1000&action=REQUESTSTATUS}";
	public static final String QUERYSTRING_CREATE_SHARD_VALUE = "{action=CREATESHARD&shard=shardName&collection=demo1}";
	public static final String QUERYSTRING_ADD_REPLICA_VALUE = "{node=192.168.43.197:8983_solr&action=ADDREPLICA&collection=films&shard=shard1&wt=xml}";
	public static final String QUERYSTRING_MOVE_REPLICA_VALUE = "{sourceNode=192.168.43.197:8983_solr&replica=core_node7&action=MOVEREPLICA&collection=films&shard=shard1&targetNode=192.168.43.197:8983_solr}";
	public static final String QUERYSTRING_DELETE_REPLICA_VALUE = "{replica=core_node2&action=DELETEREPLICA&collection=demo&shard=shard1&wt=xml}";
	public static final String QUERYSTRING_ADD_REPLICAPROP_VALUE = "{replica=core_node2&property.value=special&property=special&action=ADDREPLICAPROP&collection=films&shard=shard1}";
	public static final String QUERYSTRING_DELETE_REPLICAPROP_VALUE = "{replica=core_node2&property=preferredLeader&action=DELETEREPLICAPROP&shard=shard1&collection=films&wt=xml}";
	public static final String QUERYSTRING_CREATE_ALIAS_VALUE = "{collections=demo,demo1&name=testalias&action=CREATEALIAS&wt=xml}";
	public static final String QUERYSTRING_LIST_ALIAS_VALUE = "{action=LISTALIASES&wt=xml}";
	public static final String QUERYSTRING_ALIAS_PROP_VALUE = "{name=testalias&action=ALIASPROP&property.otherKey=otherValue&wt=xml&property.someKey=someValue}";
	public static final String QUERYSTRING_DELETE_ALIAS_VALUE = "{name=testalias&action=DELETEALIAS&wt=xml}";
	public static final String QUERYSTRING_CLUSTER_STATUS_VALUE = "{action=CLUSTERSTATUS}";
	public static final String QUERYSTRING_CLUSTER_PROP_VALUE = "{val=https&name=urlScheme&action=CLUSTERPROP&wt=xml}";
	public static final String QUERYSTRING_BALANCE_SHARD_UNIQUE_VALUE = "{property=preferredLeader&action=BALANCESHARDUNIQUE&collection=proptest&wt=xml}";
	public static final String QUERYSTRING_UTILIZE_NODE_VALUE = "{node=192.168.43.197:8983_solr&action=UTILIZENODE}";
	public static final String QUERYSTRING_REPLACE_NODE_VALUE = "{sourceNode=192.168.43.197:8983_solr&action=REPLACENODE&targetNode=192.168.43.197:8983_solr}";
	public static final String QUERYSTRING_DELETE_NODE_VALUE = "{node=192.168.43.197:8983_solr&action=DELETENODE}";
	public static final String QUERYSTRING_REMOVE_ROLE_VALUE = "{node=192.168.43.197:8983_solr&role=overseer&action=REMOVEROLE}";
	public static final String QUERYSTRING_ADD_ROLE_VALUE = "{node=node2&role=overseer&action=ADDROLE}";
	public static final String QUERYSTRING_OVERSEERSTATUS_VALUE = "{action=OVERSEERSTATUS}";
	public static final String QUERYSTRING_MIGRATESTATEFORMAT_VALUE = "{action=MIGRATESTATEFORMAT&collection=proptest}";
	public static final String QUERYSTRING_CORE_STATUS_VALUE = "{core=Product&action=STATUS}";
	public static final String QUERYSTRING_SPLIT_CORE_VALUE = "{core=testnew&action=SPLIT&targetCore=second_collection}";
	public static final String QUERYSTRING_SWAP_CORE_VALUE = "{core=testnew&other=TestCore&action=SWAP}";
	public static final String EXPECTED_SELECT_VALUE = "select";
	public static final String EXPECTED_UPDATE_VALUE = "update";
	public static final String EXPECTED_COLLECTION_VALUE = "firstdemo";
	public static final String QUERYSTRING_SPELL_VALUE = "{df=text&spellcheck.q=dell+ultra+sharp&spellcheck.collateParam.q.op=AND&spellcheck=true&wt=xml}";
	public static final String QUERYSTRING_SKIP_LIST_ALIAS_VALUE = "{action=LISTALIASES&wt=xml&wt=json}";
	public static final String SQL_ERRORMSG_VALUE = "o.a.s.c.s.i.s.ExceptionStream java.io.IOException: Failed to execute sqlQuery 'Select name,title from new_collection limit 1000' against JDBC connection 'jdbc:calcitesolr:'.";
	public static final String EXCEPTIONSTREAM_VALUE ="o.a.s.c.s.i.s.ExceptionStream java.io.IOException:Failed to execute sqlQuery 'select views, max(views) as mv, max(dislikes) as md, max(likes) as ml, max(comments) as mc, author\nfrom firstcoll\nwhere ((comments >= 0) or (likes >= 0) or (views >= 0) or (dislikes >= 0))\ngroup by author, views\nhaving views > 1000\norder by mv asc\nlimit 1050' against JDBC connection 'jdbc:calcitesolr:'.";
	public static final String LEXICAL_ERRORMSG_VALUE ="o.a.s.h.RequestHandlerBase org.apache.solr.common.SolrException: org.apache.solr.search.SyntaxError: Cannot parse '!@#$%^&*()': Lexical error at line 1, column 7.  Encountered: \\\"&\\\" (38), after : \\\"\\\" => org.apache.solr.common.SolrException: org.apache.solr.search.SyntaxError: Cannot parse '!@#$%^&*()': Lexical error at line 1, column 7.";
	public static final Object KEY_CORE_VALUE = "demo_collection";
	public static final Object REDACTED_VALUE ="o.a.s.s.HttpSolrCall [admin] webapp=null path=/admin/cores params={core=?&other=?&action=?}";
	public static final String ADMIN_CORE_VALUE = "/admin/cores";
	public static final Object KEY_CORE_ADMIN_VALUE = "admin";
	public static final Object KEY_CORE_BLANK_VALUE = "";
	public static final Object WEBAPP_FOR_FULLSQL_VALUE = "webapp";
	public static final Object PATH_FOR_FULLSQL_VALUE = "path";
	public static final Object PARAMS_VALUE = "params=";

}
