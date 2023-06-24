package com.enrich.domain.user;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

/** UserRepository. */
@Mapper
public interface UserRepository {

  List<UserEntity> findAll(String search, RowBounds rowBounds);

  Long countFindAll(String search);

  UserEntity findById(String userId);

  Long insert(String username, String password);

  Long update(String userId, String username, String password);

  Long delete(List<String> userIds);
}
