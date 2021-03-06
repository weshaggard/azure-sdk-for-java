/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation.CommerceManager;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation.OfferTermInfoInner;
import org.joda.time.DateTime;

/**
 * Type representing OfferTermInfo.
 */
public interface OfferTermInfo extends HasInner<OfferTermInfoInner>, HasManager<CommerceManager> {
    /**
     * @return the effectiveDate value.
     */
    DateTime effectiveDate();

}
