package com.shellrean.management.barang.service;

import com.shellrean.management.barang.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StokService {
    @Autowired
    private StockRepository stockRepository;
}
