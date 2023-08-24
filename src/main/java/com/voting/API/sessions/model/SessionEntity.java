package com.voting.API.sessions.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "sessions")
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
}
