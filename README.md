<details open="open">
  <summary>Table of Contents</summary>

  - [Overview](#overview)
  - [How it works](#how-it-works)
  - [Available Univer***REMOVED***l Connector Plugins](#univer***REMOVED***l-connector-plugins)
  - [Using Univer***REMOVED***l Connector Plugins](#using-univer***REMOVED***l-connector-plugins)
  - [Packaging Guardium Insights Univer***REMOVED***l Connector Plugins](#packaging-univer***REMOVED***l-connector-plugins)
  - [Creating custom Univer***REMOVED***l Connector Plugins](#creating-custom-univer***REMOVED***l-connector-plugins)
  - [Contributing](#contributing)
  - [Contact us](#contact-us)
  - [Licensing](#licensing)

</details>

## Overview

The Univer***REMOVED***l Connector framework assists data security teams by providing a method to agentlessly collect activity and audit log data from a variety cloud and on-premise data sources.
- Easy to setup and configure
- Simple to maintain
- Normalizes collected data - making it consumable for security applications

An important note: only the plug-ins which appear in verifiedUCPlugins.txt are supported in Guardium Insights. The rest are only supported in Guardium GDP.

## How it works
Univer***REMOVED***l Connectors consist of series of three plugins within a [Logstash pipeline](https://www.elastic.co/guide/en/logstash/current/pipeline.html) that ingest, filter, and output events in a normalized, common format:

1) **Input Plugin**: Settings to pull events from APIs or receive push of events.
2) **Filter Plugin**: Parses, filters, and modifies events into a common format.
3) **Output Plugin**: Sends normalized events to locations to be consumed by security applications.

![Univer***REMOVED***l Connector - Logstash Pipeline](/docs/images/uc_overview.png)

Univer***REMOVED***l Connector plugins are packaged and deployed in a Docker container environment.

[Technical Demo](https://youtu.be/LAYhVoYMb28)

## Univer***REMOVED***l Connector Plugins

[View all available plugins](/docs/available_plugins.md)

## Using Univer***REMOVED***l Connector Plugins
- [In Guardium Data Protection](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/cfg_overview.html)
- [In Guardium Insights](https://www.ibm.com/docs/en/guardium-insights/3.0.x?topic=connector-configuring-univer***REMOVED***l)

## Packaging Univer***REMOVED***l Connector Plugins for use in Guardium Insights
Note: Pre-packaged plugins can be downloaded from [here](https://github.com/IBM/univer***REMOVED***l-connectors/releases)
1) **Clone univer***REMOVED***l-connectors project**: git clone https://github.com/IBM/univer***REMOVED***l-connectors.git
2) **Enter univer***REMOVED***l-connector project folder**: cd /path/to/univer***REMOVED***l-connectors
3) **Run packagePluginsForGuardiumInsights.sh script**: sh packagePluginsForGuardiumInsights.sh
4) **Find required plugins in packagedPlugins**: ls packagedPlugins

## Creating custom Univer***REMOVED***l Connector Plugins
- [Configuring native audit on the data source](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/cfg_native_audit_data_source.html)
- [Developing a filter plugin](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/develop_filter_plugin.html)
- [Create](https://www.elastic.co/guide/en/logstash/current/input-new-plugin.html) or use an [existing (recommended)](https://www.elastic.co/guide/en/logstash/current/input-plugins.html) input plugin
- [Testing a filter plugin in a development environment](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/test_filter_dev_env.html)
- [Installing and testing the filter or input plugin on a staging Guardium system](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/test_filter_guardium.html)
- [Publishing your plugin](https://www.ibm.com/support/knowledgecenter/SSMPHH_11.3.0/com.ibm.guardium.doc.stap/guc/publish_plugin.html)

## Contributing
To make your connector plugin available to the community, submit your connector for IBM Certification.
- [Guidelines for contributing](CONTRIBUTING.md)
- Benefits include:
  - Free, comprehensive testing and certification
  - Extending the reach of a product, feature, or function
  - Driving u***REMOVED***ge of a product or solution
- We also accept currency updates or bug fixes from the community for any existing connector plugins.

## Contact Us
If you have find any problems or want to make suggestions for future features please create [issues and suggestions on Github](https://github.com/IBM/univer***REMOVED***l-connectors/issues).


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
