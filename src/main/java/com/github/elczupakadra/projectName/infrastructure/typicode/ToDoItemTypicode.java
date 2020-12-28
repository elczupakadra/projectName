package com.github.elczupakadra.projectName.infrastructure.typicode;

import com.github.elczupakadra.projectName.model.ToDoItem;
import lombok.Data;

@Data
 class ToDoItemTypicode {

    private int userId;
    private int id;
    private String title;
    private boolean completed;


    public int getUserId() {
        return userId;
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public boolean getCompleted() {
        return completed;
    }
}
