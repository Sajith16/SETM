/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankacc;

import java.io.IOException;

/**
 *
 * @author SajithChamara
 */
public class Deposit extends Bank {

    int dt;

    void get() throws IOException {
        System.out.println("Enter the amount to be deposited:");
        dt = sc.nextInt();
    }

    void print() {
        amtde += dt; //LEXICAL CONTENT COUPLING//(Same content)
        System.out.println("Balance after deposit:" + amtde);
        System.out.println("********************");
    }
}
