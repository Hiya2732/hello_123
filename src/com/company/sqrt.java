package com.company;
import java.util.*;

public class sqrt

{
    public static void main()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        double b =Math.sqrt(a);
        if(b%1==0)
        {
            System.out.println("Perfect square ");
        }
        else
            System.out.println("Not a Perfect square ");
    }
}

