package com.obolink.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by lijuan on 12/10/17.
 */
@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
public class Client {
    @Id
    private String id;
    @NotNull
    @Column(unique = true)
    private String username;
    @NotNull
    private String password;
    private String token;

    public Client(String s, String format, String s1, String s2) {
    }
}
