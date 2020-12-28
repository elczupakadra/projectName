package com.github.elczupakadra.projectName.infrastructure.typicode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.elczupakadra.projectName.model.ToDoItem;
import com.github.elczupakadra.projectName.service.ToDoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RequiredArgsConstructor
@Service
 class TypicodeService implements ToDoItemService {


    private final HttpClient httpClient;
    private final ToDoItemTypicodeMapper mapper;

    @Override
    public ToDoItem fetch(int id) {
        try {

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI("https://jsonplaceholder.typicode.com/todos/" + id))
                    .build();
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            var toDoItemTypicode =  new ObjectMapper().readValue(response.body(), ToDoItemTypicode.class);

            return mapper.map(toDoItemTypicode);

        } catch (URISyntaxException | InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
