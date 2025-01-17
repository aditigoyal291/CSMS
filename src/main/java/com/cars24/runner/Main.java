package com.cars24.runner;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        boolean exit=true;

        while(exit)
        {
            System.out.println("enter choice");
            System.out.println("1. for add user");
            System.out.println("2. for get user");
            System.out.println("4. for delete user");
            System.out.println("0. for exit");
            int choice=scanner.nextInt();
            switch (choice){
                //call
                case 1: Ui.addCustomer();
                break;
                case 2: Ui.getCustomer();
                break;
                case 3: Ui.updateCustomer();
                break;
                case 4: Ui.deleteCustomer();
                break;
                case 0:exit=false;
                break;

            }

        }
    }
}