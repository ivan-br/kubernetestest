package com.softdev.kubernetestest.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Random;

@RestController
public class MainResource {
    private Random random = new Random();
    private Integer randomValue;

    @PostConstruct
    public void postConstruct() {
        randomValue = random.nextInt(10000);
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage() {

        return "Unique per application:" + randomValue;
    }
}
