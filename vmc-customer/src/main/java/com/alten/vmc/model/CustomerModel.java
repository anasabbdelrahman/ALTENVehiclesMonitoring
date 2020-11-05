package com.alten.vmc.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.*;
import org.checkerframework.checker.signature.qual.Identifier;
import org.springframework.data.annotation.Id;
import org.springframework.mongodb.core.mapping.Document;
import java.util.List;

@Builder
@Getter
@Setter
@NonArgsConstructor
@AllArgsConstructor
@Document(collection = "CustomerModel")
public class CustomerModel {

    @Id
    private String id;
    private String name;
    private String age;
    private List <String> vehicles;
}
