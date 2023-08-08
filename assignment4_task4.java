public class assignment4_task4 {
    public static void main(String[] args) {
        /* 
            Nested Loops
            Via + / \
            + + + + + +
            + + / \ + +
            + / / \ \ +
            + \ \ / / +
            + + \ / + +
            + + + + + +
        */
        
        //Nested loops
        int x = 1;
        while (x < 7) {
            int y = 1;
            while (y <= 6) {
                if ((x == 2) & (y == 3)) {
                    System.out.print("/ ");

                }else if ((x == 2) & (y == 4)) {
                    System.out.print("\\ ");
                    
                }else if ((x == 3) & ((y == 2)|(y == 3))) {
                    System.out.print("/ ");

                }else if ((x == 3) & ((y == 4)|(y == 5))) {
                    System.out.print("\\ ");

                }else if ((x == 4) & ((y == 2)|(y == 3))) {
                    System.out.print("\\ ");
                
                }else if ((x == 4) & ((y == 4)|(y == 5))) {
                    System.out.print("/ ");

                }else if ((x == 5) & (y == 3)) {
                    System.out.print("\\ ");

                }else if ((x == 5) & (y == 4)) {
                    System.out.print("/ ");


                }else System.out.print("+ "); 
                y++;    
            }
        System.out.println();
        x++;
        }

        System.out.println();

        //single loop
        int k = 0;
        while (k++ < 36) {
            if ((k == 9)|(k == 14)|(k == 15)|(k == 22)|(k == 23)|(k == 28)) {
                System.out.print("/ ");

            }else if ((k == 10)|(k == 16)|(k == 17)|(k == 20)|(k == 21)|(k == 27)) {
                System.out.print("\\ ");
            }else System.out.print("+ ");
            if (k % 6 == 0) System.out.println();
            
        }



    }
    
}
