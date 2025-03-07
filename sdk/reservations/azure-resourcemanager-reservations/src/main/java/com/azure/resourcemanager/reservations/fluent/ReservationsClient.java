// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.reservations.fluent.models.AvailableScopePropertiesInner;
import com.azure.resourcemanager.reservations.fluent.models.ReservationResponseInner;
import com.azure.resourcemanager.reservations.models.AvailableScopeRequest;
import com.azure.resourcemanager.reservations.models.MergeRequest;
import com.azure.resourcemanager.reservations.models.PatchModel;
import com.azure.resourcemanager.reservations.models.SplitRequest;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in ReservationsClient.
 */
public interface ReservationsClient {
    /**
     * Get Available Scopes for `Reservation`.
     * 
     * Check whether the scopes from request is valid for `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param body Scopes to be checked for eligibility.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the response of available scope api containing scopes and their
     * eligibilities.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvailableScopePropertiesInner>, AvailableScopePropertiesInner>
        beginAvailableScopes(String reservationOrderId, String reservationId, AvailableScopeRequest body);

    /**
     * Get Available Scopes for `Reservation`.
     * 
     * Check whether the scopes from request is valid for `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param body Scopes to be checked for eligibility.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the response of available scope api containing scopes and their
     * eligibilities.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvailableScopePropertiesInner>, AvailableScopePropertiesInner> beginAvailableScopes(
        String reservationOrderId, String reservationId, AvailableScopeRequest body, Context context);

    /**
     * Get Available Scopes for `Reservation`.
     * 
     * Check whether the scopes from request is valid for `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param body Scopes to be checked for eligibility.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of available scope api containing scopes and their eligibilities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailableScopePropertiesInner availableScopes(String reservationOrderId, String reservationId,
        AvailableScopeRequest body);

    /**
     * Get Available Scopes for `Reservation`.
     * 
     * Check whether the scopes from request is valid for `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param body Scopes to be checked for eligibility.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of available scope api containing scopes and their eligibilities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailableScopePropertiesInner availableScopes(String reservationOrderId, String reservationId,
        AvailableScopeRequest body, Context context);

    /**
     * Split the `Reservation`.
     * 
     * Split a `Reservation` into two `Reservation`s with specified quantity distribution.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed to Split a reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<List<ReservationResponseInner>>, List<ReservationResponseInner>>
        beginSplit(String reservationOrderId, SplitRequest body);

    /**
     * Split the `Reservation`.
     * 
     * Split a `Reservation` into two `Reservation`s with specified quantity distribution.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed to Split a reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<List<ReservationResponseInner>>, List<ReservationResponseInner>>
        beginSplit(String reservationOrderId, SplitRequest body, Context context);

    /**
     * Split the `Reservation`.
     * 
     * Split a `Reservation` into two `Reservation`s with specified quantity distribution.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed to Split a reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ReservationResponseInner> split(String reservationOrderId, SplitRequest body);

    /**
     * Split the `Reservation`.
     * 
     * Split a `Reservation` into two `Reservation`s with specified quantity distribution.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed to Split a reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ReservationResponseInner> split(String reservationOrderId, SplitRequest body, Context context);

    /**
     * Merges two `Reservation`s.
     * 
     * Merge the specified `Reservation`s into a new `Reservation`. The two `Reservation`s being merged must have same
     * properties.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for commercial request for a reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<List<ReservationResponseInner>>, List<ReservationResponseInner>>
        beginMerge(String reservationOrderId, MergeRequest body);

    /**
     * Merges two `Reservation`s.
     * 
     * Merge the specified `Reservation`s into a new `Reservation`. The two `Reservation`s being merged must have same
     * properties.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for commercial request for a reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<List<ReservationResponseInner>>, List<ReservationResponseInner>>
        beginMerge(String reservationOrderId, MergeRequest body, Context context);

    /**
     * Merges two `Reservation`s.
     * 
     * Merge the specified `Reservation`s into a new `Reservation`. The two `Reservation`s being merged must have same
     * properties.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for commercial request for a reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ReservationResponseInner> merge(String reservationOrderId, MergeRequest body);

    /**
     * Merges two `Reservation`s.
     * 
     * Merge the specified `Reservation`s into a new `Reservation`. The two `Reservation`s being merged must have same
     * properties.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for commercial request for a reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of ReservationResponse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ReservationResponseInner> merge(String reservationOrderId, MergeRequest body, Context context);

    /**
     * Get `Reservation`s in a given reservation Order
     * 
     * List `Reservation`s within a single `ReservationOrder`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of `Reservation`s as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> list(String reservationOrderId);

    /**
     * Get `Reservation`s in a given reservation Order
     * 
     * List `Reservation`s within a single `ReservationOrder`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of `Reservation`s as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> list(String reservationOrderId, Context context);

    /**
     * Get `Reservation` details.
     * 
     * Get specific `Reservation` details.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param expand Supported value of this query is renewProperties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific `Reservation` details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReservationResponseInner> getWithResponse(String reservationOrderId, String reservationId, String expand,
        Context context);

    /**
     * Get `Reservation` details.
     * 
     * Get specific `Reservation` details.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific `Reservation` details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationResponseInner get(String reservationOrderId, String reservationId);

    /**
     * Updates a `Reservation`.
     * 
     * Updates the applied scopes of the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param parameters Information needed to patch a reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the definition of the reservation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReservationResponseInner>, ReservationResponseInner> beginUpdate(String reservationOrderId,
        String reservationId, PatchModel parameters);

    /**
     * Updates a `Reservation`.
     * 
     * Updates the applied scopes of the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param parameters Information needed to patch a reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the definition of the reservation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReservationResponseInner>, ReservationResponseInner> beginUpdate(String reservationOrderId,
        String reservationId, PatchModel parameters, Context context);

    /**
     * Updates a `Reservation`.
     * 
     * Updates the applied scopes of the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param parameters Information needed to patch a reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the definition of the reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationResponseInner update(String reservationOrderId, String reservationId, PatchModel parameters);

    /**
     * Updates a `Reservation`.
     * 
     * Updates the applied scopes of the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param parameters Information needed to patch a reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the definition of the reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationResponseInner update(String reservationOrderId, String reservationId, PatchModel parameters,
        Context context);

    /**
     * Archive a `Reservation`.
     * 
     * Archiving a `Reservation` moves it to `Archived` state.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> archiveWithResponse(String reservationOrderId, String reservationId, Context context);

    /**
     * Archive a `Reservation`.
     * 
     * Archiving a `Reservation` moves it to `Archived` state.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void archive(String reservationOrderId, String reservationId);

    /**
     * Unarchive a `Reservation`.
     * 
     * Restores a `Reservation` to the state it was before archiving.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> unarchiveWithResponse(String reservationOrderId, String reservationId, Context context);

    /**
     * Unarchive a `Reservation`.
     * 
     * Restores a `Reservation` to the state it was before archiving.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void unarchive(String reservationOrderId, String reservationId);

    /**
     * Get `Reservation` revisions.
     * 
     * List of all the revisions for the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of `Reservation`s as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> listRevisions(String reservationOrderId, String reservationId);

    /**
     * Get `Reservation` revisions.
     * 
     * List of all the revisions for the `Reservation`.
     * 
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of `Reservation`s as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> listRevisions(String reservationOrderId, String reservationId,
        Context context);

    /**
     * List the reservations and the roll up counts of reservations group by provisioning states that the user has
     * access to in the current tenant.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> listAll();

    /**
     * List the reservations and the roll up counts of reservations group by provisioning states that the user has
     * access to in the current tenant.
     * 
     * @param filter May be used to filter by reservation properties. The filter supports 'eq', 'or', and 'and'. It does
     * not currently support 'ne', 'gt', 'le', 'ge', or 'not'. Reservation properties include sku/name,
     * properties/{appliedScopeType, archived, displayName, displayProvisioningState, effectiveDateTime, expiryDate,
     * expiryDateTime, provisioningState, quantity, renew, reservedResourceType, term, userFriendlyAppliedScopeType,
     * userFriendlyRenewState}.
     * @param orderby May be used to sort order by reservation properties.
     * @param refreshSummary To indicate whether to refresh the roll up counts of the reservations group by provisioning
     * states.
     * @param skiptoken The number of reservations to skip from the list before returning results.
     * @param selectedState The selected provisioning state.
     * @param take To number of reservations to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationResponseInner> listAll(String filter, String orderby, String refreshSummary,
        Float skiptoken, String selectedState, Float take, Context context);
}
