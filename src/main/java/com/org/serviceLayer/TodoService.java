/**
 * 
 */
package com.org.serviceLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.springModel.Todo;

/**
 * @author chiyya
 *
 */

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	static {
		todos.add(new Todo(1, "user", "Missouri", new Date(), false ));
		todos.add(new Todo(2, "West Desmoines", "Iowa", new Date(), false));
		todos.add(new Todo(3, "Detroit", "Michigan", new Date(), false));
	}
	public List<Todo> retriveTodos(String user){
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for(Todo todo : todos){
			if(todo.getUser().equals(user)){
				filteredTodos.add(todo);	
			}
		}
		return filteredTodos;
	}
}
