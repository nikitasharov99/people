package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("10101", "1010101"));
        System.out.println(bins.mult("10101", "1010101"));
    }
}