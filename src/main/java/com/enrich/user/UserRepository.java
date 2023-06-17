package com.enrich.user;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/** UserRepository. */
@Mapper
public interface UserRepository {

  List<UserEntity> findAll();

  UserEntity findById(String userId);

  Long insert(String username, String password);

  Long update(String userId, String username, String password);

  Long delete(List<String> userIds);
}
