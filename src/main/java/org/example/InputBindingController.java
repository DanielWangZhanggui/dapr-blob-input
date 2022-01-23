/*
 * Copyright (c) Microsoft Corporation and Dapr Contributors.
 * Licensed under the MIT License.
 */

package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * SpringBoot Controller to handle input binding.
 */
@RestController
public class InputBindingController {

  /**
   * Handles input binding from Dapr.
   * @param body Content from Dapr's sidecar.
   * @return Empty Mono.
   */
  @PostMapping(path = "/servicebusinput")
    public Mono<String> handleSVCBusBinding(@RequestBody(required = false) byte[] body) {
    return Mono.fromRunnable(() ->
            System.out.println("Received message through binding: " + (body == null ? "" : new String(body))));
  }


}
