// package classes and objects;

class Calculator {

    // int a;
    public int add(int n1, int n2) {

        int r = n1 + n2;
        return r;
    }
}

public class index {

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 4;
        // int result = num1+num2;

        Calculator calc = new Calculator();

        int result = calc.add(6, 4);

        System.out.println(result);
    }

}

// object oriented programming 
//object has the properties and the behaviors
//to create a object have to create the class first

//
// ?

