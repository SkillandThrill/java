// package objects;

class Multiply{
    public int mul(int a,int b)
    {
        int r = a*b;
        return  r;
    }
}


public class multiply {
    public static void main(String[] args) {
        int a = 4;
        int b =7;

        Multiply times = new Multiply();
        int result = times.mul(a,b);
        System.out.println(result);

    }
}
