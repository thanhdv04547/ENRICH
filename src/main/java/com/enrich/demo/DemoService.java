package com.enrich.demo;

import com.enrich.demo.response.DemoResponse;
import java.util.List;

/** EnrichService. */
public interface DemoService {
  List<DemoResponse> findAll();

  Long insert();
}
