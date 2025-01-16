package com.cars24.services.impl;

import com.cars24.dao.CustomerDao;
import com.cars24.dao.impl.CustomerDaoImpl;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.response.CustomerProfileResponse;
import com.cars24.services.CustomerService;
import com.cars24.validations.CustomerValidator;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerDaoImpl customerDao=new CustomerDaoImpl();
    @Override
    public String registerCustomer(AddCustomerReq addCustomerReq) {
    try {


        CustomerValidator.validateAddCustomerReq(addCustomerReq);
        customerDao.createCustomer(addCustomerReq);


    } catch (Exception e) {
        System.out.println(e.getMessage());
//        throw new RuntimeException(e);
    }
        return "";
    }

    @Override
    public CustomerProfileResponse getCustomerDetails(CustomerProfileReq customerProfileReq) {
        return customerDao.getCustomerDetails(customerProfileReq);
    }
//    public String updateCustomer(AddCustomerReq addCustomerReq)
//    {
//        customerDao.updateCustomer(addCustomerReq);
//        return "";
//    }
}
