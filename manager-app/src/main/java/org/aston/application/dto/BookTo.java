package org.aston.application.dto;

import lombok.*;
import org.aston.application.entity.Author;
import org.aston.application.entity.User;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class BookTo {

    Long id;

    Author author;

    String title;

    String genre;

    int year;

    List<User> readers;

}
