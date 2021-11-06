package com.shellrean.management.barang.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarangStockData {
    private Long id;

    private String nama;

    private String categori;

    private Integer berat;

    private Integer stok;
}
