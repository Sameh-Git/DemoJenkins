package com.sip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.amsutil.Calcul;

@SpringBootApplication
public class HelloWorldJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldJenkinsApplication.class, args);
		System.out.println("Hello JUNIT");

		Calcul c = new Calcul();
		int res = c.somme(10, 4);
		System.out.println("Le result est :" + res);
	}

}
