// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AssetJobInput;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssetJobInputTests {
    @Test
    public void testDeserialize() {
        AssetJobInput model =
            BinaryData.fromString("{\"mode\":\"ReadOnlyMount\",\"uri\":\"fgbrtt\"}").toObject(AssetJobInput.class);
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.mode());
        Assertions.assertEquals("fgbrtt", model.uri());
    }

    @Test
    public void testSerialize() {
        AssetJobInput model = new AssetJobInput().withMode(InputDeliveryMode.READ_ONLY_MOUNT).withUri("fgbrtt");
        model = BinaryData.fromObject(model).toObject(AssetJobInput.class);
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.mode());
        Assertions.assertEquals("fgbrtt", model.uri());
    }
}
