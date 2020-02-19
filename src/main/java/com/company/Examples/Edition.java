package com.company.Examples;

public enum Edition {
        I(1 , 2010 ) , II(8 , 2010) , III(1 , 2011) , IV(8 , 2011) ,
        V(2 , 2012) , VI(10 , 2012) , VII(5 , 2014) , VIII(12 , 2014) ,
        IX(7 , 2015) , X(1 , 2017) , XI(10 , 2018) , XII(8 , 2019);


        int year;
        int month;

        Edition(int month , int year) {
            this.year = year;
            this.month =  month;
        }

    public String toString() {
        return "Edition is:" + this.name() + " " +
                "Month is:" + this.month + " " +
                 "Year is:" + this.year;

    }
    public static void main(String [] args) {
            System.out.println(Edition.I);
    }
}
