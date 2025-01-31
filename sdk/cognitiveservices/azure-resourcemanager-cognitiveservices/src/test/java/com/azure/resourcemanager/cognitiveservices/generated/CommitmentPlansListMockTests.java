// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommitmentPlansListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":\"rvkwc\",\"properties\":{\"hostingModel\":\"ConnectedContainer\",\"planType\":\"yxgtczh\",\"current\":{\"tier\":\"bsdshmkxmaehvbbx\",\"count\":870827030,\"startDate\":\"tfnhtbaxkgxywr\",\"endDate\":\"pyklyhpluodpvru\"},\"autoRenew\":false,\"next\":{\"tier\":\"ibthostgktstvd\",\"count\":318971885,\"startDate\":\"edqbc\",\"endDate\":\"zlhp\"},\"last\":{\"tier\":\"qkdlw\",\"count\":1812491441,\"startDate\":\"mlkxtrqjfs\",\"endDate\":\"mbtxhwgf\"}},\"id\":\"srtawcoezbr\",\"name\":\"ubskhudygoookkq\",\"type\":\"qjbvleorfmlu\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommitmentPlan> response = manager.commitmentPlans().list("ssxmojms", "p", Context.NONE);

        Assertions
            .assertEquals(HostingModel.CONNECTED_CONTAINER, response.iterator().next().properties().hostingModel());
        Assertions.assertEquals("yxgtczh", response.iterator().next().properties().planType());
        Assertions.assertEquals("bsdshmkxmaehvbbx", response.iterator().next().properties().current().tier());
        Assertions.assertEquals(870827030, response.iterator().next().properties().current().count());
        Assertions.assertEquals(false, response.iterator().next().properties().autoRenew());
        Assertions.assertEquals("ibthostgktstvd", response.iterator().next().properties().next().tier());
        Assertions.assertEquals(318971885, response.iterator().next().properties().next().count());
    }
}
