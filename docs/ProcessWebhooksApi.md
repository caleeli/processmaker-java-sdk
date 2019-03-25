# ProcessWebhooksApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessWebhook**](ProcessWebhooksApi.md#createProcessWebhook) | **POST** /processes/{process_id}/webhooks/ | Save a new webhook for a start node
[**deleteProcessWebhook**](ProcessWebhooksApi.md#deleteProcessWebhook) | **DELETE** /processes/{process_id}/webhooks/ | Delete (revoke) a webhook for a start node
[**getProcessWebhook**](ProcessWebhooksApi.md#getProcessWebhook) | **GET** /processes/{process_id}/webhooks/ | Get the webhook for a start node


<a name="createProcessWebhook"></a>
# **createProcessWebhook**
> createProcessWebhook(processId, node)

Save a new webhook for a start node

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessWebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessWebhooksApi apiInstance = new ProcessWebhooksApi();
Integer processId = 56; // Integer | ID of process
String node = "node_example"; // String | Start event node ID
try {
    apiInstance.createProcessWebhook(processId, node);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessWebhooksApi#createProcessWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **Integer**| ID of process |
 **node** | **String**| Start event node ID |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProcessWebhook"></a>
# **deleteProcessWebhook**
> deleteProcessWebhook(processId, node)

Delete (revoke) a webhook for a start node

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessWebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessWebhooksApi apiInstance = new ProcessWebhooksApi();
Integer processId = 56; // Integer | ID of process
String node = "node_example"; // String | Start event node ID
try {
    apiInstance.deleteProcessWebhook(processId, node);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessWebhooksApi#deleteProcessWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **Integer**| ID of process |
 **node** | **String**| Start event node ID |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProcessWebhook"></a>
# **getProcessWebhook**
> getProcessWebhook(processId, node)

Get the webhook for a start node

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessWebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessWebhooksApi apiInstance = new ProcessWebhooksApi();
Integer processId = 56; // Integer | ID of process
String node = "node_example"; // String | Start event node ID
try {
    apiInstance.getProcessWebhook(processId, node);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessWebhooksApi#getProcessWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **Integer**| ID of process |
 **node** | **String**| Start event node ID |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

