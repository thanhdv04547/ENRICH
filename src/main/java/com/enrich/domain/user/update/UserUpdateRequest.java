package com.enrich.domain.user.update;

import lombok.Data;

/** UserUpdateRequest. */
@Data
public class UserUpdateRequest {
  private String username;
  private String password;
}
