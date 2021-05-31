package firstwebapp.todo;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {
	
	@Autowired
	ToDoService toDoService;	
	
	@RequestMapping(value = "/list-todo", method = RequestMethod.GET)
	public String listToDo(ModelMap model) {
		model.addAttribute("todo", toDoService.sendAllToDo());
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String addToDoGet(ModelMap model) {
		model.addAttribute("todo", new ToDo());
		return "addtodo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addToDoPost(ToDo todo, ModelMap model) {
		toDoService.addToDo(todo.getUser(), todo.getDesc());
		model.addAttribute("todo", toDoService.sendAllToDo());
		return "todo";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteToDoGet(@RequestParam int id, ModelMap model) {
		toDoService.deleteToDo(id);
		model.addAttribute("todo", toDoService.sendAllToDo());
		return "todo";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.POST)
	public String deleteToDoPost(@RequestParam String id, ModelMap model) {
		System.out.println(id);
		toDoService.deleteToDo(Integer.parseInt(id));
		model.addAttribute("todo", toDoService.sendAllToDo());
		return "todo";
	}
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String updateToDo(@RequestParam int id, ModelMap model){
		model.addAttribute("todo", toDoService.getAttribute(id));
		toDoService.deleteToDo(id);
		return "addtodo";
	}
	
	
}
