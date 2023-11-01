package com.xworkz.theater.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.theater.Hollywood;
import com.xworkz.theater.Movie;
import com.xworkz.theater.config.MovieConfig;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);

		Movie movie = context.getBean(Hollywood.class);
		movie.produce();

	}

}
