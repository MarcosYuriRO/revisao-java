package com.marcos.exercicios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.exercicios.Desafio01.Main01;
import com.marcos.exercicios.Desafio02.Main02;
import com.marcos.exercicios.Desafio03.Main03;
import com.marcos.exercicios.Desafio04.Main04;
import com.marcos.exercicios.Desafio05.Main05;

@SpringBootApplication
public class ExerciciosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Desafio 1:
		/*Main01 main = new Main01();
		main.showMain();*/

		//Desafio 2:
		/*Main02 main = new Main02();
		main.showMain();*/

		//Desafio 3:
		/*Main03 main = new Main03();
		main.showMain();*/

		//Desafio 4:
		/*Main04 main = new Main04();
		main.showMain();*/

		//Desafio 5:
		/*Main05 main = new Main05();
		main.showMain();*/
	}

}
