package com.enrich.user.create;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** UserCreateController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserCreateController {

  private final UserCreateService userCreateService;

  @PostMapping()
  public ResponseEntity<Long> create(@RequestBody UserCreateRequest userCreateRequest) {
    return ResponseEntity.ok(userCreateService.insert(userCreateRequest));
  }
}
