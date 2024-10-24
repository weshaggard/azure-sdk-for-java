// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleBooleanCondition;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleBooleanConditionSupportedOperator;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleCondition;
import com.azure.resourcemanager.securityinsights.models.BooleanConditionProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BooleanConditionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BooleanConditionProperties model = BinaryData.fromString(
            "{\"conditionType\":\"Boolean\",\"conditionProperties\":{\"operator\":\"And\",\"innerConditions\":[{\"conditionType\":\"AutomationRuleCondition\"}]}}")
            .toObject(BooleanConditionProperties.class);
        Assertions.assertEquals(AutomationRuleBooleanConditionSupportedOperator.AND,
            model.conditionProperties().operator());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BooleanConditionProperties model = new BooleanConditionProperties().withConditionProperties(
            new AutomationRuleBooleanCondition().withOperator(AutomationRuleBooleanConditionSupportedOperator.AND)
                .withInnerConditions(Arrays.asList(new AutomationRuleCondition())));
        model = BinaryData.fromObject(model).toObject(BooleanConditionProperties.class);
        Assertions.assertEquals(AutomationRuleBooleanConditionSupportedOperator.AND,
            model.conditionProperties().operator());
    }
}
