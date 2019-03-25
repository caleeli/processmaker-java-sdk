# ProcessRequestsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProcessRequest**](ProcessRequestsApi.md#deleteProcessRequest) | **DELETE** /requests/{process_request_id} | Delete a process request
[**getProcessRequestById**](ProcessRequestsApi.md#getProcessRequestById) | **GET** /requests/{process_request_id} | Get single process request by ID
[**getProcessesRequests**](ProcessRequestsApi.md#getProcessesRequests) | **GET** /requests | Returns all process Requests that the user has access to
[**updateProcessRequest**](ProcessRequestsApi.md#updateProcessRequest) | **PUT** /requests/{process_request_id} | Update a process request


<a name="deleteProcessRequest"></a>
# **deleteProcessRequest**
> ProcessRequest deleteProcessRequest(processRequestId)

Delete a process request

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessRequestsApi apiInstance = new ProcessRequestsApi();
String processRequestId = "processRequestId_example"; // String | ID of process request to return
try {
    ProcessRequest result = apiInstance.deleteProcessRequest(processRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessRequestsApi#deleteProcessRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processRequestId** | **String**| ID of process request to return |

### Return type

[**ProcessRequest**](ProcessRequest.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessRequestById"></a>
# **getProcessRequestById**
> ProcessRequest getProcessRequestById(processRequestId)

Get single process request by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessRequestsApi apiInstance = new ProcessRequestsApi();
String processRequestId = "processRequestId_example"; // String | ID of process request to return
try {
    ProcessRequest result = apiInstance.getProcessRequestById(processRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessRequestsApi#getProcessRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processRequestId** | **String**| ID of process request to return |

### Return type

[**ProcessRequest**](ProcessRequest.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessesRequests"></a>
# **getProcessesRequests**
> InlineResponse20014 getProcessesRequests(type, filter, orderBy, orderDirection, perPage, include)

Returns all process Requests that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessRequestsApi apiInstance = new ProcessRequestsApi();
String type = "type_example"; // String | Only return requests by type
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20014 result = apiInstance.getProcessesRequests(type, filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessRequestsApi#getProcessesRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Only return requests by type | [optional] [enum: all, in_progress, completed]
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]
 **include** | **String**| Include data from related models in payload. Comma seperated list. | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProcessRequest"></a>
# **updateProcessRequest**
> ProcessRequest updateProcessRequest(processRequestId, processRequestEditable)

Update a process request

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessRequestsApi apiInstance = new ProcessRequestsApi();
String processRequestId = "processRequestId_example"; // String | ID of process request to return
ProcessRequestEditable processRequestEditable = new ProcessRequestEditable(); // ProcessRequestEditable | 
try {
    ProcessRequest result = apiInstance.updateProcessRequest(processRequestId, processRequestEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessRequestsApi#updateProcessRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processRequestId** | **String**| ID of process request to return |
 **processRequestEditable** | [**ProcessRequestEditable**](ProcessRequestEditable.md)|  |

### Return type

[**ProcessRequest**](ProcessRequest.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

