# GroupMembersApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupMember**](GroupMembersApi.md#createGroupMember) | **POST** /group_members | Save a new group member
[**deleteGroupMember**](GroupMembersApi.md#deleteGroupMember) | **DELETE** /group_members/{group_member_id} | Delete a group member
[**getGroupMemberById**](GroupMembersApi.md#getGroupMemberById) | **GET** /group_members/{group_member_id} | Get single group member by ID
[**getGroupMembers**](GroupMembersApi.md#getGroupMembers) | **GET** /group_members | Returns all groups for a given member
[**getGroupMembersAvailable**](GroupMembersApi.md#getGroupMembersAvailable) | **GET** /group_members_available | Returns all groups available for a given member
[**getUserMembersAvailable**](GroupMembersApi.md#getUserMembersAvailable) | **GET** /user_members_available | Returns all users available for a given member


<a name="createGroupMember"></a>
# **createGroupMember**
> GroupMembers createGroupMember(groupMembersEditable)

Save a new group member

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
GroupMembersEditable groupMembersEditable = new GroupMembersEditable(); // GroupMembersEditable | 
try {
    GroupMembers result = apiInstance.createGroupMember(groupMembersEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#createGroupMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupMembersEditable** | [**GroupMembersEditable**](GroupMembersEditable.md)|  |

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupMember"></a>
# **deleteGroupMember**
> GroupMembers deleteGroupMember(groupMemberId)

Delete a group member

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
String groupMemberId = "groupMemberId_example"; // String | ID of group_members to return
try {
    GroupMembers result = apiInstance.deleteGroupMember(groupMemberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#deleteGroupMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupMemberId** | **String**| ID of group_members to return |

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupMemberById"></a>
# **getGroupMemberById**
> GroupMembers getGroupMemberById(groupMemberId)

Get single group member by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
String groupMemberId = "groupMemberId_example"; // String | ID of group members to return
try {
    GroupMembers result = apiInstance.getGroupMemberById(groupMemberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#getGroupMemberById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupMemberId** | **String**| ID of group members to return |

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupMembers"></a>
# **getGroupMembers**
> InlineResponse2007 getGroupMembers(memberId, orderBy, orderDirection, perPage)

Returns all groups for a given member

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
Integer memberId = 56; // Integer | 
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
try {
    InlineResponse2007 result = apiInstance.getGroupMembers(memberId, orderBy, orderDirection, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#getGroupMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **Integer**|  | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupMembersAvailable"></a>
# **getGroupMembersAvailable**
> InlineResponse2008 getGroupMembersAvailable(memberId, memberType, filter, orderBy, orderDirection, perPage)

Returns all groups available for a given member

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
String memberId = "memberId_example"; // String | ID of group member to return
String memberType = "memberType_example"; // String | type of group member to return
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
try {
    InlineResponse2008 result = apiInstance.getGroupMembersAvailable(memberId, memberType, filter, orderBy, orderDirection, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#getGroupMembersAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **String**| ID of group member to return |
 **memberType** | **String**| type of group member to return |
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserMembersAvailable"></a>
# **getUserMembersAvailable**
> InlineResponse2009 getUserMembersAvailable(groupId, filter, orderBy, orderDirection, perPage)

Returns all users available for a given member

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.GroupMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

GroupMembersApi apiInstance = new GroupMembersApi();
String groupId = "groupId_example"; // String | ID of group to return
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
try {
    InlineResponse2009 result = apiInstance.getUserMembersAvailable(groupId, filter, orderBy, orderDirection, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupMembersApi#getUserMembersAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of group to return |
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

