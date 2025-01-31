// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ContainerType;
import com.azure.resourcemanager.machinelearning.models.DeploymentLogsRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentLogsRequestTests {
    @Test
    public void testDeserialize() {
        DeploymentLogsRequest model =
            BinaryData
                .fromString("{\"containerType\":\"StorageInitializer\",\"tail\":304740778}")
                .toObject(DeploymentLogsRequest.class);
        Assertions.assertEquals(ContainerType.STORAGE_INITIALIZER, model.containerType());
        Assertions.assertEquals(304740778, model.tail());
    }

    @Test
    public void testSerialize() {
        DeploymentLogsRequest model =
            new DeploymentLogsRequest().withContainerType(ContainerType.STORAGE_INITIALIZER).withTail(304740778);
        model = BinaryData.fromObject(model).toObject(DeploymentLogsRequest.class);
        Assertions.assertEquals(ContainerType.STORAGE_INITIALIZER, model.containerType());
        Assertions.assertEquals(304740778, model.tail());
    }
}
