/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.storage;

import com.microsoft.azure.management.storage.models.Usage;
import com.microsoft.azure.management.storage.models.UsageListResponse;
import com.microsoft.azure.management.storage.models.UsageName;
import com.microsoft.azure.management.storage.models.UsageUnit;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.core.utils.EnumUtility;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.NullNode;

/**
* Operations for listing usage.
*/
public class UsageOperationsImpl implements ServiceOperations<StorageManagementClientImpl>, UsageOperations {
    /**
    * Initializes a new instance of the UsageOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    UsageOperationsImpl(StorageManagementClientImpl client) {
        this.client = client;
    }
    
    private StorageManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.azure.management.storage.StorageManagementClientImpl.
    * @return The Client value.
    */
    public StorageManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Gets the current usage count and the limit for the resources under the
    * subscription.
    *
    * @return The List Usages operation response.
    */
    @Override
    public Future<UsageListResponse> listAsync() {
        return this.getClient().getExecutorService().submit(new Callable<UsageListResponse>() { 
            @Override
            public UsageListResponse call() throws Exception {
                return list();
            }
         });
    }
    
    /**
    * Gets the current usage count and the limit for the resources under the
    * subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Usages operation response.
    */
    @Override
    public UsageListResponse list() throws IOException, ServiceException, URISyntaxException {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/providers/Microsoft.Storage/usages";
        ArrayList<String> queryParameters = new ArrayList<String>();
        if (this.getClient().getApiVersion() != null) {
            queryParameters.add("api-version=" + URLEncoder.encode(this.getClient().getApiVersion(), "UTF-8"));
        }
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-client-request-id", UUID.randomUUID().toString());
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            UsageListResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new UsageListResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                String responseDocContent = IOUtils.toString(responseContent);
                if (responseDocContent == null == false && responseDocContent.length() > 0) {
                    responseDoc = objectMapper.readTree(responseDocContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    JsonNode valueArray = responseDoc.get("value");
                    if (valueArray != null && valueArray instanceof NullNode == false) {
                        for (JsonNode valueValue : ((ArrayNode) valueArray)) {
                            Usage usageInstance = new Usage();
                            result.getUsages().add(usageInstance);
                            
                            JsonNode unitValue = valueValue.get("unit");
                            if (unitValue != null && unitValue instanceof NullNode == false) {
                                UsageUnit unitInstance;
                                unitInstance = EnumUtility.fromString(UsageUnit.class, unitValue.getTextValue());
                                usageInstance.setUnit(unitInstance);
                            }
                            
                            JsonNode currentValueValue = valueValue.get("currentValue");
                            if (currentValueValue != null && currentValueValue instanceof NullNode == false) {
                                int currentValueInstance;
                                currentValueInstance = currentValueValue.getIntValue();
                                usageInstance.setCurrentValue(currentValueInstance);
                            }
                            
                            JsonNode limitValue = valueValue.get("limit");
                            if (limitValue != null && limitValue instanceof NullNode == false) {
                                int limitInstance;
                                limitInstance = limitValue.getIntValue();
                                usageInstance.setLimit(limitInstance);
                            }
                            
                            JsonNode nameValue = valueValue.get("name");
                            if (nameValue != null && nameValue instanceof NullNode == false) {
                                UsageName nameInstance = new UsageName();
                                usageInstance.setName(nameInstance);
                                
                                JsonNode valueValue2 = nameValue.get("value");
                                if (valueValue2 != null && valueValue2 instanceof NullNode == false) {
                                    String valueInstance;
                                    valueInstance = valueValue2.getTextValue();
                                    nameInstance.setValue(valueInstance);
                                }
                                
                                JsonNode localizedValueValue = nameValue.get("localizedValue");
                                if (localizedValueValue != null && localizedValueValue instanceof NullNode == false) {
                                    String localizedValueInstance;
                                    localizedValueInstance = localizedValueValue.getTextValue();
                                    nameInstance.setLocalizedValue(localizedValueInstance);
                                }
                            }
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
