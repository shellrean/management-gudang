package com.shellrean.management.barang.controller;

import com.shellrean.management.barang.domain.dao.Ship;
import com.shellrean.management.barang.domain.dao.Shipper;
import com.shellrean.management.barang.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ShipperController {
    @Autowired
    private ShipperService shipperService;

    @GetMapping("shipper")
    public List<Shipper> getAll() {
        return shipperService.getAll();
    }

    @PostMapping("shipper")
    public Shipper saveShipper(@RequestBody Shipper shipper) {
        return shipperService.saveShipper(shipper);
    }

    @PutMapping("shipper")
    public Shipper updateShipper(@RequestBody Shipper shipper) {
        return shipperService.saveShipper(shipper);
    }

    @DeleteMapping("shipper/{id}")
    public void deleteShipper(@PathVariable Long id) {
        shipperService.deleteShipper(id);
    }

    @GetMapping("shipper/{id}/shipping")
    public List<Ship> getShipShipper(@PathVariable Long id) {
        return shipperService.getShipByShipper(id);
    }
}
