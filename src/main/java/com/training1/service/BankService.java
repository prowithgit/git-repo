package com.training1.service;

import com.training1.model.Customer;
import com.training1.model.Transaction;

import java.util.List;
import java.util.Optional;

public interface BankService
{
     Customer addNewCustomer(Customer customer);

     Optional<Customer> getCustomerById(Integer id);

    List<Customer> getAllCustomers();

   // Transaction depositAmount(Transaction transaction);

   // Transaction withdrawAmount(Transaction transaction);

    Transaction createNewTransaction(Transaction transaction);

}
