package com.github.elczupakadra.projectName.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data // automat do tworzenia Lombokowych metod standardowych (get, set, constructor, equals itp.)
public class Pizza {

    private final Składnik składnik;

}
