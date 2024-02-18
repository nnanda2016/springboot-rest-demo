package com.demo.controller;

import com.demo.model.DemoResponse;
import com.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @GetMapping(value = "/demo-ep/{someInput}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoResponse demoEndpoint1(@PathVariable("someInput") final String anInputString) {
        log.info("Received input String: {}", anInputString);

        final DemoResponse demoResponse = new DemoResponse();
        demoResponse.setInputString(demoService.doSomething(anInputString));

        return demoResponse;
    }
}
