// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.UserInner;
import java.time.Duration;
import java.util.Map;

/** An immutable client-side representation of User. */
public interface User {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the email property: The user email address, as it was specified during registration.
     *
     * @return the email value.
     */
    String email();

    /**
     * Gets the familyName property: The user family name, as it was specified during registration.
     *
     * @return the familyName value.
     */
    String familyName();

    /**
     * Gets the givenName property: The user given name, as it was specified during registration.
     *
     * @return the givenName value.
     */
    String givenName();

    /**
     * Gets the tenantId property: The user tenant ID, as it was specified during registration.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the totalUsage property: How long the user has used his VMs in this lab.
     *
     * @return the totalUsage value.
     */
    Duration totalUsage();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the latestOperationResult property: The details of the latest operation. ex: status, error.
     *
     * @return the latestOperationResult value.
     */
    LatestOperationResult latestOperationResult();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.UserInner object.
     *
     * @return the inner object.
     */
    UserInner innerModel();

    /** The entirety of the User definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The User definition stages. */
    interface DefinitionStages {
        /** The first stage of the User definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the User definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the User definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labAccountName, labName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labAccountName The name of the lab Account.
             * @param labName The name of the lab.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labAccountName, String labName);
        }
        /**
         * The stage of the User definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithProvisioningState,
                DefinitionStages.WithUniqueIdentifier {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            User create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            User create(Context context);
        }
        /** The stage of the User definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the User definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning status of the resource..
             *
             * @param provisioningState The provisioning status of the resource.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
        /** The stage of the User definition allowing to specify uniqueIdentifier. */
        interface WithUniqueIdentifier {
            /**
             * Specifies the uniqueIdentifier property: The unique immutable identifier of a resource (Guid)..
             *
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
             * @return the next definition stage.
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }
    }
    /**
     * Begins update for the User resource.
     *
     * @return the stage of resource update.
     */
    User.Update update();

    /** The template for User update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithProvisioningState, UpdateStages.WithUniqueIdentifier {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        User apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        User apply(Context context);
    }
    /** The User update stages. */
    interface UpdateStages {
        /** The stage of the User update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the User update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning status of the resource..
             *
             * @param provisioningState The provisioning status of the resource.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
        /** The stage of the User update allowing to specify uniqueIdentifier. */
        interface WithUniqueIdentifier {
            /**
             * Specifies the uniqueIdentifier property: The unique immutable identifier of a resource (Guid)..
             *
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
             * @return the next definition stage.
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    User refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    User refresh(Context context);
}
