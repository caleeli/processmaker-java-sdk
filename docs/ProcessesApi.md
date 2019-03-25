# ProcessesApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcess**](ProcessesApi.md#createProcess) | **POST** /processes | Save a new process
[**deleteProcess**](ProcessesApi.md#deleteProcess) | **DELETE** /processes/{processId} | Delete a process
[**exportProcess**](ProcessesApi.md#exportProcess) | **GET** /processes/{processId}/export | Export a single process by ID
[**getProcessById**](ProcessesApi.md#getProcessById) | **GET** /processes/{processId} | Get single process by ID
[**getProcesses**](ProcessesApi.md#getProcesses) | **GET** /processes | Returns all processes that the user has access to
[**importProcess**](ProcessesApi.md#importProcess) | **POST** /processes/import | Import a new process
[**restoreProcess**](ProcessesApi.md#restoreProcess) | **PUT** /processes/{processId}/restore | Restore an inactive process
[**startProcesses**](ProcessesApi.md#startProcesses) | **GET** /start_processes | Returns the list of processes that the user can start
[**triggerStartEvent**](ProcessesApi.md#triggerStartEvent) | **POST** /process_events/{process_id} | Start a new process
[**updateProcess**](ProcessesApi.md#updateProcess) | **PUT** /processes/{processId} | Update a process


<a name="createProcess"></a>
# **createProcess**
> Process createProcess(processEditable)

Save a new process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
ProcessEditable processEditable = new ProcessEditable(); // ProcessEditable | 
try {
    Process result = apiInstance.createProcess(processEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#createProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processEditable** | [**ProcessEditable**](ProcessEditable.md)|  |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcess"></a>
# **deleteProcess**
> Process deleteProcess(processId)

Delete a process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
try {
    Process result = apiInstance.deleteProcess(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#deleteProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportProcess"></a>
# **exportProcess**
> Process exportProcess(processId)

Export a single process by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
try {
    Process result = apiInstance.exportProcess(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#exportProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessById"></a>
# **getProcessById**
> Process getProcessById(processId)

Get single process by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
try {
    Process result = apiInstance.getProcessById(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#getProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcesses"></a>
# **getProcesses**
> InlineResponse20012 getProcesses(filter, orderBy, orderDirection, perPage, status, include)

Returns all processes that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String status = "active"; // String | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20012 result = apiInstance.getProcesses(filter, orderBy, orderDirection, perPage, status, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#getProcesses");
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
 **status** | **String**|  | [optional] [default to active] [enum: active, inactive]
 **include** | **String**| Include data from related models in payload. Comma seperated list. | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importProcess"></a>
# **importProcess**
> Process importProcess(file)

Import a new process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
File file = new File("null"); // File | file to upload
try {
    Process result = apiInstance.importProcess(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#importProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**File**](File.md)| file to upload | [default to null]

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="restoreProcess"></a>
# **restoreProcess**
> Process restoreProcess(processId, processEditable)

Restore an inactive process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
ProcessEditable processEditable = new ProcessEditable(); // ProcessEditable | 
try {
    Process result = apiInstance.restoreProcess(processId, processEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#restoreProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |
 **processEditable** | [**ProcessEditable**](ProcessEditable.md)|  |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startProcesses"></a>
# **startProcesses**
> InlineResponse20013 startProcesses(orderBy, orderDirection, perPage, include)

Returns the list of processes that the user can start

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20013 result = apiInstance.startProcesses(orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#startProcesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]
 **include** | **String**| Include data from related models in payload. Comma seperated list. | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="triggerStartEvent"></a>
# **triggerStartEvent**
> ProcessRequest triggerStartEvent(processId, event, body)

Start a new process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
String event = "event_example"; // String | Node ID of the start event
Object body = null; // Object | 
try {
    ProcessRequest result = apiInstance.triggerStartEvent(processId, event, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#triggerStartEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |
 **event** | **String**| Node ID of the start event |
 **body** | **Object**|  | [optional]

### Return type

[**ProcessRequest**](ProcessRequest.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcess"></a>
# **updateProcess**
> Process updateProcess(processId, processEditable)

Update a process

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessesApi apiInstance = new ProcessesApi();
String processId = "processId_example"; // String | ID of process to return
ProcessEditable processEditable = new ProcessEditable(); // ProcessEditable | 
try {
    Process result = apiInstance.updateProcess(processId, processEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#updateProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to return |
 **processEditable** | [**ProcessEditable**](ProcessEditable.md)|  |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

