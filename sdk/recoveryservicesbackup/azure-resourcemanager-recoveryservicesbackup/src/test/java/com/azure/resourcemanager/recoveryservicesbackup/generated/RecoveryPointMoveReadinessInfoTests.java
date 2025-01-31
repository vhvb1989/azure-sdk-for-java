// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RecoveryPointMoveReadinessInfoTests {
    @Test
    public void testDeserialize() {
        RecoveryPointMoveReadinessInfo model =
            BinaryData
                .fromString("{\"isReadyForMove\":false,\"additionalInfo\":\"fz\"}")
                .toObject(RecoveryPointMoveReadinessInfo.class);
        Assertions.assertEquals(false, model.isReadyForMove());
        Assertions.assertEquals("fz", model.additionalInfo());
    }

    @Test
    public void testSerialize() {
        RecoveryPointMoveReadinessInfo model =
            new RecoveryPointMoveReadinessInfo().withIsReadyForMove(false).withAdditionalInfo("fz");
        model = BinaryData.fromObject(model).toObject(RecoveryPointMoveReadinessInfo.class);
        Assertions.assertEquals(false, model.isReadyForMove());
        Assertions.assertEquals("fz", model.additionalInfo());
    }
}
