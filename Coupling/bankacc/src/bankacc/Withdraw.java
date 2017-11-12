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
public class Withdraw extends Bank {

    int wd;

    void getin() throws IOException {
        System.out.println("Enter the amount to be withdrawn:");
        wd = sc.nextInt();
    }

    void show() {
        if (wd <= amtde) //DATA COUPLING// (passing variables again for use )
        {
            amtde -= wd;
            System.out.println("Balance after withdrawal:" + amtde);
            System.out.println(" ******************");
        } else //CONTROL COUPLING//(using true or false values)
        {
            System.out.println("You cannot withdraw this amount");
            System.out.println(" **********************");
        }

    }
}
