# ProcessCategoriesApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessCategory**](ProcessCategoriesApi.md#createProcessCategory) | **POST** /process_categories | Save a new process Category
[**deleteProcessCategory**](ProcessCategoriesApi.md#deleteProcessCategory) | **DELETE** /process_categories/{process_category_id} | Delete a process category
[**getProcessCategories**](ProcessCategoriesApi.md#getProcessCategories) | **GET** /process_categories | Returns all processes categories that the user has access to
[**getProcessCategoryById**](ProcessCategoriesApi.md#getProcessCategoryById) | **GET** /process_categories/{process_category_id} | Get single process category by ID
[**updateProcessCategory**](ProcessCategoriesApi.md#updateProcessCategory) | **PUT** /process_categories/{process_category_id} | Update a process Category


<a name="createProcessCategory"></a>
# **createProcessCategory**
> ProcessCategory createProcessCategory(processCategoryEditable)

Save a new process Category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessCategoriesApi apiInstance = new ProcessCategoriesApi();
ProcessCategoryEditable processCategoryEditable = new ProcessCategoryEditable(); // ProcessCategoryEditable | 
try {
    ProcessCategory result = apiInstance.createProcessCategory(processCategoryEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessCategoriesApi#createProcessCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processCategoryEditable** | [**ProcessCategoryEditable**](ProcessCategoryEditable.md)|  |

### Return type

[**ProcessCategory**](ProcessCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcessCategory"></a>
# **deleteProcessCategory**
> Process deleteProcessCategory(processCategoryId)

Delete a process category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessCategoriesApi apiInstance = new ProcessCategoriesApi();
String processCategoryId = "processCategoryId_example"; // String | ID of process category to return
try {
    Process result = apiInstance.deleteProcessCategory(processCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessCategoriesApi#deleteProcessCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processCategoryId** | **String**| ID of process category to return |

### Return type

[**Process**](Process.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessCategories"></a>
# **getProcessCategories**
> InlineResponse20011 getProcessCategories(filter, orderBy, orderDirection, perPage, include)

Returns all processes categories that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessCategoriesApi apiInstance = new ProcessCategoriesApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse20011 result = apiInstance.getProcessCategories(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessCategoriesApi#getProcessCategories");
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

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessCategoryById"></a>
# **getProcessCategoryById**
> ProcessCategory getProcessCategoryById(processCategoryId)

Get single process category by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessCategoriesApi apiInstance = new ProcessCategoriesApi();
String processCategoryId = "processCategoryId_example"; // String | ID of process category to return
try {
    ProcessCategory result = apiInstance.getProcessCategoryById(processCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessCategoriesApi#getProcessCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processCategoryId** | **String**| ID of process category to return |

### Return type

[**ProcessCategory**](ProcessCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProcessCategory"></a>
# **updateProcessCategory**
> ProcessCategory updateProcessCategory(processCategoryId, processCategoryEditable)

Update a process Category

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.ProcessCategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

ProcessCategoriesApi apiInstance = new ProcessCategoriesApi();
String processCategoryId = "processCategoryId_example"; // String | ID of process category to return
ProcessCategoryEditable processCategoryEditable = new ProcessCategoryEditable(); // ProcessCategoryEditable | 
try {
    ProcessCategory result = apiInstance.updateProcessCategory(processCategoryId, processCategoryEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessCategoriesApi#updateProcessCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processCategoryId** | **String**| ID of process category to return |
 **processCategoryEditable** | [**ProcessCategoryEditable**](ProcessCategoryEditable.md)|  |

### Return type

[**ProcessCategory**](ProcessCategory.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

