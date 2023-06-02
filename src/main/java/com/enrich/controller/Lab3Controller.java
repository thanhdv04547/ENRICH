package com.enrich.controller;

import com.enrich.entity.DemoEntity;
import com.enrich.service.EnrichService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** HelloWorldController. */
@RestController
@RequiredArgsConstructor
public class Lab3Controller {

  private final EnrichService enrichService;

  @GetMapping("/demo")
  public ResponseEntity<List<DemoEntity>> getDemo() {
    List<DemoEntity> demoEntityList = enrichService.getDemo();
    return ResponseEntity.ok(demoEntityList);
  }
}
