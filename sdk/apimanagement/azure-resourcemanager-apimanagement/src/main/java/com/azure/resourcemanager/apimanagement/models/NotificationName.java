// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for NotificationName.
 */
public final class NotificationName extends ExpandableStringEnum<NotificationName> {
    /**
     * Static value RequestPublisherNotificationMessage for NotificationName.
     */
    public static final NotificationName REQUEST_PUBLISHER_NOTIFICATION_MESSAGE
        = fromString("RequestPublisherNotificationMessage");

    /**
     * Static value PurchasePublisherNotificationMessage for NotificationName.
     */
    public static final NotificationName PURCHASE_PUBLISHER_NOTIFICATION_MESSAGE
        = fromString("PurchasePublisherNotificationMessage");

    /**
     * Static value NewApplicationNotificationMessage for NotificationName.
     */
    public static final NotificationName NEW_APPLICATION_NOTIFICATION_MESSAGE
        = fromString("NewApplicationNotificationMessage");

    /**
     * Static value BCC for NotificationName.
     */
    public static final NotificationName BCC = fromString("BCC");

    /**
     * Static value NewIssuePublisherNotificationMessage for NotificationName.
     */
    public static final NotificationName NEW_ISSUE_PUBLISHER_NOTIFICATION_MESSAGE
        = fromString("NewIssuePublisherNotificationMessage");

    /**
     * Static value AccountClosedPublisher for NotificationName.
     */
    public static final NotificationName ACCOUNT_CLOSED_PUBLISHER = fromString("AccountClosedPublisher");

    /**
     * Static value QuotaLimitApproachingPublisherNotificationMessage for NotificationName.
     */
    public static final NotificationName QUOTA_LIMIT_APPROACHING_PUBLISHER_NOTIFICATION_MESSAGE
        = fromString("QuotaLimitApproachingPublisherNotificationMessage");

    /**
     * Creates a new instance of NotificationName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NotificationName() {
    }

    /**
     * Creates or finds a NotificationName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NotificationName.
     */
    public static NotificationName fromString(String name) {
        return fromString(name, NotificationName.class);
    }

    /**
     * Gets known NotificationName values.
     * 
     * @return known NotificationName values.
     */
    public static Collection<NotificationName> values() {
        return values(NotificationName.class);
    }
}
