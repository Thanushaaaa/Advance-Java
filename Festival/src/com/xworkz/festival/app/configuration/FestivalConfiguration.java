package com.xworkz.festival.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dussehra;
import com.xworkz.festival.app.Eid;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.Janmashtami;
import com.xworkz.festival.app.Navrathri;
import com.xworkz.festival.app.Onam;
import com.xworkz.festival.app.Sankranthi;
import com.xworkz.festival.app.Shivrathri;

@Configuration
public class FestivalConfiguration {

	@Bean
	public Dussehra getDussehra() {
		return new Dussehra();
	}

	@Bean
	public Diwali getDiwali() {
		return new Diwali();
	}

	@Bean
	public Christmas getChristmas() {
		return new Christmas();
	}

	@Bean
	public Eid getEid() {
		return new Eid();
	}

	@Bean
	public Holi getHoli() {
		return new Holi();
	}

	@Bean
	public Janmashtami getJanmashtami() {
		return new Janmashtami();
	}

	@Bean
	public Navrathri getNavrathri() {
		return new Navrathri();
	}

	@Bean
	public Onam getOnam() {
		return new Onam();
	}

	@Bean
	public Sankranthi getSankranthi() {
		return new Sankranthi();
	}

	@Bean
	public Shivrathri getShivarathri() {
		return new Shivrathri();
	}

}
