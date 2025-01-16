package com.cars24.services;

import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.response.CustomerProfileResponse;

public interface CustomerService {
    String registerCustomer(AddCustomerReq addCustomerReq);
    CustomerProfileResponse getCustomerDetails(CustomerProfileReq customerProfileReq);

//    String updateCustomer(AddCustomerReq addCustomerReq);
    // getCustomer();





}
