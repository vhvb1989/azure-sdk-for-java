// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;

/** Samples for CustomDomains Get. */
public final class CustomDomainsGetSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/CustomDomains_Get.json
     */
    /**
     * Sample code: CustomDomains_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void customDomainsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getCustomDomains()
            .getWithResponse("RG", "profile1", "endpoint1", "www-someDomain-net", Context.NONE);
    }
}