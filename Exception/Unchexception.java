package Texception;

import java.util.Scanner;

public class Unchexception {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        int a = 10;
        int b = 0;

        int c = 0;  
        ///=====================================================
        try {

            c = a / b;
        }
        catch(ArithmeticException e) {

            System.out.println(e);
        }
        //===================================================
        
        String s = null;

        int d = 0;
          
        try {

            d = s.length();
        }
        catch(NullPointerException e) {

            System.out.println(e);
        }
       //====================================================
        int n=5;
        int ar[] = new int[n];

        for(int i = 0; i < ar.length; i++) {

            ar[i]=sc.nextInt();
       }
       try {

            for(int i = 0; i <= ar.length; i++) {

                System.out.print(ar[i]);
           }
       }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }
       //==========================================================
       String t="java";
       try {
    	   System.out.print(t.charAt(10));
       }
       catch(StringIndexOutOfBoundsException e) {
       System.out.print(e);
       }
       
       //=========================================================
       
       String r="abd";
       try {
       int w=Integer.parseInt(r);
       }
       catch(NumberFormatException e) {
    	   System.out.println(e);
       }
       
       //=============================================================
        System.out.println();
        System.out.println(c);
        System.out.println(d);
        //System.out.println(k);
        //System.out.print(t.charAt(10));
    }
}