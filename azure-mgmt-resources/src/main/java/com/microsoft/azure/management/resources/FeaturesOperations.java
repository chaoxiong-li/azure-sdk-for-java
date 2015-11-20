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

import com.microsoft.azure.management.resources.models.FeatureResult;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in FeaturesOperations.
 */
public interface FeaturesOperations {
    /**
     * The interface defining all the services for FeaturesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FeaturesService {
        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Features/features")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features")
        Call<ResponseBody> list(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features/{featureName}")
        Call<ResponseBody> get(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("featureName") String featureName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features/{featureName}/register")
        Call<ResponseBody> register(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("featureName") String featureName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;FeatureResult&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> listAll() throws ServiceException, IOException;

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<FeatureResult>> serviceCallback);

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;FeatureResult&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> list(String resourceProviderNamespace) throws ServiceException, IOException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceProviderNamespace, final ServiceCallback<PageImpl<FeatureResult>> serviceCallback);

    /**
     * Get all features under the subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the FeatureResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<FeatureResult> get(String resourceProviderNamespace, String featureName) throws ServiceException, IOException;

    /**
     * Get all features under the subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResult> serviceCallback);

    /**
     * Registers for a previewed feature of a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the FeatureResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<FeatureResult> register(String resourceProviderNamespace, String featureName) throws ServiceException, IOException;

    /**
     * Registers for a previewed feature of a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> registerAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResult> serviceCallback);

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;FeatureResult&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> listAllNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<FeatureResult>> serviceCallback);

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;FeatureResult&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> listNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<FeatureResult>> serviceCallback);

}
