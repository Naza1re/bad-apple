package com.badapple.servercommunication.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ip")
    private String ip;

    @Column(name = "name")
    private String name;

}
