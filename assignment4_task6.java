public class assignment4_task6 {
    public static void main(String[] args) {
        /*
            Nested Loops
            Via + Space
                + 
              + + +
            + + + + + 
              + + + 
                + 
        */

        //Nested loops
        int x = 1;
        while (x < 6) {
            int y = 1;
            while (y <= 5) {
                if ((x == 1) & ((y == 1)|(y == 2)|(y == 4)|(y == 5))) {
                    System.out.print("  ");

                }else if ((x == 2) & ((y == 1)|(y == 5))) {
                    System.out.print("  ");

                }else if ((x == 4) & ((y == 1)|(y == 5))) {
                    System.out.print("  ");

                }else if ((x == 5) & ((y == 1)|(y == 2)|(y == 4)|(y == 5))) {
                    System.out.print("  ");


                }else System.out.print("+ "); 
                y++;    
            }
        System.out.println();
        x++;
        }
    }
    
}
