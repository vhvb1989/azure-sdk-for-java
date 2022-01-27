// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.analytics.purview.catalog.TypesClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TypesGetEntityDefinitionByGuid {
    public static void main(String[] args) {
        TypesClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildTypesClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.getEntityDefinitionByGuidWithResponse("4bc54c37-98a8-4de8-9ee8-182610859d43", requestOptions);
    }
}