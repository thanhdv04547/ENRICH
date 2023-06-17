package com.enrich.user.search;

import com.enrich.user.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/** UserSearchService. */
@Service
@RequiredArgsConstructor
public class UserSearchService {

  private final UserRepository userRepository;
  private final UserSearchResponse userSearchResponse;

  public List<UserSearchResponse> findAll() {
    return userRepository.findAll().stream().map(userSearchResponse::of).toList();
  }

  public UserSearchResponse findById(String userId) {
    return userSearchResponse.of(userRepository.findById(userId));
  }
}
