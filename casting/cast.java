public class cast{
    public static void main(String[] args) {
        int myInt =9;
        double myDouble = myInt; // Automatic casting int to double

        System.out.println(myInt); //Outputs 9
        System.out.println(myDouble); //Outputs 9.0

        double myDoublee = 9.787d;
        int myIntt = (int)myDoublee;

        System.out.println(myDoublee);
        System.out.println(myIntt);


        byte b = 127;
        int a= 256;

        // byte k = a;
        // System.out.println(k);


        float f =5.6f;
        // int t = (int) f;

        // System.out.println(t);


        byte a =10;
        byte b =30;

        int result = a*b;
        System.out.println(result);
    }
}
