package com.enrich.domain.user.search;

import com.enrich.common.PagingResponse;
import com.enrich.domain.user.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

/** UserSearchService. */
@Service
@RequiredArgsConstructor
public class UserSearchService {

  private final UserRepository userRepository;
  private final UserSearchResponse userSearchResponse;

  /**
   * findAll.
   *
   * @param userSearchRequest UserSearchRequest
   * @param rowBounds RowBounds
   * @return List UserSearchResponse
   */
  public PagingResponse<UserSearchResponse> findAll(
      UserSearchRequest userSearchRequest, RowBounds rowBounds) {
    List<UserSearchResponse> data =
        userRepository.findAll(userSearchRequest.getSearch(), rowBounds).stream()
            .map(userSearchResponse::of)
            .toList();
    Long totalElements = userRepository.countFindAll(userSearchRequest.getSearch());
    return new PagingResponse<>(data, rowBounds, totalElements);
  }

  public UserSearchResponse findById(String userId) {
    return userSearchResponse.of(userRepository.findById(userId));
  }
}
