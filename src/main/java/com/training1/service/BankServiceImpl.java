package com.training1.service;

import com.training1.model.Customer;
import com.training1.model.Transaction;
import com.training1.repository.CustomerRepository;
import com.training1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BankServiceImpl implements BankService
{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Customer addNewCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id)
    {
        System.out.println("Inside getCust Impl="+id);
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }



   /* @Override
    public Transaction depositAmount(Transaction transaction)
    {
        int custId=transaction.getCustId();
        double amount=transaction.getAmount();

        Optional<Customer> customer=customerRepository.findById(custId);
        double balance = customer.get().getBalance();
        balance+=amount;
        Customer customer1=customer.get();
        customer1.setBalance(balance);
        customerRepository.save(customer1);
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction withdrawAmount(Transaction transaction)
    {
        int custId=transaction.getCustId();
        double amount=transaction.getAmount();

        Optional<Customer> customer=customerRepository.findById(custId);
        double balance=customer.get().getBalance();
        balance-=amount;
        customer.get().setBalance(balance);
        customerRepository.save(customer.get());
        return transactionRepository.save(transaction);
    }*/

    @Override
    public Transaction createNewTransaction(Transaction transaction)
    {
        int custId=transaction.getCustId();
        double amount= transaction.getAmount();
       Optional<Customer> customer= customerRepository.findById(custId);
       Customer customer1=customer.get();
       double balance=customer1.getBalance();
       String txnType=transaction.getTxnType();
       if(txnType.equalsIgnoreCase("deposit"))
           balance+=amount;

       if(txnType.equalsIgnoreCase("withdraw"))
           balance-=amount;

       customer1.setBalance(balance);
       customerRepository.save(customer1);
       return transactionRepository.save(transaction);
    }


}
