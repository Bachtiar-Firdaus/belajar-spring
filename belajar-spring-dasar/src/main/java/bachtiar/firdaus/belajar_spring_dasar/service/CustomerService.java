package bachtiar.firdaus.belajar_spring_dasar.service;

import bachtiar.firdaus.belajar_spring_dasar.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;

//    @Getter
//    @Autowired
//    @Qualifier("normalCustomerRepository")
//    private CustomerRepository normalCustomerRepository;
//
//    @Getter
//    @Autowired
//    @Qualifier("premiumCustomerRepository")
//    private CustomerRepository premiumCustomerRepository;
}
