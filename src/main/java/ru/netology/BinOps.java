package ru.netology;

import static java.lang.Integer.parseInt;
import static java.lang.Long.toBinaryString;

public class BinOps {
    public String sum(String a, String b) {
        int i = parseInt(a, 2) + parseInt(b, 2);
        return toBinaryString(i);
    }

    public String mult(String a, String b) {
        int i = parseInt(a, 2) * parseInt(b, 2);
        return toBinaryString(i);
    }
}