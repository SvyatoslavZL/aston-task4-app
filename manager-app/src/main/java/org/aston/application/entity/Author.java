package org.aston.application.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "author")
public class Author implements Identifiable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firs_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany
    @JoinColumn(name = "author_id")
    @ToString.Exclude
    private List<Book> books = new ArrayList<>();

}
