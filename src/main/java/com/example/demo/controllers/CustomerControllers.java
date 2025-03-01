package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerControllers {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.getAll();
        model.addAttribute("customers", customers);
        return "customers"; // Renders customers.html
    }

    @GetMapping("/new")
    public String showAddCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form"; // Renders customer-form.html
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.onBoard(customer);
        return "redirect:/customers";
    }
    
    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable("id") int id, Model model) {
        Customer customer = customerService.getbyId(id);
        model.addAttribute("customer", customer);
        return "customer-details"; // Render customer-details.html
    }
    
    
    @GetMapping("/edit/{id}")
    public String showEditCustomerForm(@PathVariable int id, Model model) {
        Customer customer = customerService.getbyId(id);
        model.addAttribute("customer", customer);
        return "customer-form"; // Reuse customer-form.html
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteDetails(id);
        return "redirect:/customers";
    }
}
