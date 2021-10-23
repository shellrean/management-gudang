package com.shellrean.management.barang.repository;

import com.shellrean.management.barang.domain.dao.Stok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StockRepository extends JpaRepository<Stok, Long> {
    public void deleteByBarangId(Long id);
}
