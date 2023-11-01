package com.xworkz.festival.app.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dussehra;
import com.xworkz.festival.app.Eid;
import com.xworkz.festival.app.Festival;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.Janmashtami;
import com.xworkz.festival.app.Navrathri;
import com.xworkz.festival.app.Onam;
import com.xworkz.festival.app.Sankranthi;
import com.xworkz.festival.app.Shivrathri;
import com.xworkz.festival.app.configuration.FestivalConfiguration;

public class FestivalRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FestivalConfiguration.class);

		Festival fest = context.getBean(Diwali.class);
		fest.celebrate();
		fest.pray();

		System.out.println("-------");

		Festival fest1 = context.getBean(Dussehra.class);
		fest1.celebrate();
		fest1.pray();

		System.out.println("-------");

		Festival fest2 = context.getBean(Christmas.class);
		fest2.celebrate();
		fest2.pray();

		System.out.println("-------");

		Festival fest3 = context.getBean(Eid.class);
		fest3.celebrate();
		fest3.pray();

		System.out.println("-------");

		Festival fest4 = context.getBean(Holi.class);
		fest4.celebrate();
		fest4.pray();

		System.out.println("-------");

		Festival fest5 = context.getBean(Janmashtami.class);
		fest5.celebrate();
		fest5.pray();

		System.out.println("-------");

		Festival fest6 = context.getBean(Navrathri.class);
		fest6.celebrate();
		fest6.pray();

		System.out.println("-------");

		Festival fest7 = context.getBean(Onam.class);
		fest7.celebrate();
		fest7.pray();

		System.out.println("-------");

		Festival fest8 = context.getBean(Sankranthi.class);
		fest8.celebrate();
		fest8.pray();

		System.out.println("-------");

		Festival fest9 = context.getBean(Shivrathri.class);
		fest9.celebrate();
		fest9.pray();
	}

}
