// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPatch;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingScheduleDaysOfWeekItem;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPatch model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"cukoklyaxuconu\":\"nmmqhgyxzkon\",\"pewr\":\"szfkbe\"},\"properties\":{\"description\":\"wv\",\"friendlyName\":\"ektcxsen\",\"timeZone\":\"lrsf\",\"exclusionTag\":\"zpwv\",\"schedules\":[{\"name\":\"gbiqylihkaet\",\"daysOfWeek\":[\"Thursday\",\"Thursday\",\"Sunday\"],\"rampUpStartTime\":{\"hour\":493965696,\"minute\":533172139},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":1486569340,\"rampUpCapacityThresholdPct\":5394429,\"peakStartTime\":{\"hour\":1059821653,\"minute\":2064900799},\"peakLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownStartTime\":{\"hour\":1887113058,\"minute\":1657324555},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":1278137451,\"rampDownCapacityThresholdPct\":156873727,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":112236140,\"rampDownNotificationMessage\":\"txfvjrbirph\",\"offPeakStartTime\":{\"hour\":1482882841,\"minute\":99482426},\"offPeakLoadBalancingAlgorithm\":\"BreadthFirst\"},{\"name\":\"hfnljkyq\",\"daysOfWeek\":[\"Saturday\",\"Thursday\"],\"rampUpStartTime\":{\"hour\":1054022835,\"minute\":1970519416},\"rampUpLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampUpMinimumHostsPct\":552165564,\"rampUpCapacityThresholdPct\":2084359484,\"peakStartTime\":{\"hour\":10143119,\"minute\":1108075171},\"peakLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownStartTime\":{\"hour\":649555961,\"minute\":1685542215},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":1059812914,\"rampDownCapacityThresholdPct\":1745548413,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroSessions\",\"rampDownWaitTimeMinutes\":630804167,\"rampDownNotificationMessage\":\"zz\",\"offPeakStartTime\":{\"hour\":1537141479,\"minute\":1755265349},\"offPeakLoadBalancingAlgorithm\":\"BreadthFirst\"},{\"name\":\"fvgxbfsmxneh\",\"daysOfWeek\":[\"Wednesday\",\"Wednesday\",\"Sunday\",\"Sunday\"],\"rampUpStartTime\":{\"hour\":1976417253,\"minute\":68854326},\"rampUpLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampUpMinimumHostsPct\":398257944,\"rampUpCapacityThresholdPct\":156663672,\"peakStartTime\":{\"hour\":1961052031,\"minute\":1123544345},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":175699877,\"minute\":481409327},\"rampDownLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownMinimumHostsPct\":1920273783,\"rampDownCapacityThresholdPct\":905507147,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroSessions\",\"rampDownWaitTimeMinutes\":1728715445,\"rampDownNotificationMessage\":\"cispnqzahmgkbr\",\"offPeakStartTime\":{\"hour\":188498280,\"minute\":1687540865},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"},{\"name\":\"nuqqkpikadrgvt\",\"daysOfWeek\":[\"Tuesday\",\"Saturday\"],\"rampUpStartTime\":{\"hour\":122504841,\"minute\":855671205},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":508085674,\"rampUpCapacityThresholdPct\":834922568,\"peakStartTime\":{\"hour\":698240356,\"minute\":23060626},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":600405260,\"minute\":1045715770},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":2136509867,\"rampDownCapacityThresholdPct\":1477198207,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":282629437,\"rampDownNotificationMessage\":\"runmp\",\"offPeakStartTime\":{\"hour\":18555434,\"minute\":808779778},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"}],\"hostPoolReferences\":[{\"hostPoolArmPath\":\"l\",\"scalingPlanEnabled\":false},{\"hostPoolArmPath\":\"myskpbhenbtkcxy\",\"scalingPlanEnabled\":false},{\"hostPoolArmPath\":\"nrs\",\"scalingPlanEnabled\":false},{\"hostPoolArmPath\":\"idybyxczf\",\"scalingPlanEnabled\":true}]}}")
                .toObject(ScalingPlanPatch.class);
        Assertions.assertEquals("nmmqhgyxzkon", model.tags().get("cukoklyaxuconu"));
        Assertions.assertEquals("wv", model.description());
        Assertions.assertEquals("ektcxsen", model.friendlyName());
        Assertions.assertEquals("lrsf", model.timeZone());
        Assertions.assertEquals("zpwv", model.exclusionTag());
        Assertions.assertEquals("gbiqylihkaet", model.schedules().get(0).name());
        Assertions.assertEquals(ScalingScheduleDaysOfWeekItem.THURSDAY, model.schedules().get(0).daysOfWeek().get(0));
        Assertions.assertEquals(493965696, model.schedules().get(0).rampUpStartTime().hour());
        Assertions.assertEquals(533172139, model.schedules().get(0).rampUpStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.schedules().get(0).rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(1486569340, model.schedules().get(0).rampUpMinimumHostsPct());
        Assertions.assertEquals(5394429, model.schedules().get(0).rampUpCapacityThresholdPct());
        Assertions.assertEquals(1059821653, model.schedules().get(0).peakStartTime().hour());
        Assertions.assertEquals(2064900799, model.schedules().get(0).peakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.schedules().get(0).peakLoadBalancingAlgorithm());
        Assertions.assertEquals(1887113058, model.schedules().get(0).rampDownStartTime().hour());
        Assertions.assertEquals(1657324555, model.schedules().get(0).rampDownStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
                model.schedules().get(0).rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1278137451, model.schedules().get(0).rampDownMinimumHostsPct());
        Assertions.assertEquals(156873727, model.schedules().get(0).rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.schedules().get(0).rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.schedules().get(0).rampDownStopHostsWhen());
        Assertions.assertEquals(112236140, model.schedules().get(0).rampDownWaitTimeMinutes());
        Assertions.assertEquals("txfvjrbirph", model.schedules().get(0).rampDownNotificationMessage());
        Assertions.assertEquals(1482882841, model.schedules().get(0).offPeakStartTime().hour());
        Assertions.assertEquals(99482426, model.schedules().get(0).offPeakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).offPeakLoadBalancingAlgorithm());
        Assertions.assertEquals("l", model.hostPoolReferences().get(0).hostPoolArmPath());
        Assertions.assertEquals(false, model.hostPoolReferences().get(0).scalingPlanEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPatch model =
            new ScalingPlanPatch()
                .withTags(mapOf("cukoklyaxuconu", "nmmqhgyxzkon", "pewr", "szfkbe"))
                .withDescription("wv")
                .withFriendlyName("ektcxsen")
                .withTimeZone("lrsf")
                .withExclusionTag("zpwv")
                .withSchedules(
                    Arrays
                        .asList(
                            new ScalingSchedule()
                                .withName("gbiqylihkaet")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.THURSDAY,
                                            ScalingScheduleDaysOfWeekItem.THURSDAY,
                                            ScalingScheduleDaysOfWeekItem.SUNDAY))
                                .withRampUpStartTime(new Time().withHour(493965696).withMinute(533172139))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampUpMinimumHostsPct(1486569340)
                                .withRampUpCapacityThresholdPct(5394429)
                                .withPeakStartTime(new Time().withHour(1059821653).withMinute(2064900799))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(1887113058).withMinute(1657324555))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(1278137451)
                                .withRampDownCapacityThresholdPct(156873727)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_ACTIVE_SESSIONS)
                                .withRampDownWaitTimeMinutes(112236140)
                                .withRampDownNotificationMessage("txfvjrbirph")
                                .withOffPeakStartTime(new Time().withHour(1482882841).withMinute(99482426))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST),
                            new ScalingSchedule()
                                .withName("hfnljkyq")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.SATURDAY,
                                            ScalingScheduleDaysOfWeekItem.THURSDAY))
                                .withRampUpStartTime(new Time().withHour(1054022835).withMinute(1970519416))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampUpMinimumHostsPct(552165564)
                                .withRampUpCapacityThresholdPct(2084359484)
                                .withPeakStartTime(new Time().withHour(10143119).withMinute(1108075171))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(649555961).withMinute(1685542215))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(1059812914)
                                .withRampDownCapacityThresholdPct(1745548413)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_SESSIONS)
                                .withRampDownWaitTimeMinutes(630804167)
                                .withRampDownNotificationMessage("zz")
                                .withOffPeakStartTime(new Time().withHour(1537141479).withMinute(1755265349))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST),
                            new ScalingSchedule()
                                .withName("fvgxbfsmxneh")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.WEDNESDAY,
                                            ScalingScheduleDaysOfWeekItem.WEDNESDAY,
                                            ScalingScheduleDaysOfWeekItem.SUNDAY,
                                            ScalingScheduleDaysOfWeekItem.SUNDAY))
                                .withRampUpStartTime(new Time().withHour(1976417253).withMinute(68854326))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampUpMinimumHostsPct(398257944)
                                .withRampUpCapacityThresholdPct(156663672)
                                .withPeakStartTime(new Time().withHour(1961052031).withMinute(1123544345))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(175699877).withMinute(481409327))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampDownMinimumHostsPct(1920273783)
                                .withRampDownCapacityThresholdPct(905507147)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_SESSIONS)
                                .withRampDownWaitTimeMinutes(1728715445)
                                .withRampDownNotificationMessage("cispnqzahmgkbr")
                                .withOffPeakStartTime(new Time().withHour(188498280).withMinute(1687540865))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST),
                            new ScalingSchedule()
                                .withName("nuqqkpikadrgvt")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.TUESDAY,
                                            ScalingScheduleDaysOfWeekItem.SATURDAY))
                                .withRampUpStartTime(new Time().withHour(122504841).withMinute(855671205))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampUpMinimumHostsPct(508085674)
                                .withRampUpCapacityThresholdPct(834922568)
                                .withPeakStartTime(new Time().withHour(698240356).withMinute(23060626))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(600405260).withMinute(1045715770))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(2136509867)
                                .withRampDownCapacityThresholdPct(1477198207)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_ACTIVE_SESSIONS)
                                .withRampDownWaitTimeMinutes(282629437)
                                .withRampDownNotificationMessage("runmp")
                                .withOffPeakStartTime(new Time().withHour(18555434).withMinute(808779778))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)))
                .withHostPoolReferences(
                    Arrays
                        .asList(
                            new ScalingHostPoolReference().withHostPoolArmPath("l").withScalingPlanEnabled(false),
                            new ScalingHostPoolReference()
                                .withHostPoolArmPath("myskpbhenbtkcxy")
                                .withScalingPlanEnabled(false),
                            new ScalingHostPoolReference().withHostPoolArmPath("nrs").withScalingPlanEnabled(false),
                            new ScalingHostPoolReference()
                                .withHostPoolArmPath("idybyxczf")
                                .withScalingPlanEnabled(true)));
        model = BinaryData.fromObject(model).toObject(ScalingPlanPatch.class);
        Assertions.assertEquals("nmmqhgyxzkon", model.tags().get("cukoklyaxuconu"));
        Assertions.assertEquals("wv", model.description());
        Assertions.assertEquals("ektcxsen", model.friendlyName());
        Assertions.assertEquals("lrsf", model.timeZone());
        Assertions.assertEquals("zpwv", model.exclusionTag());
        Assertions.assertEquals("gbiqylihkaet", model.schedules().get(0).name());
        Assertions.assertEquals(ScalingScheduleDaysOfWeekItem.THURSDAY, model.schedules().get(0).daysOfWeek().get(0));
        Assertions.assertEquals(493965696, model.schedules().get(0).rampUpStartTime().hour());
        Assertions.assertEquals(533172139, model.schedules().get(0).rampUpStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.schedules().get(0).rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(1486569340, model.schedules().get(0).rampUpMinimumHostsPct());
        Assertions.assertEquals(5394429, model.schedules().get(0).rampUpCapacityThresholdPct());
        Assertions.assertEquals(1059821653, model.schedules().get(0).peakStartTime().hour());
        Assertions.assertEquals(2064900799, model.schedules().get(0).peakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.schedules().get(0).peakLoadBalancingAlgorithm());
        Assertions.assertEquals(1887113058, model.schedules().get(0).rampDownStartTime().hour());
        Assertions.assertEquals(1657324555, model.schedules().get(0).rampDownStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
                model.schedules().get(0).rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1278137451, model.schedules().get(0).rampDownMinimumHostsPct());
        Assertions.assertEquals(156873727, model.schedules().get(0).rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.schedules().get(0).rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.schedules().get(0).rampDownStopHostsWhen());
        Assertions.assertEquals(112236140, model.schedules().get(0).rampDownWaitTimeMinutes());
        Assertions.assertEquals("txfvjrbirph", model.schedules().get(0).rampDownNotificationMessage());
        Assertions.assertEquals(1482882841, model.schedules().get(0).offPeakStartTime().hour());
        Assertions.assertEquals(99482426, model.schedules().get(0).offPeakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).offPeakLoadBalancingAlgorithm());
        Assertions.assertEquals("l", model.hostPoolReferences().get(0).hostPoolArmPath());
        Assertions.assertEquals(false, model.hostPoolReferences().get(0).scalingPlanEnabled());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
