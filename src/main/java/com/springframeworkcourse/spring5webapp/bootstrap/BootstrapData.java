package com.springframeworkcourse.spring5webapp.bootstrap;

import com.springframeworkcourse.spring5webapp.models.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("Metodi", "Alexander Malinov 23",
                "Plovdiv", "Plovdiv", "4000");
        System.out.println("Created publisher: " + publisher);
    }
}
