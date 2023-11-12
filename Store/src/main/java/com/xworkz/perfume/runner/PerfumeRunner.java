package com.xworkz.perfume.runner;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.config.PerfumeConfig;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repository.PerfumeRepository;
import com.xworkz.perfume.repository.PerfumeRepositoryImpl;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImpl;

public class PerfumeRunner {

	public static void main(String[] args) {
		PerfumeDTO perfumeDTO = new PerfumeDTO("Wildstone", 800, "India", 2);
		PerfumeDTO perfumeDTO4 = new PerfumeDTO("Denver", 900, "England", 4);

		ApplicationContext context = new AnnotationConfigApplicationContext(PerfumeConfig.class);

		PerfumeService service = context.getBean(PerfumeServiceImpl.class);

		PerfumeRepository perfumeRepository = context.getBean(PerfumeRepositoryImpl.class);

		service.validateAndSave(perfumeDTO);
		service.validateAndSave(perfumeDTO4);

		service.findByName("Wildstone");

		Collection<PerfumeDTO> found2 = service.readAll();
		System.out.println(found2);

		boolean check = service.isExist(perfumeDTO);
		System.out.println(check);

		Collection<PerfumeDTO> perfumes = service.updateByUsingName("Wildstone", 5000);

		for (PerfumeDTO p : perfumes) {
			System.out.println(p);
		}

		Collection<PerfumeDTO> perfumes1 = service.deleteByUsingName("Wildstone");

		for (PerfumeDTO p : perfumes1) {
			System.out.println(p);
		}

	}

}
