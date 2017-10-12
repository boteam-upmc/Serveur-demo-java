package com.obolink.controller;

import com.obolink.domain.ClientCoefficient;
import com.obolink.repository.CoefficientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijuan on 12/10/17.
 */
@RestController
@RequestMapping(value = "/api/clients/coefficients")
public class ClientCoefficientController {

    @Autowired
    CoefficientRepository coefficientRepository;

    @GetMapping(value = "/{clientId}")
    public ClientCoefficient getCoefficient(@PathVariable("clientId") String clientId){
        return coefficientRepository.findByClientId(clientId);
    }
}
