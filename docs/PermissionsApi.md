# PermissionsApi

All URIs are relative to *http://localhost/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processMakerHttpControllersApiPermissionControllerUpdate**](PermissionsApi.md#processMakerHttpControllersApiPermissionControllerUpdate) | **PUT** /permissions | Update the permissions of an user


<a name="processMakerHttpControllersApiPermissionControllerUpdate"></a>
# **processMakerHttpControllersApiPermissionControllerUpdate**
> processMakerHttpControllersApiPermissionControllerUpdate(inlineObject4)

Update the permissions of an user

### Example
```java
// Import classes:
//import ProcessMaker_Client.ApiClient;
//import ProcessMaker_Client.ApiException;
//import ProcessMaker_Client.Configuration;
//import ProcessMaker_Client.auth.*;
//import org.openapitools.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: pm_api_bearer
OAuth pm_api_bearer = (OAuth) defaultClient.getAuthentication("pm_api_bearer");
pm_api_bearer.setAccessToken("YOUR ACCESS TOKEN");

PermissionsApi apiInstance = new PermissionsApi();
InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
try {
    apiInstance.processMakerHttpControllersApiPermissionControllerUpdate(inlineObject4);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#processMakerHttpControllersApiPermissionControllerUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

null (empty response body)

### Authorization

[pm_api_bearer](../README.md#pm_api_bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

