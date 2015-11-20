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

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.TenantIdDescription;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class TenantsOperationsImpl implements TenantsOperations {
    private TenantsService service;
    SubscriptionClient client;

    public TenantsOperationsImpl(Retrofit retrofit, SubscriptionClient client) {
        this.service = retrofit.create(TenantsService.class);
        this.client = client;
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @return the PageImpl&lt;TenantIdDescription&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<TenantIdDescription>> list() throws ServiceException, IOException {
        if (this.client.getSubscriptionId() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.list(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAsync(final ServiceCallback<PageImpl<TenantIdDescription>> serviceCallback) {
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.list(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<TenantIdDescription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<TenantIdDescription>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<TenantIdDescription>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<TenantIdDescription>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;TenantIdDescription&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<TenantIdDescription>> listNext(String nextPageLink) throws ServiceException, IOException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<TenantIdDescription>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<TenantIdDescription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listNextDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<TenantIdDescription>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<TenantIdDescription>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<TenantIdDescription>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
