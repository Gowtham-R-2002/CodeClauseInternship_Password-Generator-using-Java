package com.gowthamr.passwordgui;
import java.util.*;

class Password{
    private static String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lows="abcdefghijklmnopqrstuvwxyz";
    private static String nums="1234567890";
    private static String syms="!@#$%^&*()_+-=?";

    public static String everything= caps + lows + nums + syms;
    public static Random random=new Random();

    public static String generator(int x){
        String password="";
     
            for(int i=0;i<x;i++){
                int tempNum=random.nextInt(everything.length());
                password+=everything.charAt(tempNum);
            }
        
        return password;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of your Password...");
        int n=s.nextInt();
        if(n<=5){
            System.out.println("Password size must be greater than 5");
        }
        else{
        System.out.println("Your generated password is :\n"+generator(n));
        }
        s.close();
    }
}