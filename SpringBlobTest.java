package org.example;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.apache.commons.cli.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@EnableAutoConfiguration
public class SpringBlobTest {
    // private DaprClient client = new DaprClientBuilder().build();
    @PostMapping(path = "/servicebusinput")
    public Mono<Object> handleInputBinding(@RequestBody(required = false) byte[] body) {
        return Mono.fromRunnable(() ->
                System.out.println("Received data through binding: " + (body == null ? "" : new String(body))));
    }

    public static void main(String [] args) throws Exception {
//        SpringApplication.run(SpringBlobTest.class, args);
        // System.out.println("Started-------------------------------");
        SpringApplication app = new SpringApplication(SpringBlobTest.class);
        app.run(String.format("--server.port=%d", 8081));
//        Options options = new Options();
//        options.addRequiredOption("p", "port", true, "The port this app will listen on.");
//
//        CommandLineParser parser = new DefaultParser();
//        CommandLine cmd = parser.parse(options, args);
//
//        // If port string is not valid, it will throw an exception.
//        int port = Integer.parseInt(cmd.getOptionValue("port"));
//
//        // Start Dapr's callback endpoint.
//        SpringApplication app = new SpringApplication(SpringBlobTest.class);
//        app.run(String.format("--server.port=%d", port));
    }
}
