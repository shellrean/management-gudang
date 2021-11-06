package com.shellrean.management.barang.controller;

import com.shellrean.management.barang.domain.dao.Barang;
import com.shellrean.management.barang.domain.dao.Ship;
import com.shellrean.management.barang.domain.dto.BarangStockData;
import com.shellrean.management.barang.service.BarangService;
import com.shellrean.management.barang.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class BarangController {

    @Autowired
    private BarangService barangService;

    @Autowired
    private ShipService shipService;

    @GetMapping("barang")
    public List<BarangStockData> getAllBarang() {
        return barangService.getAllBarang();
    }

    @PostMapping("barang")
    public Barang saveBarang(@RequestBody Barang barang) {
        return barangService.saveBarang(barang);
    }

    @PutMapping("barang")
    public Barang updateBarang(@RequestBody Barang barang) {
        return barangService.saveBarang(barang);
    }

    @DeleteMapping("barang/{id}")
    public void deleteBarang(@PathVariable Long id) {
        barangService.deleteBarang(id);
    }

    @GetMapping("barang/{id}/ship")
    public List<Ship> getBarangShip(@PathVariable Long id) {
        return shipService.getShipByBarang(id);
    }
}
