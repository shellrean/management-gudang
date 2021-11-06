package com.shellrean.management.barang.repository;

import com.shellrean.management.barang.domain.dao.Ship;
import com.shellrean.management.barang.domain.dto.ShippingTractData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
    List<Ship> findByBarangId(Long id);
    List<Ship> findByShipperId(Long id);

    @Query(value = "SELECT new com.shellrean.management.barang.domain.dto.ShippingTractData(b.nama, s.stok, s.tanggal, s.tipe) " +
            "FROM Ship s INNER JOIN Barang b ON b.id = s.barangId " +
            "WHERE s.shipperId = :id")
    List<ShippingTractData> findByTrackShipperId(Long id);
}
