/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setm;

/**
 *
 * @author SajithChamara
 */
public class SETM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B objectB = new B();
        objectB.printB();
        System.out.print("B can call parent ");
        objectB.printA();
        C objectC = new C();
        objectC.printC();
        System.out.print("C can call parent ");
        objectC.printA();
    }

}
