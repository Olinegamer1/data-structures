package com.company;

import com.company.array.IntToPost;

public class InfixApp {
    public static void main(String[] args) {
        String str = "A*(B+C)-D/(E+F)";
        IntToPost theTrans = new IntToPost(str);
        String output = theTrans.doTrans();
        System.out.println(output);
    }
}
