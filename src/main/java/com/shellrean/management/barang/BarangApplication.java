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

	@Bean
	CommandLineRunner commandLineRunner(BarangRepository barangRepository, StockRepository stockRepository) {
		return  (args) -> {
			Barang barang1 = Barang.builder()
					.id(1l)
					.nama("Pakaian Anak")
					.berat(1)
					.categori(TipeBarangConstant.TIPE_PAKAIAN)
					.build();

			Barang barang2 = Barang.builder()
					.id(2l)
					.nama("Setrika E3000")
					.berat(2)
					.categori(TipeBarangConstant.TIPE_ELEKTRONIK)
					.build();

			Stock stok1 = Stock.builder()
					.barangId(1l)
					.id(1l)
					.stok(0)
					.build();
			Stock stok2 = Stock.builder()
					.barangId(2l)
					.id(2l)
					.stok(0)
					.build();

			barangRepository.saveAll(List.of(barang1, barang2));
			stockRepository.saveAll(List.of(stok1, stok2));
		};
	}
}
