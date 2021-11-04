package com.shellrean.management.barang.controller;

import com.shellrean.management.barang.domain.dao.Stock;
import com.shellrean.management.barang.domain.dto.StockShipRqDTO;
import com.shellrean.management.barang.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class StockController {
    @Autowired
    private StockService stokService;

    @PostMapping("stock")
    public Stock saveStock(@RequestBody StockShipRqDTO req) {
        return stokService.addStockShip(req);
    }
}
