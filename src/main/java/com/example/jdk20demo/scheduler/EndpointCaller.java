package com.example.jdk20demo.scheduler;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Response;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@Component
public class EndpointCaller {

    private static final String URL = "https://jsonplaceholder.typicode.com/todos/1"; // Change this to the correct URL

    @Scheduled(fixedRate = 20000) // 10 seconds
    public void callEndpoint() throws IOException {
        AsyncHttpClient asyncHttpClient = Dsl.asyncHttpClient();

        CompletableFuture<Response> whenResponse = asyncHttpClient.prepareGet(URL).execute().toCompletableFuture();

        whenResponse.thenAccept(response -> {
            System.out.println("JSON Response from the scheduler: " + response.getResponseBody());
        }).exceptionally(t -> {
            t.printStackTrace();
            return null;
        }).join();

        asyncHttpClient.close();
    }
}
