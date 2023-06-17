package com.enrich.user.update;

import com.enrich.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** UserUpdateService. */
@Service
@RequiredArgsConstructor
public class UserUpdateService {

  private final UserRepository userRepository;

  @Transactional(rollbackFor = Exception.class)
  public Long update(String userId, UserUpdateRequest userUpdateRequest) {
    return userRepository.update(
        userId, userUpdateRequest.getUsername(), userUpdateRequest.getPassword());
  }
}
