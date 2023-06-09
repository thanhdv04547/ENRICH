package com.enrich.demo;

import com.enrich.demo.response.DemoResponse;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/** DemoRepository. */
@Mapper
public interface DemoRepository {

  List<DemoResponse> findAll();

  Long insert();
}
