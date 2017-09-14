/**
 * 
 */
package com.org.connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mongodb.MongoClient;

/**
 * @author chiyya
 *
 */

@Configuration
@Profile("")
public class MongoConfiguration {
	
	@Bean
	public MongoClient createConnection(){
		return new MongoClient("127.0.0.1:27017");
		
	}

}
