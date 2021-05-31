package firstwebapp.todo;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> list = new ArrayList<>();
	private static int todoCount = 4;
	
	static {
		for(int i = 0; i < todoCount; i++) {
			list.add(new ToDo(i, "Milan", "MastKam" + i, new Date(), false));
		}
	}
	
	public void addToDo(String name, String desc) {
		list.add(new ToDo(todoCount++, name, desc, new Date(), false));
	}
	
	public void deleteToDo(int id) {
		Iterator<ToDo> itr = list.iterator();
		while(itr.hasNext()) {
			ToDo temp = itr.next();
			System.out.println(temp.getId());
			if(id == temp.getId()) {
				itr.remove();
				return;
			}				
		}
		return;
	}
	
	public ToDo getAttribute(int id) {
		for(ToDo t : list) {
			if(t.getId() == id) return t;
		}
		return new ToDo();
	}
	
	public List<ToDo> sendAllToDo(){
		return list;
	}
}
