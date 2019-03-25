# CommentsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComments**](CommentsApi.md#createComments) | **POST** /comments | Save a new comment
[**deleteComments**](CommentsApi.md#deleteComments) | **DELETE** /comments/id | Delete a comments
[**getCommentById**](CommentsApi.md#getCommentById) | **GET** /comments/commentId | Get single comment by ID
[**getComments**](CommentsApi.md#getComments) | **GET** /comments | Returns all comments for a given type
[**updateComment**](CommentsApi.md#updateComment) | **PUT** /comments/commentId | Update a comment


<a name="createComments"></a>
# **createComments**
> Comments createComments(commentsEditable)

Save a new comment

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
CommentsEditable commentsEditable = new CommentsEditable(); // CommentsEditable | 
try {
    Comments result = apiInstance.createComments(commentsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#createComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentsEditable** | [**CommentsEditable**](CommentsEditable.md)|  |

### Return type

[**Comments**](Comments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComments"></a>
# **deleteComments**
> Comments deleteComments(commentId)

Delete a comments

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
String commentId = "commentId_example"; // String | ID of comments to return
try {
    Comments result = apiInstance.deleteComments(commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#deleteComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**| ID of comments to return |

### Return type

[**Comments**](Comments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommentById"></a>
# **getCommentById**
> Comments getCommentById(commentId)

Get single comment by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
String commentId = "commentId_example"; // String | ID of comments to return
try {
    Comments result = apiInstance.getCommentById(commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getCommentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**| ID of comments to return |

### Return type

[**Comments**](Comments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComments"></a>
# **getComments**
> InlineResponse200 getComments(commentableId, commentableType, filter, orderBy, orderDirection, perPage)

Returns all comments for a given type

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
Integer commentableId = 56; // Integer | 
String commentableType = "commentableType_example"; // String | 
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
try {
    InlineResponse200 result = apiInstance.getComments(commentableId, commentableType, filter, orderBy, orderDirection, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentableId** | **Integer**|  | [optional]
 **commentableType** | **String**|  | [optional]
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComment"></a>
# **updateComment**
> Comments updateComment(commentId, commentsEditable)

Update a comment

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
String commentId = "commentId_example"; // String | ID of comment to return
CommentsEditable commentsEditable = new CommentsEditable(); // CommentsEditable | 
try {
    Comments result = apiInstance.updateComment(commentId, commentsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#updateComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**| ID of comment to return |
 **commentsEditable** | [**CommentsEditable**](CommentsEditable.md)|  |

### Return type

[**Comments**](Comments.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

