package com.obolink.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by lijuan on 12/10/17.
 */
@Entity
@Table(name = "coefficients")
@Data
@NoArgsConstructor
public class ClientCoefficient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    @NotNull
    private String clientId;
    @NotNull
    private Double coefficient;
}
