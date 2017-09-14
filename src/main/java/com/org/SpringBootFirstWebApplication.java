/**
 * 
 */
package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chiyya
 *
 */
@SpringBootApplication
@ComponentScan("com.org")
public class SpringBootFirstWebApplication {
	public static void main(String args[]){
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}
}
