// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.DynamicVNetAssignmentScope;
import com.azure.resourcemanager.batch.models.InboundEndpointProtocol;
import com.azure.resourcemanager.batch.models.InboundNatPool;
import com.azure.resourcemanager.batch.models.IpAddressProvisioningType;
import com.azure.resourcemanager.batch.models.NetworkConfiguration;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRuleAccess;
import com.azure.resourcemanager.batch.models.PoolEndpointConfiguration;
import com.azure.resourcemanager.batch.models.PublicIpAddressConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkConfiguration model = BinaryData.fromString(
            "{\"subnetId\":\"sdqrhzoymibmrq\",\"dynamicVnetAssignmentScope\":\"none\",\"endpointConfiguration\":{\"inboundNatPools\":[{\"name\":\"wfluszdt\",\"protocol\":\"TCP\",\"backendPort\":569809127,\"frontendPortRangeStart\":24536782,\"frontendPortRangeEnd\":1802230973,\"networkSecurityGroupRules\":[{\"priority\":695674314,\"access\":\"Allow\",\"sourceAddressPrefix\":\"voqacpiexpbt\",\"sourcePortRanges\":[\"bwoenwashrt\"]},{\"priority\":2130378751,\"access\":\"Deny\",\"sourceAddressPrefix\":\"cnqxwbpokulpi\",\"sourcePortRanges\":[\"aasipqi\",\"obyu\"]}]},{\"name\":\"erpqlpqwcciuqg\",\"protocol\":\"UDP\",\"backendPort\":1924773766,\"frontendPortRangeStart\":1287443771,\"frontendPortRangeEnd\":164113652,\"networkSecurityGroupRules\":[{\"priority\":2060302961,\"access\":\"Deny\",\"sourceAddressPrefix\":\"btkuwhh\",\"sourcePortRanges\":[\"k\",\"joxafnndlpi\",\"hkoymkcdyhbp\",\"kpw\"]},{\"priority\":722591670,\"access\":\"Deny\",\"sourceAddressPrefix\":\"q\",\"sourcePortRanges\":[\"vq\",\"ovljxywsu\",\"syrsndsytgadgvra\"]},{\"priority\":890415173,\"access\":\"Allow\",\"sourceAddressPrefix\":\"neqn\",\"sourcePortRanges\":[\"rwlqu\",\"ijfqkacewiipfp\",\"bjibwwiftohq\",\"vpuvks\"]}]}]},\"publicIPAddressConfiguration\":{\"provision\":\"UserManaged\",\"ipAddressIds\":[\"nynfsynljphuo\"]},\"enableAcceleratedNetworking\":true}")
            .toObject(NetworkConfiguration.class);
        Assertions.assertEquals("sdqrhzoymibmrq", model.subnetId());
        Assertions.assertEquals(DynamicVNetAssignmentScope.NONE, model.dynamicVnetAssignmentScope());
        Assertions.assertEquals("wfluszdt", model.endpointConfiguration().inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.TCP,
            model.endpointConfiguration().inboundNatPools().get(0).protocol());
        Assertions.assertEquals(569809127, model.endpointConfiguration().inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(24536782,
            model.endpointConfiguration().inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(1802230973,
            model.endpointConfiguration().inboundNatPools().get(0).frontendPortRangeEnd());
        Assertions.assertEquals(695674314,
            model.endpointConfiguration().inboundNatPools().get(0).networkSecurityGroupRules().get(0).priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.ALLOW,
            model.endpointConfiguration().inboundNatPools().get(0).networkSecurityGroupRules().get(0).access());
        Assertions.assertEquals("voqacpiexpbt",
            model.endpointConfiguration()
                .inboundNatPools()
                .get(0)
                .networkSecurityGroupRules()
                .get(0)
                .sourceAddressPrefix());
        Assertions.assertEquals("bwoenwashrt",
            model.endpointConfiguration()
                .inboundNatPools()
                .get(0)
                .networkSecurityGroupRules()
                .get(0)
                .sourcePortRanges()
                .get(0));
        Assertions.assertEquals(IpAddressProvisioningType.USER_MANAGED,
            model.publicIpAddressConfiguration().provision());
        Assertions.assertEquals("nynfsynljphuo", model.publicIpAddressConfiguration().ipAddressIds().get(0));
        Assertions.assertEquals(true, model.enableAcceleratedNetworking());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkConfiguration model = new NetworkConfiguration().withSubnetId("sdqrhzoymibmrq")
            .withDynamicVnetAssignmentScope(DynamicVNetAssignmentScope.NONE)
            .withEndpointConfiguration(new PoolEndpointConfiguration().withInboundNatPools(Arrays.asList(
                new InboundNatPool().withName("wfluszdt")
                    .withProtocol(InboundEndpointProtocol.TCP)
                    .withBackendPort(569809127)
                    .withFrontendPortRangeStart(24536782)
                    .withFrontendPortRangeEnd(1802230973)
                    .withNetworkSecurityGroupRules(Arrays.asList(
                        new NetworkSecurityGroupRule().withPriority(695674314)
                            .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                            .withSourceAddressPrefix("voqacpiexpbt")
                            .withSourcePortRanges(Arrays.asList("bwoenwashrt")),
                        new NetworkSecurityGroupRule().withPriority(2130378751)
                            .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                            .withSourceAddressPrefix("cnqxwbpokulpi")
                            .withSourcePortRanges(Arrays.asList("aasipqi", "obyu")))),
                new InboundNatPool().withName("erpqlpqwcciuqg")
                    .withProtocol(InboundEndpointProtocol.UDP)
                    .withBackendPort(1924773766)
                    .withFrontendPortRangeStart(1287443771)
                    .withFrontendPortRangeEnd(164113652)
                    .withNetworkSecurityGroupRules(Arrays.asList(
                        new NetworkSecurityGroupRule().withPriority(2060302961)
                            .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                            .withSourceAddressPrefix("btkuwhh")
                            .withSourcePortRanges(Arrays.asList("k", "joxafnndlpi", "hkoymkcdyhbp", "kpw")),
                        new NetworkSecurityGroupRule().withPriority(722591670)
                            .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                            .withSourceAddressPrefix("q")
                            .withSourcePortRanges(Arrays.asList("vq", "ovljxywsu", "syrsndsytgadgvra")),
                        new NetworkSecurityGroupRule().withPriority(890415173)
                            .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                            .withSourceAddressPrefix("neqn")
                            .withSourcePortRanges(
                                Arrays.asList("rwlqu", "ijfqkacewiipfp", "bjibwwiftohq", "vpuvks")))))))
            .withPublicIpAddressConfiguration(
                new PublicIpAddressConfiguration().withProvision(IpAddressProvisioningType.USER_MANAGED)
                    .withIpAddressIds(Arrays.asList("nynfsynljphuo")))
            .withEnableAcceleratedNetworking(true);
        model = BinaryData.fromObject(model).toObject(NetworkConfiguration.class);
        Assertions.assertEquals("sdqrhzoymibmrq", model.subnetId());
        Assertions.assertEquals(DynamicVNetAssignmentScope.NONE, model.dynamicVnetAssignmentScope());
        Assertions.assertEquals("wfluszdt", model.endpointConfiguration().inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.TCP,
            model.endpointConfiguration().inboundNatPools().get(0).protocol());
        Assertions.assertEquals(569809127, model.endpointConfiguration().inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(24536782,
            model.endpointConfiguration().inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(1802230973,
            model.endpointConfiguration().inboundNatPools().get(0).frontendPortRangeEnd());
        Assertions.assertEquals(695674314,
            model.endpointConfiguration().inboundNatPools().get(0).networkSecurityGroupRules().get(0).priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.ALLOW,
            model.endpointConfiguration().inboundNatPools().get(0).networkSecurityGroupRules().get(0).access());
        Assertions.assertEquals("voqacpiexpbt",
            model.endpointConfiguration()
                .inboundNatPools()
                .get(0)
                .networkSecurityGroupRules()
                .get(0)
                .sourceAddressPrefix());
        Assertions.assertEquals("bwoenwashrt",
            model.endpointConfiguration()
                .inboundNatPools()
                .get(0)
                .networkSecurityGroupRules()
                .get(0)
                .sourcePortRanges()
                .get(0));
        Assertions.assertEquals(IpAddressProvisioningType.USER_MANAGED,
            model.publicIpAddressConfiguration().provision());
        Assertions.assertEquals("nynfsynljphuo", model.publicIpAddressConfiguration().ipAddressIds().get(0));
        Assertions.assertEquals(true, model.enableAcceleratedNetworking());
    }
}
