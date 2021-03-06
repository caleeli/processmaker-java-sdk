/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import ProcessMaker_Client.ApiCallback;
import ProcessMaker_Client.ApiClient;
import ProcessMaker_Client.ApiException;
import ProcessMaker_Client.ApiResponse;
import ProcessMaker_Client.Configuration;
import ProcessMaker_Client.Pair;
import ProcessMaker_Client.ProgressRequestBody;
import ProcessMaker_Client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Groups;
import org.openapitools.client.model.GroupsEditable;
import org.openapitools.client.model.InlineResponse2005;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createGroup
     * @param groupsEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createGroupCall(GroupsEditable groupsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupsEditable;

        // create path and map variables
        String localVarPath = "/groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createGroupValidateBeforeCall(GroupsEditable groupsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupsEditable' is set
        if (groupsEditable == null) {
            throw new ApiException("Missing the required parameter 'groupsEditable' when calling createGroup(Async)");
        }
        

        okhttp3.Call call = createGroupCall(groupsEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Save a new group
     * 
     * @param groupsEditable  (required)
     * @return Groups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Groups createGroup(GroupsEditable groupsEditable) throws ApiException {
        ApiResponse<Groups> resp = createGroupWithHttpInfo(groupsEditable);
        return resp.getData();
    }

    /**
     * Save a new group
     * 
     * @param groupsEditable  (required)
     * @return ApiResponse&lt;Groups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Groups> createGroupWithHttpInfo(GroupsEditable groupsEditable) throws ApiException {
        okhttp3.Call call = createGroupValidateBeforeCall(groupsEditable, null, null);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save a new group (asynchronously)
     * 
     * @param groupsEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createGroupAsync(GroupsEditable groupsEditable, final ApiCallback<Groups> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = createGroupValidateBeforeCall(groupsEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteGroup
     * @param groupId ID of group to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteGroupCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/groups/{group_id}"
            .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteGroupValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling deleteGroup(Async)");
        }
        

        okhttp3.Call call = deleteGroupCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a group
     * 
     * @param groupId ID of group to return (required)
     * @return Groups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Groups deleteGroup(String groupId) throws ApiException {
        ApiResponse<Groups> resp = deleteGroupWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Delete a group
     * 
     * @param groupId ID of group to return (required)
     * @return ApiResponse&lt;Groups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Groups> deleteGroupWithHttpInfo(String groupId) throws ApiException {
        okhttp3.Call call = deleteGroupValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a group (asynchronously)
     * 
     * @param groupId ID of group to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteGroupAsync(String groupId, final ApiCallback<Groups> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = deleteGroupValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGroupById
     * @param groupId ID of group to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getGroupByIdCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/groups/{group_id}"
            .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupByIdValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getGroupById(Async)");
        }
        

        okhttp3.Call call = getGroupByIdCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get single group by ID
     * 
     * @param groupId ID of group to return (required)
     * @return Groups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Groups getGroupById(String groupId) throws ApiException {
        ApiResponse<Groups> resp = getGroupByIdWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Get single group by ID
     * 
     * @param groupId ID of group to return (required)
     * @return ApiResponse&lt;Groups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Groups> getGroupByIdWithHttpInfo(String groupId) throws ApiException {
        okhttp3.Call call = getGroupByIdValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get single group by ID (asynchronously)
     * 
     * @param groupId ID of group to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getGroupByIdAsync(String groupId, final ApiCallback<Groups> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getGroupByIdValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGroups
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getGroupsCall(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("per_page", perPage));
        }

        if (include != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("include", include));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupsValidateBeforeCall(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getGroupsCall(filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns all groups that the user has access to
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return InlineResponse2005
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2005 getGroups(String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        ApiResponse<InlineResponse2005> resp = getGroupsWithHttpInfo(filter, orderBy, orderDirection, perPage, include);
        return resp.getData();
    }

    /**
     * Returns all groups that the user has access to
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return ApiResponse&lt;InlineResponse2005&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2005> getGroupsWithHttpInfo(String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        okhttp3.Call call = getGroupsValidateBeforeCall(filter, orderBy, orderDirection, perPage, include, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns all groups that the user has access to (asynchronously)
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getGroupsAsync(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ApiCallback<InlineResponse2005> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getGroupsValidateBeforeCall(filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateGroup
     * @param groupId ID of group to return (required)
     * @param groupsEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateGroupCall(String groupId, GroupsEditable groupsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupsEditable;

        // create path and map variables
        String localVarPath = "/groups/{group_id}"
            .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateGroupValidateBeforeCall(String groupId, GroupsEditable groupsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling updateGroup(Async)");
        }
        
        // verify the required parameter 'groupsEditable' is set
        if (groupsEditable == null) {
            throw new ApiException("Missing the required parameter 'groupsEditable' when calling updateGroup(Async)");
        }
        

        okhttp3.Call call = updateGroupCall(groupId, groupsEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a group
     * 
     * @param groupId ID of group to return (required)
     * @param groupsEditable  (required)
     * @return Groups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Groups updateGroup(String groupId, GroupsEditable groupsEditable) throws ApiException {
        ApiResponse<Groups> resp = updateGroupWithHttpInfo(groupId, groupsEditable);
        return resp.getData();
    }

    /**
     * Update a group
     * 
     * @param groupId ID of group to return (required)
     * @param groupsEditable  (required)
     * @return ApiResponse&lt;Groups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Groups> updateGroupWithHttpInfo(String groupId, GroupsEditable groupsEditable) throws ApiException {
        okhttp3.Call call = updateGroupValidateBeforeCall(groupId, groupsEditable, null, null);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a group (asynchronously)
     * 
     * @param groupId ID of group to return (required)
     * @param groupsEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateGroupAsync(String groupId, GroupsEditable groupsEditable, final ApiCallback<Groups> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = updateGroupValidateBeforeCall(groupId, groupsEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Groups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
