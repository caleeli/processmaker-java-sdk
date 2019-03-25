# ScreenCategoriesApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScreenCategory**](ScreenCategoriesApi.md#createScreenCategory) | **POST** /screen_categories | Save a new Screen Category
[**deleteScreenCategory**](ScreenCategoriesApi.md#deleteScreenCategory) | **DELETE** /screen_categories/screen_category_id | Delete a screen category
[**getScreenCategories**](ScreenCategoriesApi.md#getScreenCategories) | **GET** /screen_categories | Returns all screens categories that the user has access to
[**getScreenCategoryById**](ScreenCategoriesApi.md#getScreenCategoryById) | **GET** /screen_categories/screen_category_id | Get single screen category by ID
[**updateScreenCategory**](ScreenCategoriesApi.md#updateScreenCategory) | **PUT** /screen_categories/screen_category_id | Update a screen Category


<a name="createScreenCategory"></a>
# **createScreenCategory**
> ScreenCategory createScreenCategory(screenCategoryEditable)

Save a new Screen Category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreenCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreenCategoriesApi apiInstance = new ScreenCategoriesApi();
ScreenCategoryEditable screenCategoryEditable = new ScreenCategoryEditable(); // ScreenCategoryEditable | 
try {
    ScreenCategory result = apiInstance.createScreenCategory(screenCategoryEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenCategoriesApi#createScreenCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenCategoryEditable** | [**ScreenCategoryEditable**](ScreenCategoryEditable.md)|  |

### Return type

[**ScreenCategory**](ScreenCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScreenCategory"></a>
# **deleteScreenCategory**
> ScreenCategory deleteScreenCategory(screenCategoryId)

Delete a screen category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreenCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreenCategoriesApi apiInstance = new ScreenCategoriesApi();
String screenCategoryId = "screenCategoryId_example"; // String | ID of screen category to return
try {
    ScreenCategory result = apiInstance.deleteScreenCategory(screenCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenCategoriesApi#deleteScreenCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenCategoryId** | **String**| ID of screen category to return |

### Return type

[**ScreenCategory**](ScreenCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScreenCategories"></a>
# **getScreenCategories**
> InlineResponse20015 getScreenCategories(filter, orderBy, orderDirection, perPage, include)

Returns all screens categories that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreenCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreenCategoriesApi apiInstance = new ScreenCategoriesApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20015 result = apiInstance.getScreenCategories(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenCategoriesApi#getScreenCategories");
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

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScreenCategoryById"></a>
# **getScreenCategoryById**
> ScreenCategory getScreenCategoryById(screenCategoryId)

Get single screen category by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreenCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreenCategoriesApi apiInstance = new ScreenCategoriesApi();
String screenCategoryId = "screenCategoryId_example"; // String | ID of screen category to return
try {
    ScreenCategory result = apiInstance.getScreenCategoryById(screenCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenCategoriesApi#getScreenCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenCategoryId** | **String**| ID of screen category to return |

### Return type

[**ScreenCategory**](ScreenCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScreenCategory"></a>
# **updateScreenCategory**
> ScreenCategory updateScreenCategory(screenCategoryId, screenCategoryEditable)

Update a screen Category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ScreenCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ScreenCategoriesApi apiInstance = new ScreenCategoriesApi();
String screenCategoryId = "screenCategoryId_example"; // String | ID of screen category to return
ScreenCategoryEditable screenCategoryEditable = new ScreenCategoryEditable(); // ScreenCategoryEditable | 
try {
    ScreenCategory result = apiInstance.updateScreenCategory(screenCategoryId, screenCategoryEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenCategoriesApi#updateScreenCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenCategoryId** | **String**| ID of screen category to return |
 **screenCategoryEditable** | [**ScreenCategoryEditable**](ScreenCategoryEditable.md)|  |

### Return type

[**ScreenCategory**](ScreenCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

