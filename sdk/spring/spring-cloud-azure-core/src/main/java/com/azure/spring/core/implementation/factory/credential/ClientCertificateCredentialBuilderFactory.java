// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.implementation.factory.credential;

import com.azure.identity.ClientCertificateCredentialBuilder;
import com.azure.spring.core.aware.authentication.TokenCredentialOptionsAware;
import com.azure.spring.core.properties.AzureProperties;
import org.springframework.util.StringUtils;

/**
 * A credential builder factory for the {@link ClientCertificateCredentialBuilder}.
 */
public class ClientCertificateCredentialBuilderFactory extends AzureAadCredentialBuilderFactory<ClientCertificateCredentialBuilder> {

    /**
     * Create a {@link ClientCertificateCredentialBuilderFactory} instance with {@link AzureProperties}.
     * @param azureProperties The Azure properties.
     */
    public ClientCertificateCredentialBuilderFactory(AzureProperties azureProperties) {
        super(azureProperties);
    }

    @Override
    protected ClientCertificateCredentialBuilder createBuilderInstance() {
        return new ClientCertificateCredentialBuilder();
    }

    @Override
    protected void configureService(ClientCertificateCredentialBuilder builder) {
        super.configureService(builder);

        AzureProperties azureProperties = getAzureProperties();
        TokenCredentialOptionsAware.TokenCredential credential = azureProperties.getCredential();
        String clientCertificatePath = credential.getClientCertificatePath();
        if (StringUtils.hasText(clientCertificatePath)) {
            if (StringUtils.hasText(credential.getClientCertificatePassword())) {
                builder.pfxCertificate(clientCertificatePath, credential.getClientCertificatePassword());
            } else {
                builder.pemCertificate(clientCertificatePath);
            }
        }
    }

}