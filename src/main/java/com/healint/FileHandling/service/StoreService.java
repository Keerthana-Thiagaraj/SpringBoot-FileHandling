package com.healint.FileHandling.service;

import com.healint.FileHandling.helper.CSVHelper;
import com.healint.FileHandling.model.StoreModel;
import com.healint.FileHandling.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public void save(MultipartFile file) {
        try {
            List<StoreModel> storeModels = CSVHelper.csvToStoreRecords(file.getInputStream());
            storeRepository.saveAll(storeModels);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<StoreModel> getAllStoreModels() {
        return storeRepository.findAll();
    }
}
