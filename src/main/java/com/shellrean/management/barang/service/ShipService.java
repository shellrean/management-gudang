package com.shellrean.management.barang.service;

import com.shellrean.management.barang.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipService {
    @Autowired
    private ShipRepository shipRepository;
}
