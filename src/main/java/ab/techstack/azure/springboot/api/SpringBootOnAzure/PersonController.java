package ab.techstack.azure.springboot.api.SpringBootOnAzure;

import ab.techstack.azure.springboot.api.SpringBootOnAzure.entity.Person;
import ab.techstack.azure.springboot.api.SpringBootOnAzure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/hello")
    @ResponseBody
    public String helloApi(){
        return "Hello Azure!!!";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
}
