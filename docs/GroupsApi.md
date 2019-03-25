# GroupsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Save a new group
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{group_id} | Delete a group
[**getGroupById**](GroupsApi.md#getGroupById) | **GET** /groups/{group_id} | Get single group by ID
[**getGroups**](GroupsApi.md#getGroups) | **GET** /groups | Returns all groups that the user has access to
[**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{group_id} | Update a group


<a name="createGroup"></a>
# **createGroup**
> Groups createGroup(groupsEditable)

Save a new group

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
GroupsEditable groupsEditable = new GroupsEditable(); // GroupsEditable | 
try {
    Groups result = apiInstance.createGroup(groupsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupsEditable** | [**GroupsEditable**](GroupsEditable.md)|  |

### Return type

[**Groups**](Groups.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> Groups deleteGroup(groupId)

Delete a group

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | ID of group to return
try {
    Groups result = apiInstance.deleteGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of group to return |

### Return type

[**Groups**](Groups.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupById"></a>
# **getGroupById**
> Groups getGroupById(groupId)

Get single group by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | ID of group to return
try {
    Groups result = apiInstance.getGroupById(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of group to return |

### Return type

[**Groups**](Groups.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> InlineResponse2005 getGroups(filter, orderBy, orderDirection, perPage, include)

Returns all groups that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse2005 result = apiInstance.getGroups(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroups");
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

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> Groups updateGroup(groupId, groupsEditable)

Update a group

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | ID of group to return
GroupsEditable groupsEditable = new GroupsEditable(); // GroupsEditable | 
try {
    Groups result = apiInstance.updateGroup(groupId, groupsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of group to return |
 **groupsEditable** | [**GroupsEditable**](GroupsEditable.md)|  |

### Return type

[**Groups**](Groups.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

