# FilesApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /requests/{request_id}/files | Save a new media file
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /requests/{request_id} | Delete a media file
[**getFiles**](FilesApi.md#getFiles) | **GET** /requests/{request_id}/files | Returns the list of files associated to a request
[**getFilesById**](FilesApi.md#getFilesById) | **GET** /requests/{request_id}/files/{file_id} | Get a file uploaded to a request
[**updateFile**](FilesApi.md#updateFile) | **PUT** /requests/{request_id}/files/{file_id} | Update a media file


<a name="createFile"></a>
# **createFile**
> InlineResponse2003 createFile(requestId, inlineObject, mediaId, media)

Save a new media file

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String requestId = "requestId_example"; // String | ID of the request
InlineObject inlineObject = new InlineObject(); // InlineObject | 
Integer mediaId = 56; // Integer | ID of the model to which the file will be associated
String media = "media_example"; // String | Name of the class of the model
try {
    InlineResponse2003 result = apiInstance.createFile(requestId, inlineObject, mediaId, media);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| ID of the request |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |
 **mediaId** | **Integer**| ID of the model to which the file will be associated | [optional]
 **media** | **String**| Name of the class of the model | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(requestId)

Delete a media file

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String requestId = "requestId_example"; // String | ID of the request
try {
    apiInstance.deleteFile(requestId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| ID of the request |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFiles"></a>
# **getFiles**
> InlineResponse2002 getFiles(requestId, filter, orderBy, orderDirection, perPage)

Returns the list of files associated to a request

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String requestId = "requestId_example"; // String | ID of the request
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
try {
    InlineResponse2002 result = apiInstance.getFiles(requestId, filter, orderBy, orderDirection, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#getFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| ID of the request |
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFilesById"></a>
# **getFilesById**
> Groups getFilesById(fileId, requestId)

Get a file uploaded to a request

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | ID of the file to return
String requestId = "requestId_example"; // String | ID of the request
try {
    Groups result = apiInstance.getFilesById(fileId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#getFilesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| ID of the file to return |
 **requestId** | **String**| ID of the request |

### Return type

[**Groups**](Groups.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFile"></a>
# **updateFile**
> InlineResponse2004 updateFile(fileId, requestId, inlineObject1)

Update a media file

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | ID of the file to update
String requestId = "requestId_example"; // String | ID of the request
InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
try {
    InlineResponse2004 result = apiInstance.updateFile(fileId, requestId, inlineObject1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#updateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| ID of the file to update |
 **requestId** | **String**| ID of the request |
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

