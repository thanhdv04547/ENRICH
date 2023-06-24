package com.enrich.domain.user.delete;

import com.enrich.domain.user.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** UserDeleteService. */
@Service
@RequiredArgsConstructor
public class UserDeleteService {

  private final UserRepository userRepository;

  @Transactional(rollbackFor = Exception.class)
  public Long delete(List<String> userIds) {
    return userRepository.delete(userIds);
  }
}
