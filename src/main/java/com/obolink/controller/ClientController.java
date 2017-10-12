package com.obolink.controller;

import com.obolink.domain.Client;
import com.obolink.domain.ClientCoefficient;
import com.obolink.repository.ClientRepository;
import com.obolink.repository.CoefficientRepository;
import com.obolink.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lijuan on 12/10/17.
 */
@RestController
@RequestMapping(value = "/api/clients")
public class ClientController {

    @Autowired
    ClientService clientService;
    @Autowired
    ClientRepository clientRepository;

    @PostMapping
    public Client create(@Validated @RequestBody Client client){
        return clientService.create(client);
    }

    @GetMapping(value = "/{id}")
    public Client get(@PathVariable("id") String id){
        return clientRepository.findOne(id);
    }
}
