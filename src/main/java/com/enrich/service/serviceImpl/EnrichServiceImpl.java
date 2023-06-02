package com.enrich.service.serviceImpl;

import com.enrich.entity.DemoEntity;
import com.enrich.repository.DemoRepository;
import com.enrich.service.EnrichService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/** EnrichServiceImpl. */
@Service
@RequiredArgsConstructor
public class EnrichServiceImpl implements EnrichService {

  private final DemoRepository demoRepository;

  @Override
  public List<DemoEntity> getDemo() {
    return demoRepository.getAllDemo();
  }
}
