package com.enrich.demo;

import com.enrich.demo.response.DemoResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/** EnrichServiceImpl. */
@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

  private final DemoRepository demoRepository;

  @Override
  public List<DemoResponse> findAll() {
    return demoRepository.findAll();
  }

  @Override
  public Long insert() {
    return demoRepository.insert();
  }
}
