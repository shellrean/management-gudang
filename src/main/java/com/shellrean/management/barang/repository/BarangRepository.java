package com.shellrean.management.barang.repository;

import com.shellrean.management.barang.domain.dao.Barang;
import com.shellrean.management.barang.domain.dto.BarangStockData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {

    @Query("SELECT new com.shellrean.management.barang.domain.dto.BarangStockData(b.id, b.nama, b.categori,b.berat, s.stok)" +
            "FROM Barang b INNER JOIN Stock s ON s.barangId = b.id")
    List<BarangStockData> barangAllWithStock();
}
