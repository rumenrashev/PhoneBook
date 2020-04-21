package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.*;

@Controller
public class ContactController {
    private List<Contact> contacts;

    ContactController() {
        this.contacts = new ArrayList<>();
    }



    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index.html");
        modelAndView.addObject("contacts", this.contacts);
        return modelAndView;
    }
    @PostMapping("/")
    public  String storeContact(Contact contact) {
        System.out.println(contact.getName());
        Collections.sort(this.contacts, (e1,e2)-> e1.getName().compareToIgnoreCase(e2.getName()));
        this.contacts.add(contact);
        return "redirect:/";
    }
}
