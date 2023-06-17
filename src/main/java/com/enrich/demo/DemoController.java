package com.enrich.demo;

import com.enrich.demo.response.DemoResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** HelloWorldController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {

  private final DemoService demoService;

  @GetMapping()
  public ResponseEntity<List<DemoResponse>> getDemo() {
    List<DemoResponse> demoResponses = demoService.findAll();
    return ResponseEntity.ok(demoResponses);
  }

  @PostMapping()
  public ResponseEntity<Long> createDemo() {
    Long recordSuccess = demoService.insert();
    return ResponseEntity.ok(recordSuccess);
  }
}
