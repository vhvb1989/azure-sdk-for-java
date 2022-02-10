// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.ProfileInner;
import com.azure.resourcemanager.cdn.models.Sku;
import com.azure.resourcemanager.cdn.models.SkuName;

/** Samples for Profiles Create. */
public final class ProfilesCreateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Profiles_Create.json
     */
    /**
     * Sample code: Profiles_Create.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getProfiles()
            .create(
                "RG",
                "profile1",
                new ProfileInner()
                    .withLocation("WestCentralUs")
                    .withSku(new Sku().withName(SkuName.PREMIUM_AZURE_FRONT_DOOR)),
                Context.NONE);
    }
}