package com.cars24.dao;

import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DelCustomerReq;
import com.cars24.data.response.CustomerProfileResponse;
import com.cars24.data.response.DelCustomerResponse;

import java.sql.SQLException;

//what to have in the class
public interface CustomerDao {
//    String createCustomer(String name, String phone, String email, String address) throws SQLException;


//    void updateCustomer();
//    void deleteCustomer();

    String createCustomer(AddCustomerReq addCustomerReq);
    CustomerProfileResponse getCustomerDetails(CustomerProfileReq customerProfileReq);

    String deleteCustomer(CustomerProfileReq customerProfileReq);
}
