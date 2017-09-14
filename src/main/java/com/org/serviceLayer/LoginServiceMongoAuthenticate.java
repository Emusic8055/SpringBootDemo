/**
 * 
 */
package com.org.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;



/**
 * @author chiyya
 *
 */
public class LoginServiceMongoAuthenticate implements UserDetailsService{
	
	 @Autowired
	    private MongoClient mongoClient;
	 
	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        MongoDatabase database = mongoClient.getDatabase("springsecurity");
	        
	        ApplicationContext ctx =
                    new AnnotationConfigApplicationContext(MailSenderAutoConfiguration.class);
		MongoOperations mongoOperation =
                    (MongoOperations) ctx.getBean("mongoTemplate");
		System.out.println("Case 1...");
		User userA = new User();
		mongoOperation.save(userA, "tableA");
	        return null;
	    }

}
