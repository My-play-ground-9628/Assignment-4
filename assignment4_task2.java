public class assignment4_task2 {
    public static void main(String[] args) {
        /*
            Single Loop, Nested Loops
            Via +
            + + + + + + +
            + + +   + + +
            + +       + +
            +           +
        */

        //Nested loops
        int x = 1;
        while (x < 5) {
            int y = 1;
            while (y <= 7) {
                if ((x == 2) & (y == 4)) {
                    System.out.print("  ");
                    
                }else if ((x == 3) & ((y == 3)|(y == 4)|(y == 5))) {
                    System.out.print("  ");
                
                }else if ((x == 4) & ((y == 2)|(y == 3)|(y == 4)|(y == 5)|(y == 6))) {
                    System.out.print("  ");


                }else System.out.print("+ "); 
                y++;    
            }
        System.out.println();
        x++;
        }

        System.out.println();
        
        // code 2 - using single loop
        int k = 0;
        while (k++ < 28) {
            if ((k == 11)|(k == 17)|(k == 18)|(k == 19)|(k == 23)|(k == 24)|(k == 25)|(k == 26)|(k == 27)) {
                System.out.print("  ");
            }else System.out.print("+ ");
            if (k % 7 == 0) System.out.println();
            
        }



        
    }
    
}
