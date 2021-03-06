/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnectionsDeleteHeaders;
import com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnectionsPutHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private KeyVaultManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(Retrofit retrofit, KeyVaultManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnections put" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> put(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Body PrivateEndpointConnectionInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v2019_09_01.PrivateEndpointConnections beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner get(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner put(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties).toBlocking().single().body();
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties), serviceCallback);
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders>> putWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.put(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), properties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders> clientResponse = putDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsPutHeaders> putDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .buildWithHeaders(response, PrivateEndpointConnectionsPutHeaders.class);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner delete(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().last().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> deleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<PrivateEndpointConnectionInner> deleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>> deleteWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<PrivateEndpointConnectionInner>() { }.getType(), PrivateEndpointConnectionsDeleteHeaders.class);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner beginDelete(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> beginDeleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> beginDeleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PrivateEndpointConnectionInner, PrivateEndpointConnectionsDeleteHeaders> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildWithHeaders(response, PrivateEndpointConnectionsDeleteHeaders.class);
    }

}
