package org.aston.application.dto;

import lombok.*;
import org.aston.application.entity.Book;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserTo {

    Long id;

    String login;

    String password;

    Role role;

    List<Book> books;

}
