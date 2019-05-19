package com.annayoungyeun.folio.controllers;

import com.annayoungyeun.folio.models.InformationalText;
import com.annayoungyeun.folio.models.data.InformationalTextDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final InformationalTextDAO informationalTextDAO;

    @Autowired
    public DatabaseLoader(InformationalTextDAO informationalTextDAO) {
        this.informationalTextDAO = informationalTextDAO;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.informationalTextDAO.save(new InformationalText("bio", "This is a bio."));
    }
}
