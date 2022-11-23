package com.newhope.fortune.nullcheck;

public class HelloWorld {
    public void main(String[] args){
        System.out.println("Hello, World!");

        //int r =  computeAndGetValueFor("Hello");

    }


    static public String computeAndGetValueFor(String someInput) {


        if (null != someInput) {

        }

        return null;
    }

    /*
    val valueFromComputation = computeAndGetValueFor(someInput)
     if (valueFromComputation ! = null) {
        // do something with this value
    }
    */

    /*
    int value = 0;


try {
        value = numerator / denominator;
    } catch (Exception e) {
        // do something with the exception
        // or re-throw the exception
    } finally {

        // release resources that may leak memory

    }
    * */
}
