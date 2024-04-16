package com.example.diplom.services;

import com.example.diplom.entity.Application;
import com.example.diplom.repositories.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public void createApplication (Application application) {
       applicationRepository.save(application);
    }

}
