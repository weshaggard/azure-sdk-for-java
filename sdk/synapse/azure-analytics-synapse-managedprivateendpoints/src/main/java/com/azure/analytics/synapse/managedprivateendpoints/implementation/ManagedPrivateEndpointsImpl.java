// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.managedprivateendpoints.implementation;

import com.azure.analytics.synapse.managedprivateendpoints.models.ManagedPrivateEndpoint;
import com.azure.analytics.synapse.managedprivateendpoints.models.ManagedPrivateEndpointListResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ManagedPrivateEndpoints.
 */
public final class ManagedPrivateEndpointsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ManagedPrivateEndpointsService service;

    /**
     * The service client containing this operation class.
     */
    private final ManagedPrivateEndpointsClientImpl client;

    /**
     * Initializes an instance of ManagedPrivateEndpointsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ManagedPrivateEndpointsImpl(ManagedPrivateEndpointsClientImpl client) {
        this.service = RestProxy.create(ManagedPrivateEndpointsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagedPrivateEndpointsClientManagedPrivateEndpoints to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ManagedPrivateEndpointsClientManagedPrivateEndpoints")
    public interface ManagedPrivateEndpointsService {
        @Get("/managedVirtualNetworks/{managedVirtualNetworkName}/managedPrivateEndpoints/{managedPrivateEndpointName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<ManagedPrivateEndpoint>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("managedVirtualNetworkName") String managedVirtualNetworkName,
            @PathParam("managedPrivateEndpointName") String managedPrivateEndpointName,
            @HeaderParam("Accept") String accept, Context context);

        @Put("/managedVirtualNetworks/{managedVirtualNetworkName}/managedPrivateEndpoints/{managedPrivateEndpointName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<ManagedPrivateEndpoint>> create(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("managedVirtualNetworkName") String managedVirtualNetworkName,
            @PathParam("managedPrivateEndpointName") String managedPrivateEndpointName,
            @BodyParam("application/json") ManagedPrivateEndpoint managedPrivateEndpoint,
            @HeaderParam("Accept") String accept, Context context);

        @Delete("/managedVirtualNetworks/{managedVirtualNetworkName}/managedPrivateEndpoints/{managedPrivateEndpointName}")
        @ExpectedResponses({ 202, 204 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> delete(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("managedVirtualNetworkName") String managedVirtualNetworkName,
            @PathParam("managedPrivateEndpointName") String managedPrivateEndpointName, Context context);

        @Get("/managedVirtualNetworks/{managedVirtualNetworkName}/managedPrivateEndpoints")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<ManagedPrivateEndpointListResponse>> list(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("managedVirtualNetworkName") String managedVirtualNetworkName,
            @HeaderParam("Accept") String accept, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<ManagedPrivateEndpointListResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagedPrivateEndpoint>> getWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName) {
        return FluxUtil.withContext(
            context -> getWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context));
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagedPrivateEndpoint>> getWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), managedVirtualNetworkName,
            managedPrivateEndpointName, accept, context);
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedPrivateEndpoint> getAsync(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        return getWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedPrivateEndpoint> getAsync(String managedVirtualNetworkName, String managedPrivateEndpointName,
        Context context) {
        return getWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedPrivateEndpoint> getWithResponse(String managedVirtualNetworkName,
        String managedPrivateEndpointName, Context context) {
        return getWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context).block();
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedPrivateEndpoint get(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        return getWithResponse(managedVirtualNetworkName, managedPrivateEndpointName, Context.NONE).getValue();
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagedPrivateEndpoint>> createWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName, ManagedPrivateEndpoint managedPrivateEndpoint) {
        return FluxUtil.withContext(context -> createWithResponseAsync(managedVirtualNetworkName,
            managedPrivateEndpointName, managedPrivateEndpoint, context));
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagedPrivateEndpoint>> createWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName, ManagedPrivateEndpoint managedPrivateEndpoint, Context context) {
        final String accept = "application/json";
        return service.create(this.client.getEndpoint(), this.client.getApiVersion(), managedVirtualNetworkName,
            managedPrivateEndpointName, managedPrivateEndpoint, accept, context);
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedPrivateEndpoint> createAsync(String managedVirtualNetworkName, String managedPrivateEndpointName,
        ManagedPrivateEndpoint managedPrivateEndpoint) {
        return createWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, managedPrivateEndpoint)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedPrivateEndpoint> createAsync(String managedVirtualNetworkName, String managedPrivateEndpointName,
        ManagedPrivateEndpoint managedPrivateEndpoint, Context context) {
        return createWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, managedPrivateEndpoint,
            context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedPrivateEndpoint> createWithResponse(String managedVirtualNetworkName,
        String managedPrivateEndpointName, ManagedPrivateEndpoint managedPrivateEndpoint, Context context) {
        return createWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, managedPrivateEndpoint,
            context).block();
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedPrivateEndpoint create(String managedVirtualNetworkName, String managedPrivateEndpointName,
        ManagedPrivateEndpoint managedPrivateEndpoint) {
        return createWithResponse(managedVirtualNetworkName, managedPrivateEndpointName, managedPrivateEndpoint,
            Context.NONE).getValue();
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName) {
        return FluxUtil.withContext(
            context -> deleteWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context));
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String managedVirtualNetworkName,
        String managedPrivateEndpointName, Context context) {
        return service.delete(this.client.getEndpoint(), this.client.getApiVersion(), managedVirtualNetworkName,
            managedPrivateEndpointName, context);
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        return deleteWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String managedVirtualNetworkName, String managedPrivateEndpointName,
        Context context) {
        return deleteWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String managedVirtualNetworkName, String managedPrivateEndpointName,
        Context context) {
        return deleteWithResponseAsync(managedVirtualNetworkName, managedPrivateEndpointName, context).block();
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        deleteWithResponse(managedVirtualNetworkName, managedPrivateEndpointName, Context.NONE);
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedPrivateEndpoint>> listSinglePageAsync(String managedVirtualNetworkName) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(),
                managedVirtualNetworkName, accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedPrivateEndpoint>> listSinglePageAsync(String managedVirtualNetworkName,
        Context context) {
        final String accept = "application/json";
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), managedVirtualNetworkName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedPrivateEndpoint> listAsync(String managedVirtualNetworkName) {
        return new PagedFlux<>(() -> listSinglePageAsync(managedVirtualNetworkName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedPrivateEndpoint> listAsync(String managedVirtualNetworkName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(managedVirtualNetworkName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<ManagedPrivateEndpoint> listSinglePage(String managedVirtualNetworkName) {
        return listSinglePageAsync(managedVirtualNetworkName).block();
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<ManagedPrivateEndpoint> listSinglePage(String managedVirtualNetworkName, Context context) {
        return listSinglePageAsync(managedVirtualNetworkName, context).block();
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedPrivateEndpoint> list(String managedVirtualNetworkName) {
        return new PagedIterable<>(listAsync(managedVirtualNetworkName));
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedPrivateEndpoint> list(String managedVirtualNetworkName, Context context) {
        return new PagedIterable<>(listAsync(managedVirtualNetworkName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedPrivateEndpoint>> listNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedPrivateEndpoint>> listNextSinglePageAsync(String nextLink, Context context) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<ManagedPrivateEndpoint> listNextSinglePage(String nextLink) {
        return listNextSinglePageAsync(nextLink).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<ManagedPrivateEndpoint> listNextSinglePage(String nextLink, Context context) {
        return listNextSinglePageAsync(nextLink, context).block();
    }
}
