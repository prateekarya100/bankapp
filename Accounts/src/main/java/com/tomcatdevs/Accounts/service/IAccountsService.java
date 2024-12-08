package com.tomcatdevs.Accounts.service;

import com.tomcatdevs.Accounts.dto.CustomerDto;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateCustomerAccountDetails(CustomerDto customerDto);

    boolean deleteCustomerAccount(String mobileNumber);
}
