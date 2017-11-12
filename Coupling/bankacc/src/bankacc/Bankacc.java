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
public class Bankacc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                Withdraw w = new Withdraw();
                w.getdata();
                w.getin();
                w.display();
                w.show();
                break;
            case 2:
                Deposit d = new Deposit();
                d.getdata(); // INTERNAL DATA COUPLING/ (Modifying same method with different objects)
                d.get();
                d.display();
                d.print();
                break;
            default:
                System.out.println("Enter the choice 1 or 2");
                break;
        }
    }

}
