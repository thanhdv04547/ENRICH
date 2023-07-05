package com.enrich.domain.user.update;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** UserUpdateController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserUpdateController {

  private final UserUpdateService userUpdateService;

  @PutMapping("/{userId}")
  public ResponseEntity<Long> update(
      @PathVariable String userId, @RequestBody UserUpdateRequest userUpdateRequest) {
    return ResponseEntity.ok(userUpdateService.update(userId, userUpdateRequest));
  }
}
