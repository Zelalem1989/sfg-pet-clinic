package com.example.springpetclinic.bootstrap;

import com.example.springpetclinic.model.Owner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner

    }
}
