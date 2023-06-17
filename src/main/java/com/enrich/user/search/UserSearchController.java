package com.enrich.user.search;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** UserSearchController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping()
  public ResponseEntity<List<UserSearchResponse>> search() {
    return ResponseEntity.ok(userSearchService.findAll());
  }

  @GetMapping("/{userId}")
  public ResponseEntity<UserSearchResponse> searchById(@PathVariable String userId) {
    return ResponseEntity.ok(userSearchService.findById(userId));
  }
}
