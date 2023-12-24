package com.reotra.enabledhttpsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class EnabledHttpsDemoApplication implements CommandLineRunner {

    private final UserDemoRepository userDemoRepository;

    public EnabledHttpsDemoApplication(UserDemoRepository userDemoRepository) {
        this.userDemoRepository = userDemoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EnabledHttpsDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        userDemoRepository.saveAll(
                List.of(
                        UserDemo.builder().name("TRAORE").build(),
                        UserDemo.builder().name("SANO").build(),
                        UserDemo.builder().name("KABA").build(),
                        UserDemo.builder().name("KANDE").build(),
                        UserDemo.builder().name("KOUYATE").build()
                )
        );
        log.info("DATA saved: {}", userDemoRepository.findAll());
    }
}
