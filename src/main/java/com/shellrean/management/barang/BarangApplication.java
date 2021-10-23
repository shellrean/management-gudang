package com.shellrean.management.barang;

import com.shellrean.management.barang.constant.TipeBarangConstant;
import com.shellrean.management.barang.domain.dao.Barang;
import com.shellrean.management.barang.repository.BarangRepository;
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
	CommandLineRunner commandLineRunner(BarangRepository barangRepository) {
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
			barangRepository.saveAll(List.of(barang1, barang2));
		};
	}
}
