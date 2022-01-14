package com.training1.controller;

import com.training1.model.Customer;
import com.training1.model.Transaction;
import com.training1.service.BankService;
import com.training1.service.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class BankController
{
    /*@Autowired
    @Qualifier("bankServiceImpl")
    private BankService bankServiceImpl;*/

    private BankServiceImpl bankServiceImpl;

    public BankController(BankServiceImpl bankServiceImpl)
    {
        this.bankServiceImpl = bankServiceImpl;
    }


    @PostMapping("/add")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return bankServiceImpl.addNewCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> fetchCustomerById(@PathVariable Integer id)
    {
        System.out.println("Id= "+id);
        return bankServiceImpl.getCustomerById(id);
    }

    @GetMapping("/customer")
    public List<Customer> fetchAllCustomers()
    {
        List<Customer> list= bankServiceImpl.getAllCustomers();
        return list;
    }

   /* @PostMapping("/deposit")
    public Transaction addAmount(@RequestBody Transaction transaction)
    {
      return bankServiceImpl.depositAmount(transaction);
    }

    @PostMapping("/withdraw")
    public Transaction subAmount(@RequestBody Transaction transaction)
    {
        return bankServiceImpl.withdrawAmount(transaction);
    }*/

    @PostMapping("/transact")
    public Transaction newTransaction(@RequestBody Transaction transaction)
    {
        return bankServiceImpl.createNewTransaction(transaction);
    }

}
