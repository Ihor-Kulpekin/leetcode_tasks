package com.company.easy.romanInteger;

public enum RomanIntegerEnum {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000),
    IV(4),
    IX(9),
    XL(40),
    XC(90),
    CD(400),
    CM(900);


    private int number;

    RomanIntegerEnum(int i) {
        this.number = i;
    }

    private int getNumber() {
        return number;
    }

    public static int romanInteger(RomanIntegerEnum[] romanIntegerEnums){
        int number = 0;
        for(int index = 0; index<romanIntegerEnums.length;index++){
            number += romanIntegerEnums[index].getNumber();
        }
        return number;
    }



}
