package com.github.elczupakadra.projectName.infrastructure.typicode;

import com.github.elczupakadra.projectName.model.ToDoItem;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ToDoItemTypicodeAdapter implements ToDoItem {


    private final ToDoItemTypicode toDoItemTypicode;
    @Override
    public int getUserId() {
        return toDoItemTypicode.getUserId();
    }

    @Override
    public int getIdentifier() {
        return toDoItemTypicode.getId();
    }

    @Override
    public String getTitle() {
        return toDoItemTypicode.getTitle();
    }

    @Override
    public boolean isCompleted() {
        return toDoItemTypicode.isCompleted();
    }
}
