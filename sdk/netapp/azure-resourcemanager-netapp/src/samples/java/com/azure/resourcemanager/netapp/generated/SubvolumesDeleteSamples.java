// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;

/** Samples for Subvolumes Delete. */
public final class SubvolumesDeleteSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2021-10-01/examples/Subvolumes_Delete.json
     */
    /**
     * Sample code: Subvolumes_Delete.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void subvolumesDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.subvolumes().delete("myRG", "account1", "pool1", "volume1", "subvolume1", Context.NONE);
    }
}