# TaskAssignmentsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskAssignments**](TaskAssignmentsApi.md#createTaskAssignments) | **POST** /task_assignments | Save a new task assignments
[**updateTaskAssignments**](TaskAssignmentsApi.md#updateTaskAssignments) | **PUT** /task_assignments/{task_assignments_id} | Update a task assignments


<a name="createTaskAssignments"></a>
# **createTaskAssignments**
> TaskAssignments createTaskAssignments(taskAssignmentsEditable)

Save a new task assignments

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.TaskAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

TaskAssignmentsApi apiInstance = new TaskAssignmentsApi();
TaskAssignmentsEditable taskAssignmentsEditable = new TaskAssignmentsEditable(); // TaskAssignmentsEditable | 
try {
    TaskAssignments result = apiInstance.createTaskAssignments(taskAssignmentsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAssignmentsApi#createTaskAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskAssignmentsEditable** | [**TaskAssignmentsEditable**](TaskAssignmentsEditable.md)|  |

### Return type

[**TaskAssignments**](TaskAssignments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskAssignments"></a>
# **updateTaskAssignments**
> TaskAssignments updateTaskAssignments(taskAssignmentsId, taskAssignmentsEditable)

Update a task assignments

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.TaskAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

TaskAssignmentsApi apiInstance = new TaskAssignmentsApi();
String taskAssignmentsId = "taskAssignmentsId_example"; // String | ID of task assignment to return
TaskAssignmentsEditable taskAssignmentsEditable = new TaskAssignmentsEditable(); // TaskAssignmentsEditable | 
try {
    TaskAssignments result = apiInstance.updateTaskAssignments(taskAssignmentsId, taskAssignmentsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAssignmentsApi#updateTaskAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskAssignmentsId** | **String**| ID of task assignment to return |
 **taskAssignmentsEditable** | [**TaskAssignmentsEditable**](TaskAssignmentsEditable.md)|  |

### Return type

[**TaskAssignments**](TaskAssignments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

