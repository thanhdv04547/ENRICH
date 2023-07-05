package com.enrich.domain.user.search;

import com.enrich.common.PagingResponse;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** UserSearchController. */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping()
  public ResponseEntity<PagingResponse<UserSearchResponse>> search(
      @RequestBody UserSearchRequest userSearchRequest,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size) {
    RowBounds rowBounds = new RowBounds(page * size, size);
    return ResponseEntity.ok(userSearchService.findAll(userSearchRequest, rowBounds));
  }

  @GetMapping("/{userId}")
  public ResponseEntity<UserSearchResponse> searchById(@PathVariable String userId) {
    return ResponseEntity.ok(userSearchService.findById(userId));
  }
}
