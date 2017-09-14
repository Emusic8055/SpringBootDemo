/**
 * 
 */
package com.org.serviceLayer;

import org.springframework.stereotype.Service;

/**
 * @author chiyya
 *
 */

@Service
public class LoginService {

	public boolean validateUser(String userId, String password) {
		
		return userId.equalsIgnoreCase("springBoot")
				&& password.equalsIgnoreCase("Boot");
		
	}

}
