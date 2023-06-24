package com.enrich.common;

import java.util.List;
import lombok.Data;
import org.apache.ibatis.session.RowBounds;

/**
 * PagingResponse.
 *
 * @param <T> Object
 */
@Data
public class PagingResponse<T> {
  private List<T> data;
  private int page;
  private int size;
  private long totalElements;
  private int totalPages;

  /**
   * PagingResponse.
   *
   * @param data List Object
   * @param rowBounds RowBounds
   * @param totalElements Long
   */
  public PagingResponse(List<T> data, RowBounds rowBounds, Long totalElements) {
    this.data = data;
    this.size = rowBounds.getLimit();
    this.page = rowBounds.getOffset() / size;
    this.totalElements = totalElements;
    this.totalPages = (int) Math.ceil((double) totalElements / size);
  }
}
