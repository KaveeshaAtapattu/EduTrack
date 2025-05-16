package com.edutrack

import jakarta.persistence.*;
import lombok.*;

@entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String username;

    @Column(unique = true)
    private String email;


    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}