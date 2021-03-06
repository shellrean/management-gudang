package com.shellrean.management.barang.service;

import com.shellrean.management.barang.domain.dao.Ship;
import com.shellrean.management.barang.domain.dto.ShippingTractData;
import com.shellrean.management.barang.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    @Autowired
    private ShipRepository shipRepository;

    public List<Ship> getShipByBarang(Long id) {
        return shipRepository.findByBarangId(id);
    }

    public List<ShippingTractData> findShipByShipper(Long id) {
        return shipRepository.findByTrackShipperId(id);
    }
}
