// package objects;

class Calculator
{
    public int add(int a ,int b)
    {
        int r = a+b;
        return  r;
    }
}


public class index {
        public static void main(String[] args) {

            int a = 3;
            int b =8;

            Calculator calc = new Calculator();
            int result =  calc.add(a,b);
            
            System.out.println(result);
        



            // int result = a + b;
        }
    
}
