package com.enrich.user.search;

import com.enrich.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/** UserSearchResponse. */
@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchResponse {
  private Long id;
  private String username;
  private String password;

  /**
   * Entity to response.
   *
   * @param userEntity UserEntity
   * @return UserSearchResponse
   */
  public UserSearchResponse of(UserEntity userEntity) {
    return UserSearchResponse.builder()
        .id(userEntity.getId())
        .username(userEntity.getUsername())
        .password(userEntity.getPassword())
        .build();
  }
}
