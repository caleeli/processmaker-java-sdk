# NotificationsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotification**](NotificationsApi.md#createNotification) | **POST** /notifications | Save a new notifications
[**deleteNotification**](NotificationsApi.md#deleteNotification) | **DELETE** /notifications/notificationId | Delete a notification
[**getNotificationById**](NotificationsApi.md#getNotificationById) | **GET** /notifications/notificationId | Get single notification by ID
[**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /notifications | Returns all notifications that the user has access to
[**processMakerHttpControllersApiNotificationControllerUpdateAsRead**](NotificationsApi.md#processMakerHttpControllersApiNotificationControllerUpdateAsRead) | **PUT** /read_notifications | Mark notifications as read by the user
[**processMakerHttpControllersApiNotificationControllerUpdateAsReadAll**](NotificationsApi.md#processMakerHttpControllersApiNotificationControllerUpdateAsReadAll) | **PUT** /read_all_notifications | Mark notifications as read by id and type
[**updateNotification**](NotificationsApi.md#updateNotification) | **PUT** /notifications/notificationId | Update a notification


<a name="createNotification"></a>
# **createNotification**
> Notifications createNotification(notificationsEditable)

Save a new notifications

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
NotificationsEditable notificationsEditable = new NotificationsEditable(); // NotificationsEditable | 
try {
    Notifications result = apiInstance.createNotification(notificationsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#createNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsEditable** | [**NotificationsEditable**](NotificationsEditable.md)|  |

### Return type

[**Notifications**](Notifications.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNotification"></a>
# **deleteNotification**
> Notifications deleteNotification(notificationId)

Delete a notification

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String notificationId = "notificationId_example"; // String | ID of notification to return
try {
    Notifications result = apiInstance.deleteNotification(notificationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#deleteNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**| ID of notification to return |

### Return type

[**Notifications**](Notifications.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationById"></a>
# **getNotificationById**
> Notifications getNotificationById(notificationId)

Get single notification by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String notificationId = "notificationId_example"; // String | ID of notification to return
try {
    Notifications result = apiInstance.getNotificationById(notificationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotificationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**| ID of notification to return |

### Return type

[**Notifications**](Notifications.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> InlineResponse20010 getNotifications(status, filter, orderBy, orderDirection, perPage, include)

Returns all notifications that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String status = "status_example"; // String | Only return notifications by status (unread, all, etc.)
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20010 result = apiInstance.getNotifications(status, filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Only return notifications by status (unread, all, etc.) | [optional]
 **filter** | **String**| Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. | [optional]
 **orderBy** | **String**| Field to order results by | [optional]
 **orderDirection** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **Integer**|  | [optional] [default to 10]
 **include** | **String**| Include data from related models in payload. Comma seperated list. | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="processMakerHttpControllersApiNotificationControllerUpdateAsRead"></a>
# **processMakerHttpControllersApiNotificationControllerUpdateAsRead**
> processMakerHttpControllersApiNotificationControllerUpdateAsRead(inlineObject2)

Mark notifications as read by the user

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
try {
    apiInstance.processMakerHttpControllersApiNotificationControllerUpdateAsRead(inlineObject2);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#processMakerHttpControllersApiNotificationControllerUpdateAsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="processMakerHttpControllersApiNotificationControllerUpdateAsReadAll"></a>
# **processMakerHttpControllersApiNotificationControllerUpdateAsReadAll**
> processMakerHttpControllersApiNotificationControllerUpdateAsReadAll(inlineObject3)

Mark notifications as read by id and type

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
try {
    apiInstance.processMakerHttpControllersApiNotificationControllerUpdateAsReadAll(inlineObject3);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#processMakerHttpControllersApiNotificationControllerUpdateAsReadAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateNotification"></a>
# **updateNotification**
> Notifications updateNotification(notificationId, notificationsEditable)

Update a notification

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String notificationId = "notificationId_example"; // String | ID of notification to return
NotificationsEditable notificationsEditable = new NotificationsEditable(); // NotificationsEditable | 
try {
    Notifications result = apiInstance.updateNotification(notificationId, notificationsEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#updateNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**| ID of notification to return |
 **notificationsEditable** | [**NotificationsEditable**](NotificationsEditable.md)|  |

### Return type

[**Notifications**](Notifications.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

