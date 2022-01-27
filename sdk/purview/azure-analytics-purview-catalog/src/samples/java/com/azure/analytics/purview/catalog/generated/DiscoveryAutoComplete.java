// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.DiscoveryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DiscoveryAutoComplete {
    public static void main(String[] args) {
        DiscoveryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildDiscoveryClient();
        BinaryData autoCompleteRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"and\":[{\"entityType\":\"azure_blob_path\",\"includeSubTypes\":false}]},\"keywords\":\"exa\",\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.autoCompleteWithResponse(autoCompleteRequest, requestOptions);
    }
}