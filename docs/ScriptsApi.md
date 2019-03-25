# ScriptsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScript**](ScriptsApi.md#createScript) | **POST** /scripts | Save a new script
[**deleteScript**](ScriptsApi.md#deleteScript) | **DELETE** /scripts/scriptsId | Delete a script
[**duplicateScreen**](ScriptsApi.md#duplicateScreen) | **PUT** /scripts/scriptsId/duplicate | duplicate a script
[**getScripts**](ScriptsApi.md#getScripts) | **GET** /scripts | Returns all scripts that the user has access to
[**getScriptsById**](ScriptsApi.md#getScriptsById) | **GET** /scripts/scriptsId | Get single script by ID
[**getScriptsPreview**](ScriptsApi.md#getScriptsPreview) | **GET** /scripts/{script_id}/preview | Test script code without saving it
[**updateScript**](ScriptsApi.md#updateScript) | **PUT** /scripts/scriptsId | Update a script


<a name="createScript"></a>
# **createScript**
> Scripts createScript(scriptsEditable)

Save a new script

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
ScriptsEditable scriptsEditable = new ScriptsEditable(); // ScriptsEditable | 
try {
    Scripts result = apiInstance.createScript(scriptsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#createScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptsEditable** | [**ScriptsEditable**](ScriptsEditable.md)|  |

### Return type

[**Scripts**](Scripts.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScript"></a>
# **deleteScript**
> Scripts deleteScript(scriptId)

Delete a script

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | ID of script to return
try {
    Scripts result = apiInstance.deleteScript(scriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#deleteScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptId** | **String**| ID of script to return |

### Return type

[**Scripts**](Scripts.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="duplicateScreen"></a>
# **duplicateScreen**
> Scripts duplicateScreen(screensId, screensEditable)

duplicate a script

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String screensId = "screensId_example"; // String | ID of script to return
ScreensEditable screensEditable = new ScreensEditable(); // ScreensEditable | 
try {
    Scripts result = apiInstance.duplicateScreen(screensId, screensEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#duplicateScreen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensId** | **String**| ID of script to return |
 **screensEditable** | [**ScreensEditable**](ScreensEditable.md)|  |

### Return type

[**Scripts**](Scripts.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScripts"></a>
# **getScripts**
> InlineResponse20017 getScripts(filter, orderBy, orderDirection, perPage, include)

Returns all scripts that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20017 result = apiInstance.getScripts(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScripts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]
 **include** | **String**| Include data from related models in payload. Comma seperated list. | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScriptsById"></a>
# **getScriptsById**
> Scripts getScriptsById(scriptId)

Get single script by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | ID of script to return
try {
    Scripts result = apiInstance.getScriptsById(scriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptId** | **String**| ID of script to return |

### Return type

[**Scripts**](Scripts.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScriptsPreview"></a>
# **getScriptsPreview**
> Object getScriptsPreview(scriptId, data, config, code)

Test script code without saving it

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
Integer scriptId = 56; // Integer | 
String data = "data_example"; // String | 
String config = "config_example"; // String | 
String code = "code_example"; // String | 
try {
    Object result = apiInstance.getScriptsPreview(scriptId, data, config, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptId** | **Integer**|  |
 **data** | **String**|  | [optional]
 **config** | **String**|  | [optional]
 **code** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScript"></a>
# **updateScript**
> Scripts updateScript(scriptId, scriptsEditable)

Update a script

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | ID of script to return
ScriptsEditable scriptsEditable = new ScriptsEditable(); // ScriptsEditable | 
try {
    Scripts result = apiInstance.updateScript(scriptId, scriptsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#updateScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptId** | **String**| ID of script to return |
 **scriptsEditable** | [**ScriptsEditable**](ScriptsEditable.md)|  |

### Return type

[**Scripts**](Scripts.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

