public class assignment4_task5 {
    public static void main(String[] args) {
        /*
            Nested Loops
            Via + / \
            + + + + + 
            + / + \ +
            + + + + +
            + \ + / +
            + + + + +
        */

        //Nested loops
        int x = 1;
        while (x < 6) {
            int y = 1;
            while (y <= 5) {
                if ((x == 2) & (y == 2)) {
                    System.out.print("/ ");

                }else if ((x == 2) & (y == 4)) {
                    System.out.print("\\ ");


                }else if ((x == 4) & (y == 2)) {
                    System.out.print("\\ ");

                }else if ((x == 4) & (y == 4)) {
                    System.out.print("/ ");


                }else System.out.print("+ "); 
                y++;    
            }
        System.out.println();
        x++;
        }



    }
    
}
