package com.shellrean.management.barang;

import com.shellrean.management.barang.constant.TipeBarangConstant;
import com.shellrean.management.barang.domain.dao.Barang;
import com.shellrean.management.barang.domain.dao.Stock;
import com.shellrean.management.barang.repository.BarangRepository;
import com.shellrean.management.barang.repository.StockRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BarangApplication {
	public static void main(String[] args) {
		SpringApplication.run(BarangApplication.class, args);
	}
}
