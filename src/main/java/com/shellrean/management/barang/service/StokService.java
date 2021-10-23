package com.shellrean.management.barang.service;

import com.shellrean.management.barang.domain.dao.Stok;
import com.shellrean.management.barang.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StokService {
    @Autowired
    private StockRepository stockRepository;

    public Stok saveStok(Stok stock) {
        return stockRepository.save(stock);
    }

    public void deleteStokByBarang(Long id) {
        stockRepository.deleteByBarangId(id);
    }
}
