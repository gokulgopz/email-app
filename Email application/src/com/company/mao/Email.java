package com.company.mao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Email {
    private String Firstname;
    private String Lastname;
    private String password;
    private String Department;
    private  int mailboxcapacity;
    private String alternativeemail;
    //to get first name and last name
    
    //private inc 

    public Email(String Firstname,String Lastname){

        this.Firstname = Firstname;// this is string private first name
        this.Lastname = Lastname; // this is string private first name
        System.out.println("Email Created "+this.Firstname+" "+this.Lastname); // statement print of private inc 
        this.Department=setdepartment();
        System.out.println("DEPARTMENT "+this.Department);





    }
    private String setdepartment() {

        System.out.println("DEPARTMENT CODES\n1 for sales \n2 for Developing \n3 for Accounting \n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "Developing";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }


    }

    private String randomPassword(int length){

        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[]pasword = new char[length];
        for(int i=0;i<length;i++){
         int rand =(int)(Math.random() * passwordSet.length());
            pasword[i]=passwordSet.charAt(rand);


        }
        return new String(pasword);

    }


    }


    //mark the department


    //set mailbox capacity
    //set alternativeemail
    //generate random strings





