// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoringTagRulesPropertiesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoringTagRulesPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoringTagRulesPropertiesInner model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Accepted\",\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{\"name\":\"o\",\"value\":\"ukgjnpiucgygevq\",\"action\":\"Exclude\"},{\"name\":\"pmr\",\"value\":\"izcdrqjsd\",\"action\":\"Exclude\"},{\"name\":\"fyhxde\",\"value\":\"jzicwifsjt\",\"action\":\"Exclude\"}]},\"metricRules\":{\"sendMetrics\":\"Enabled\",\"filteringTags\":[{\"name\":\"bkh\",\"value\":\"deyeamdphagalpbu\",\"action\":\"Exclude\"},{\"name\":\"pwhonowkg\",\"value\":\"wankixzbi\",\"action\":\"Exclude\"},{\"name\":\"uttmrywnuzoqft\",\"value\":\"qzrnkcqvyxlwhz\",\"action\":\"Exclude\"}],\"userEmail\":\"ohoqqnwvlryav\"}}")
                .toObject(MonitoringTagRulesPropertiesInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.DISABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("o", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("ukgjnpiucgygevq", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.ENABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("bkh", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("deyeamdphagalpbu", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ohoqqnwvlryav", model.metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoringTagRulesPropertiesInner model =
            new MonitoringTagRulesPropertiesInner()
                .withLogRules(
                    new LogRules()
                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                        .withFilteringTags(
                            Arrays
                                .asList(
                                    new FilteringTag()
                                        .withName("o")
                                        .withValue("ukgjnpiucgygevq")
                                        .withAction(TagAction.EXCLUDE),
                                    new FilteringTag()
                                        .withName("pmr")
                                        .withValue("izcdrqjsd")
                                        .withAction(TagAction.EXCLUDE),
                                    new FilteringTag()
                                        .withName("fyhxde")
                                        .withValue("jzicwifsjt")
                                        .withAction(TagAction.EXCLUDE))))
                .withMetricRules(
                    new MetricRulesInner()
                        .withSendMetrics(SendMetricsStatus.ENABLED)
                        .withFilteringTags(
                            Arrays
                                .asList(
                                    new FilteringTag()
                                        .withName("bkh")
                                        .withValue("deyeamdphagalpbu")
                                        .withAction(TagAction.EXCLUDE),
                                    new FilteringTag()
                                        .withName("pwhonowkg")
                                        .withValue("wankixzbi")
                                        .withAction(TagAction.EXCLUDE),
                                    new FilteringTag()
                                        .withName("uttmrywnuzoqft")
                                        .withValue("qzrnkcqvyxlwhz")
                                        .withAction(TagAction.EXCLUDE)))
                        .withUserEmail("ohoqqnwvlryav"));
        model = BinaryData.fromObject(model).toObject(MonitoringTagRulesPropertiesInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.DISABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("o", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("ukgjnpiucgygevq", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.ENABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("bkh", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("deyeamdphagalpbu", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ohoqqnwvlryav", model.metricRules().userEmail());
    }
}