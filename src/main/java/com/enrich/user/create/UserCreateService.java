package com.enrich.user.create;

import com.enrich.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** UserCreateService. */
@Service
@RequiredArgsConstructor
public class UserCreateService {

  private final UserRepository userRepository;

  @Transactional(rollbackFor = Exception.class)
  public Long insert(UserCreateRequest userCreateRequest) {
    return userRepository.insert(userCreateRequest.getUsername(), userCreateRequest.getPassword());
  }
}
