// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityUpdateClassificationsByUniqueAttribute {
    public static void main(String[] args) {
        EntityClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildEntityClient();
        BinaryData atlasClassificationArray =
                BinaryData.fromString(
                        "[{\"typeName\":\"MICROSOFT.FINANCIAL.US.ABA_ROUTING_NUMBER\"},{\"typeName\":\"MICROSOFT.FINANCIAL.CREDIT_CARD_NUMBER\"}]");
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("attr:qualifiedName", "https://exampleaccount.core.windows.net");
        Response<Void> response =
                client.updateClassificationsByUniqueAttributeWithResponse(
                        "azure_storage_account", atlasClassificationArray, requestOptions);
    }
}