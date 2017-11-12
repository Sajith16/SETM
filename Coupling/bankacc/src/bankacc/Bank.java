/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankacc;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SajithChamara
 */
public class Bank {

    Scanner sc = new Scanner(System.in);

    int accno, amtde;
    String name, acctype; //GLOBAL DATA COUPLING//(Sharing global variables)

    void getdata() throws IOException {
        System.out.println("Enter the Account No:");
        accno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account Type:");
        acctype = sc.nextLine();
        System.out.println("Enter the Customer Name:");
        name = sc.nextLine();;
        System.out.println("Enter the Initial Deposit:");
        amtde = sc.nextInt();
    }

    void display() {
        System.out.println("*******************");
        System.out.println("Account No: " + accno);
        System.out.println("Account Type: " + acctype);
        System.out.println("Customer Name: " + name);
        System.out.println("Initial Deposit: " + amtde);
    }
}
