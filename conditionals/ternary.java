package conditionals;

public class ternary {
    public static void main(String[] args) {

        int x =70;
        int result = 0;

        // if(x%2 == 0)
        //     result = 2;
        // else
        //     result =1;


        // creating this expression with ternary operator

        result = x %2 ==0 ? 2 : 1;
        System.out.println(result);
    }
}
