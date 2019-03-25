# ScreensApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScreens**](ScreensApi.md#createScreens) | **POST** /screens | Save a new screens
[**deleteScreen**](ScreensApi.md#deleteScreen) | **DELETE** /screens/screensId | Delete a screen
[**duplicateScript**](ScreensApi.md#duplicateScript) | **PUT** /screens/screensId/duplicate | duplicate a screen
[**getScreens**](ScreensApi.md#getScreens) | **GET** /screens | Returns all screens that the user has access to
[**getScreensById**](ScreensApi.md#getScreensById) | **GET** /screens/screensId | Get single screens by ID
[**updateScreen**](ScreensApi.md#updateScreen) | **PUT** /screens/screensId | Update a screen


<a name="createScreens"></a>
# **createScreens**
> Screens createScreens(screensEditable)

Save a new screens

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
ScreensEditable screensEditable = new ScreensEditable(); // ScreensEditable | 
try {
    Screens result = apiInstance.createScreens(screensEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#createScreens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensEditable** | [**ScreensEditable**](ScreensEditable.md)|  |

### Return type

[**Screens**](Screens.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScreen"></a>
# **deleteScreen**
> Screens deleteScreen(screensId)

Delete a screen

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
String screensId = "screensId_example"; // String | ID of screen to return
try {
    Screens result = apiInstance.deleteScreen(screensId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#deleteScreen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensId** | **String**| ID of screen to return |

### Return type

[**Screens**](Screens.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="duplicateScript"></a>
# **duplicateScript**
> Screens duplicateScript(screensId, screensEditable)

duplicate a screen

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
String screensId = "screensId_example"; // String | ID of screen to return
ScreensEditable screensEditable = new ScreensEditable(); // ScreensEditable | 
try {
    Screens result = apiInstance.duplicateScript(screensId, screensEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#duplicateScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensId** | **String**| ID of screen to return |
 **screensEditable** | [**ScreensEditable**](ScreensEditable.md)|  |

### Return type

[**Screens**](Screens.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScreens"></a>
# **getScreens**
> InlineResponse20016 getScreens(filter, orderBy, orderDirection, perPage, include)

Returns all screens that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20016 result = apiInstance.getScreens(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#getScreens");
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

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScreensById"></a>
# **getScreensById**
> Screens getScreensById(screensId)

Get single screens by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
String screensId = "screensId_example"; // String | ID of screens to return
try {
    Screens result = apiInstance.getScreensById(screensId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#getScreensById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensId** | **String**| ID of screens to return |

### Return type

[**Screens**](Screens.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScreen"></a>
# **updateScreen**
> Screens updateScreen(screensId, screensEditable)

Update a screen

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreensApi apiInstance = new ScreensApi();
String screensId = "screensId_example"; // String | ID of screen to return
ScreensEditable screensEditable = new ScreensEditable(); // ScreensEditable | 
try {
    Screens result = apiInstance.updateScreen(screensId, screensEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreensApi#updateScreen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screensId** | **String**| ID of screen to return |
 **screensEditable** | [**ScreensEditable**](ScreensEditable.md)|  |

### Return type

[**Screens**](Screens.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

