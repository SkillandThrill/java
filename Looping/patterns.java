public class patterns {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            System.out.println("DAY "+ i);
            for (int j=9;j<=18;j++){
                if(j<12){
                    System.out.println(j + " am " +"to " + (j+1) + " am");
                }else{
                    System.out.println(j + (" pm ") +"to " + (j+1) + " pm");
                }
            }

        }

    }
}
