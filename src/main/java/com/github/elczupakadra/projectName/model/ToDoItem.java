package com.github.elczupakadra.projectName.model;


import org.immutables.value.Value;

@Value.Immutable
public interface ToDoItem {

    int getUserId();

    int getIdentifier();

    String getTitle();

    boolean getCompleted();



}
