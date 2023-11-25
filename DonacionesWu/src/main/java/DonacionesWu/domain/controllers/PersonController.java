package DonacionesWu.domain.controllers;

import DonacionesWu.domain.entities.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import DonacionesWu.domain.service.PersonService;

import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class PersonController {
    private final PersonService service;

    @GetMapping("/list")
    public String listAllPerson(Model model) {
        List<Person> personList = service.list();
        model.addAttribute("personList", personList);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Person());
        return "form";
    }

    /**@GetMapping("/id")
    public String buscarId(Model model){

    }**/
}

