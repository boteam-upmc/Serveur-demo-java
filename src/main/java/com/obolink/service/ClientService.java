package com.obolink.service;

import com.obolink.domain.Client;
import com.obolink.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lijuan on 12/10/17.
 */
@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Transactional
    public Client create(Client client){
        // save client
        client = clientRepository.save(client);

        // return client
        return client;
    }
}
