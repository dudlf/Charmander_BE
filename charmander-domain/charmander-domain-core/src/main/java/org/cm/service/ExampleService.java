package org.cm.service;

import lombok.RequiredArgsConstructor;
import org.cm.domain.ExampleRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;
}
