package com.example.diplom.services;


import com.example.diplom.entity.Application;
import com.example.diplom.entity.Client;
import com.example.diplom.entity.Photos;
import com.example.diplom.repositories.ApplicationRepository;
import com.example.diplom.repositories.PhotosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class PhotoService {

    private final PhotosRepository photosRepository;

    public List<Photos> listPhotos() {
        return photosRepository.findAll();
    }

    public void changeReasonToDecline (UUID id, String reason) {
        for (Photos photo: photosRepository.findAll()) {
            if (photo.getId().equals(id)) {
                photo.setReason(reason);
                photosRepository.save(photo);
            }
        }
    }

    public void createPhotos (Photos photos)
    {
        photosRepository.save(photos);
    }


}
