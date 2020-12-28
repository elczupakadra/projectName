package com.github.elczupakadra.projectName.infrastructure.typicode;

import com.github.elczupakadra.projectName.configuration.MapperConfiguration;
import com.github.elczupakadra.projectName.model.ToDoItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfiguration.class)
 interface ToDoItemTypicodeMapper {
    @Mapping(source = "id", target = "identifier")
    ToDoItem map(ToDoItemTypicode toDoItemTypicode);

}
