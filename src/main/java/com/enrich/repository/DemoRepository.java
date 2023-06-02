package com.enrich.repository;

import com.enrich.entity.DemoEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/** DemoRepository. */
@Mapper
public interface DemoRepository {
  @Select("SELECT * FROM demo")
  List<DemoEntity> getAllDemo();
}
