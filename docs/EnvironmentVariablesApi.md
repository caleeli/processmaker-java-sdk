# EnvironmentVariablesApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEnvironmentVariables**](EnvironmentVariablesApi.md#createEnvironmentVariables) | **POST** /environment_variables | Save a new environment_variables
[**deleteEnvironmentVariables**](EnvironmentVariablesApi.md#deleteEnvironmentVariables) | **DELETE** /environment_variables/{environment_variables_id} | Delete a environment_variables
[**getEnvironmentVariables**](EnvironmentVariablesApi.md#getEnvironmentVariables) | **GET** /environment_variables | Returns all environmentVariables that the user has access to
[**getEnvironmentVariablesById**](EnvironmentVariablesApi.md#getEnvironmentVariablesById) | **GET** /environment_variables/{environment_variables_id} | Get single environment_variables by ID
[**updateEnvironmentVariables**](EnvironmentVariablesApi.md#updateEnvironmentVariables) | **PUT** /environment_variables/{environment_variables_id} | Update a environment_variables


<a name="createEnvironmentVariables"></a>
# **createEnvironmentVariables**
> EnvironmentVariables createEnvironmentVariables(environmentVariablesEditable)

Save a new environment_variables

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.EnvironmentVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

EnvironmentVariablesApi apiInstance = new EnvironmentVariablesApi();
EnvironmentVariablesEditable environmentVariablesEditable = new EnvironmentVariablesEditable(); // EnvironmentVariablesEditable | 
try {
    EnvironmentVariables result = apiInstance.createEnvironmentVariables(environmentVariablesEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentVariablesApi#createEnvironmentVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentVariablesEditable** | [**EnvironmentVariablesEditable**](EnvironmentVariablesEditable.md)|  |

### Return type

[**EnvironmentVariables**](EnvironmentVariables.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEnvironmentVariables"></a>
# **deleteEnvironmentVariables**
> EnvironmentVariables deleteEnvironmentVariables(environmentVariablesId)

Delete a environment_variables

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.EnvironmentVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

EnvironmentVariablesApi apiInstance = new EnvironmentVariablesApi();
String environmentVariablesId = "environmentVariablesId_example"; // String | ID of environment_variables to return
try {
    EnvironmentVariables result = apiInstance.deleteEnvironmentVariables(environmentVariablesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentVariablesApi#deleteEnvironmentVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentVariablesId** | **String**| ID of environment_variables to return |

### Return type

[**EnvironmentVariables**](EnvironmentVariables.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentVariables"></a>
# **getEnvironmentVariables**
> InlineResponse2001 getEnvironmentVariables(filter, orderBy, orderDirection, perPage, include)

Returns all environmentVariables that the user has access to

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.EnvironmentVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

EnvironmentVariablesApi apiInstance = new EnvironmentVariablesApi();
String filter = "filter_example"; // String | Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring.
String orderBy = "orderBy_example"; // String | Field to order results by
String orderDirection = "asc"; // String | 
Integer perPage = 10; // Integer | 
String include = "include_example"; // String | Include data from related models in payload. Comma seperated list.
try {
    InlineResponse2001 result = apiInstance.getEnvironmentVariables(filter, orderBy, orderDirection, perPage, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentVariablesApi#getEnvironmentVariables");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentVariablesById"></a>
# **getEnvironmentVariablesById**
> EnvironmentVariables getEnvironmentVariablesById(environmentVariablesId)

Get single environment_variables by ID

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.EnvironmentVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

EnvironmentVariablesApi apiInstance = new EnvironmentVariablesApi();
String environmentVariablesId = "environmentVariablesId_example"; // String | ID of environment_variables to return
try {
    EnvironmentVariables result = apiInstance.getEnvironmentVariablesById(environmentVariablesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentVariablesApi#getEnvironmentVariablesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentVariablesId** | **String**| ID of environment_variables to return |

### Return type

[**EnvironmentVariables**](EnvironmentVariables.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEnvironmentVariables"></a>
# **updateEnvironmentVariables**
> EnvironmentVariables updateEnvironmentVariables(environmentVariablesId, environmentVariablesEditable)

Update a environment_variables

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.EnvironmentVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

EnvironmentVariablesApi apiInstance = new EnvironmentVariablesApi();
String environmentVariablesId = "environmentVariablesId_example"; // String | ID of environment_variables to return
EnvironmentVariablesEditable environmentVariablesEditable = new EnvironmentVariablesEditable(); // EnvironmentVariablesEditable | 
try {
    EnvironmentVariables result = apiInstance.updateEnvironmentVariables(environmentVariablesId, environmentVariablesEditable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentVariablesApi#updateEnvironmentVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentVariablesId** | **String**| ID of environment_variables to return |
 **environmentVariablesEditable** | [**EnvironmentVariablesEditable**](EnvironmentVariablesEditable.md)|  |

### Return type

[**EnvironmentVariables**](EnvironmentVariables.md)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

