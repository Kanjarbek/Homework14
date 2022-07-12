package com.company;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class(1,"Peaksofthouse",new int[]{15,45,60});
        System.out.println("Word:  " + clas.getWord());
        System.out.println("Number: " + clas.getNumber());
    }
}