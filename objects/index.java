
class Calculator
{
    public int add(int a ,int b)
    {
        int r = a+b;
        return  r;
    }
}

class Multiply{

    public int times(int a , int b)
    {
        int r = a*b;
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
            
            Multiply mul = new Multiply();
            int mulResult = mul.times(a, b);

            System.out.println(mulResult);


            // int result = a + b;
            // cmnt
        }
    
}
