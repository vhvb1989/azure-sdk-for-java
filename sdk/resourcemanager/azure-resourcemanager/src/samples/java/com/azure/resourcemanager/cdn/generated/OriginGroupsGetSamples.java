// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;

/** Samples for OriginGroups Get. */
public final class OriginGroupsGetSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/OriginGroups_Get.json
     */
    /**
     * Sample code: OriginGroups_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void originGroupsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getOriginGroups()
            .getWithResponse("RG", "profile1", "endpoint1", "originGroup1", Context.NONE);
    }
}