package com.shellrean.management.barang.repository;

import com.shellrean.management.barang.domain.dao.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
}
