/*
 * Copyright (c) Microsoft Corporation and Dapr Contributors.
 * Licensed under the MIT License.
 */

package org.example;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Service for input binding example.
 * 1. From your repo root, build and install jars:
 * mvn clean install
 * 2. cd to [repo-root]/examples
 * 3. Run :
 * dapr run --components-path ./components/bindings --app-id inputbinding --app-port 3000 \
 *   -- java -jar target/dapr-java-sdk-examples-exec.jar io.dapr.examples.bindings.http.InputBindingExample -p 3000
 */
@SpringBootApplication
public class InputBindingApp {

  /**
   * The entry point of this app.
   * @param args The port this app will listen on.
   * @throws Exception The Exception.
   */
  public static void main(String[] args) throws Exception {
    SpringApplication app = new SpringApplication(InputBindingApp.class);
    app.run(String.format("--server.port=%d", 8080));
  }
}
