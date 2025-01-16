package com.cars24.dao.impl;

import com.cars24.dao.CustomerDao;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.response.CustomerProfileResponse;
import com.cars24.util.DbUtil;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class CustomerDaoImpl implements CustomerDao {
/*

    @Override
    public String createCustomer(String name, String phone, String email, String address) throws SQLException {

        String insertSQL="INSERT INTO customers(customer_id,name,phone,email,address) VALUES"+"("+ 0+","+
                "'"+name+"'"+","+
                "'"+phone+"'"+","+
                "'"+email+"'"+","+
                "'"+address+"'"+");"; //statements //it executes the statement directly to the sql whereas prepare statement helps us to prevent sql injection attack


        Connection connection=DbUtil.getConnection();
                try {
                    Statement statement = connection.createStatement();
                    int rowsInserted = statement.executeUpdate(insertSQL);
                    System.out.println(rowsInserted + "row(s) inserted.");
                }
                catch (Exception e)
                {
                    System.out.println("Error while inserting values");
                    e.printStackTrace();
                }
        System.out.println(insertSQL);

        return "";
    }

    private final static String INSERT_SUCCESS_MESSAGE="Customer added successfully";
    private final static String INSERT_ERROR_MESSAGE="Error while adding customer";
    public String createCustomerV2(String name, String phone, String email, String address){
        String insertSQL="INSERT INTO customers(name, phone, email, address) VALUES (?,?,?,?)";
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(insertSQL);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,address);

            int rowsInserted=preparedStatement.executeUpdate();
            return INSERT_SUCCESS_MESSAGE;
//            System.out.println(rowsInserted+" row(s) inserted.");

        } catch (SQLException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            return INSERT_ERROR_MESSAGE;
        }
        
    }*/


    private final static String INSERT_SUCCESS_MESSAGE = "Customer added successfully";
    private final static String INSERT_ERROR_MESSAGE = "Error while adding customer";

    @Override
    public String createCustomer(AddCustomerReq addCustomerReq) {


        try {

            String insertSQL = "INSERT INTO customers(name, phone, email, address) VALUES (?,?,?,?)";
            Connection connection = DbUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, addCustomerReq.getName());
            preparedStatement.setString(2, addCustomerReq.getPhone());
            preparedStatement.setString(3, addCustomerReq.getEmail());
            preparedStatement.setString(4, addCustomerReq.getAddress());
            int rowsInserted = preparedStatement.executeUpdate();
            return INSERT_SUCCESS_MESSAGE;
        } catch (SQLException e) {
            e.printStackTrace();
            return INSERT_ERROR_MESSAGE;
        }


    }


    @Override
    public CustomerProfileResponse getCustomerDetails(CustomerProfileReq customerProfileReq) {
        try {
            String selectSQL = "SELECT name, phone, email,address FROM customers where email=? or phone=?";
            Connection connection = DbUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, customerProfileReq.getEmail());
            preparedStatement.setString(2, customerProfileReq.getPhone());

            CustomerProfileResponse customerProfileResponse=new CustomerProfileResponse();

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");

                customerProfileResponse.setName(resultSet.getString("name"));
                customerProfileResponse.setPhone(resultSet.getString("phone"));
                customerProfileResponse.setEmail(resultSet.getString("email"));
                customerProfileResponse.setAddress(resultSet.getString("address"));

                return customerProfileResponse;


            }


        } catch (Exception e) {
            System.out.println("Data not found!!");
            return null;
        }

        return null;
    }
}
