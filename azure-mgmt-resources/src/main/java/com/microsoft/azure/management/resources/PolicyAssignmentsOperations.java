/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.PolicyAssignment;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyAssignmentsOperations.
 */
public interface PolicyAssignmentsOperations {
    /**
     * The interface defining all the services for PolicyAssignmentsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolicyAssignmentsService {
        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}providers/Microsoft.Authorization/policyAssignments")
        Call<ResponseBody> listForResource(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Authorization/policyAssignments")
        Call<ResponseBody> listForResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("scope") String scope, @Path("policyAssignmentName") String policyAssignmentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}")
        Call<ResponseBody> create(@Path("scope") String scope, @Path("policyAssignmentName") String policyAssignmentName, @Path("subscriptionId") String subscriptionId, @Body PolicyAssignment parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}")
        Call<ResponseBody> get(@Path("scope") String scope, @Path("policyAssignmentName") String policyAssignmentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/{policyAssignmentId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteById(@Path("policyAssignmentId") String policyAssignmentId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/{policyAssignmentId}")
        Call<ResponseBody> createById(@Path("policyAssignmentId") String policyAssignmentId, @Path("subscriptionId") String subscriptionId, @Body PolicyAssignment parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/{policyAssignmentId}")
        Call<ResponseBody> getById(@Path("policyAssignmentId") String policyAssignmentId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policyAssignments")
        Call<ResponseBody> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/{scope}/providers/Microsoft.Authorization/policyAssignments")
        Call<ResponseBody> listForScope(@Path("scope") String scope, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listForResourceNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listForResourceGroupNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listForScopeNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResource(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String filter) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForResourceAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String filter, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResourceGroup(String resourceGroupName, String filter) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForResourceGroupAsync(String resourceGroupName, String filter, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Delete policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> delete(String scope, String policyAssignmentName) throws ServiceException, IOException;

    /**
     * Delete policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String scope, String policyAssignmentName, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Create policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param parameters Policy assignment.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> create(String scope, String policyAssignmentName, PolicyAssignment parameters) throws ServiceException, IOException;

    /**
     * Create policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param parameters Policy assignment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createAsync(String scope, String policyAssignmentName, PolicyAssignment parameters, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Get single policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> get(String scope, String policyAssignmentName) throws ServiceException, IOException;

    /**
     * Get single policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String scope, String policyAssignmentName, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Delete policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> deleteById(String policyAssignmentId) throws ServiceException, IOException;

    /**
     * Delete policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteByIdAsync(String policyAssignmentId, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Create policy assignment by Id.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param parameters Policy assignment.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> createById(String policyAssignmentId, PolicyAssignment parameters) throws ServiceException, IOException;

    /**
     * Create policy assignment by Id.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param parameters Policy assignment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createByIdAsync(String policyAssignmentId, PolicyAssignment parameters, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Get single policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PolicyAssignment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PolicyAssignment> getById(String policyAssignmentId) throws ServiceException, IOException;

    /**
     * Get single policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getByIdAsync(String policyAssignmentId, final ServiceCallback<PolicyAssignment> serviceCallback);

    /**
     * Gets policy assignments of the subscription.
     *
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> list(String filter) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String filter, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForScope(String scope, String filter) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForScopeAsync(String scope, String filter, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResourceNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForResourceNextAsync(String nextPageLink, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResourceGroupNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForResourceGroupNextAsync(String nextPageLink, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

    /**
     * Gets policy assignments of the scope.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;PolicyAssignment&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForScopeNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listForScopeNextAsync(String nextPageLink, final ServiceCallback<PageImpl<PolicyAssignment>> serviceCallback);

}
