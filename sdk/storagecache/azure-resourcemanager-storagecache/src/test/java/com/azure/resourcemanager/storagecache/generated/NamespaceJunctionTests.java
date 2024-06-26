// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import org.junit.jupiter.api.Assertions;

public final class NamespaceJunctionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NamespaceJunction model = BinaryData.fromString(
            "{\"namespacePath\":\"qqaatjinrvgou\",\"targetPath\":\"fiibfggjioolvr\",\"nfsExport\":\"kvtkkg\",\"nfsAccessPolicy\":\"qwjygvja\"}")
            .toObject(NamespaceJunction.class);
        Assertions.assertEquals("qqaatjinrvgou", model.namespacePath());
        Assertions.assertEquals("fiibfggjioolvr", model.targetPath());
        Assertions.assertEquals("kvtkkg", model.nfsExport());
        Assertions.assertEquals("qwjygvja", model.nfsAccessPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NamespaceJunction model = new NamespaceJunction().withNamespacePath("qqaatjinrvgou")
            .withTargetPath("fiibfggjioolvr")
            .withNfsExport("kvtkkg")
            .withNfsAccessPolicy("qwjygvja");
        model = BinaryData.fromObject(model).toObject(NamespaceJunction.class);
        Assertions.assertEquals("qqaatjinrvgou", model.namespacePath());
        Assertions.assertEquals("fiibfggjioolvr", model.targetPath());
        Assertions.assertEquals("kvtkkg", model.nfsExport());
        Assertions.assertEquals("qwjygvja", model.nfsAccessPolicy());
    }
}
