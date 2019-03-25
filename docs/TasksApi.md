# TasksApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTasks**](TasksApi.md#getTasks) | **GET** /tasks | Returns all tasks that the user has access to
[**updateTask**](TasksApi.md#updateTask) | **PUT** /tasks/{task_id} | Update a task


<a name="getTasks"></a>
# **getTasks**
> InlineResponse20018 getTasks(processRequestId, filter, orderBy, orderDirection)

Returns all tasks that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

TasksApi apiInstance = new TasksApi();
Integer processRequestId = 56; // Integer | Process request id
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
try {
    InlineResponse20018 result = apiInstance.getTasks(processRequestId, filter, orderBy, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processRequestId** | **Integer**| Process request id | [optional]
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTask"></a>
# **updateTask**
> ProcessRequestToken updateTask(taskId, processRequestTokenEditable)

Update a task

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | ID of task to update
ProcessRequestTokenEditable processRequestTokenEditable = new ProcessRequestTokenEditable(); // ProcessRequestTokenEditable | 
try {
    ProcessRequestToken result = apiInstance.updateTask(taskId, processRequestTokenEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to update |
 **processRequestTokenEditable** | [**ProcessRequestTokenEditable**](ProcessRequestTokenEditable.md)|  |

### Return type

[**ProcessRequestToken**](ProcessRequestToken.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

