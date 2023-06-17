package com.enrich.user.delete;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** UserDeleteController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserDeleteController {

  private final UserDeleteService userDeleteService;

  @DeleteMapping()
  public ResponseEntity<Long> deleteUser(@RequestBody List<String> userIds) {
    return ResponseEntity.ok(userDeleteService.delete(userIds));
  }
}
