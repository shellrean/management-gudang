package com.shellrean.management.barang.service;

import com.shellrean.management.barang.domain.dao.Ship;
import com.shellrean.management.barang.domain.dao.Shipper;
import com.shellrean.management.barang.repository.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperService {
    @Autowired
    private ShipperRepository shipperRepository;

    @Autowired
    private ShipService shipService;

    public List<Shipper> getAll() {
        return shipperRepository.findAll();
    }

    public Shipper saveShipper(Shipper shipper) {
        return shipperRepository.save(shipper);
    }

    public void deleteShipper(Long id) {
        shipperRepository.deleteById(id);
    }

    public List<Ship> getShipByShipper(Long id) {
        return shipService.findShipByShipper(id);
    }
}
