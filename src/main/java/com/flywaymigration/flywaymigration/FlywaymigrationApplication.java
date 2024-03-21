package com.flywaymigration.flywaymigration;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywaymigrationApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FlywaymigrationApplication.class, args);

//        Flyway flyway = Flyway.configure()
//                .dataSource("jdbc:postgresql://localhost:5432/flywaymigration", "postgresql", "master")
//                .load();
//        flyway.repair();


    }

}
