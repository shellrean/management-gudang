package com.shellrean.management.barang.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_ship")
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long barangId;

    private Integer stok;

    private String tipe;

    private Date tanggal;
}
