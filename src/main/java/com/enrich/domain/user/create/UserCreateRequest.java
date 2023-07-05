package com.enrich.domain.user.create;

import lombok.Data;

/** UserCreateRequest. */
@Data
public class UserCreateRequest {
  private String username;
  private String password;
}
