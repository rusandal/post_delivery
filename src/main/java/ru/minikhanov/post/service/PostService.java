package ru.minikhanov.post.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.minikhanov.post.domain.DeliveryStatus;
import ru.minikhanov.post.domain.PostalPackage;
import ru.minikhanov.post.dto.PostalPackageDto;
import ru.minikhanov.post.repository.DeliveryStatusRepository;
import ru.minikhanov.post.repository.PostOfficeRepository;
import ru.minikhanov.post.repository.PostPackageRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class PostService {
    @Value("${delivery.time.min}")
    private int minDivTime;
    @Value("${delivery.time.max}")
    private int maxDivTime;
    private PostPackageRepository postRepository;
    private DeliveryStatusRepository deliveryStatusRepository;
    private PostOfficeRepository postOfficeRepository;
    private ModelMapper modelMapper;

    public PostService(PostPackageRepository postRepository, DeliveryStatusRepository deliveryStatusRepository, PostOfficeRepository postOfficeRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.deliveryStatusRepository = deliveryStatusRepository;
        this.postOfficeRepository = postOfficeRepository;
        this.modelMapper = modelMapper;
    }

    public void registrationPP(PostalPackage postalPackage) {
        if (!postOfficeRepository.existsByPostIndex(postalPackage.getPostalIndex())) {
            throw new RuntimeException("Post index not found.");
        }
        PostalPackage postalPackage1 = postRepository.save(postalPackage);
        DeliveryStatus deliveryStatus = new DeliveryStatus();
        deliveryStatus.setPostalPackage(postalPackage1);
        deliveryStatus.setRegTime(LocalDateTime.now());
        deliveryStatusRepository.save(deliveryStatus);
    }

    private void sendPostalPackage(PostalPackage postalPackage1) {
        //postalPackage1.setStatus(DeliveryStatus.SEND_TO_POST_OFFICE);
        while(!delivering()){

        }
    }

    public boolean delivering(){
        Random rand = new Random();
        int deliveryTime = rand.nextInt(maxDivTime - minDivTime) + maxDivTime;
        try {
            Thread.sleep(deliveryTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


}
