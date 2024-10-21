public class prettyHeader {
    public static void prettyHeader(String msg) {


        int msgStart = 60/2 - msg.length()/2;


        int i = 0;
        for (i = 1; i <= 60; i++) {
            System.out.print("*");  // This works, but is not optimal for larger loops
        }
        System.out.print("\n");
        i = 0;
        for (i = 1; i <= 60; i++) {
            if (i > 3) {
                if (i == msgStart ){
                    System.out.print(msg);
                    i += msg.length() -1;



                }


                else if (i >=58 && i <=60) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } else {
                System.out.print("*");
            }
        }


        System.out.print("\n");
        for (i = 1; i <= 60; i++) {
            System.out.print("*");  // This works, but is not optimal for larger loops
        }

    }
}
