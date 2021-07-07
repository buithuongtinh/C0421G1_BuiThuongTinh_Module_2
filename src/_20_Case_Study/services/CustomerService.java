package _20_Case_Study.services;

import _20_Case_Study.models.Customer;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> getAll();
}
