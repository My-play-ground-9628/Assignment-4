public class assignment4_task1 {
    public static void main(String[] args) {
                /* 
            Single Loop, Nested Loops
            Via +
            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
         */

        
        int y = 0;
        int z = 5;

        while (y++ < 5){

            int x = 0;
            while (x++ < z){
                if (z == 1) {
                    int i = 0;
                    int k = 1;
                    while (i++ < 5) {
                        int j = 0;
                        while (j++ < k){
                            System.out.print("+ ");
                        }
                        System.out.println();
                        k++;
                    }
           
            
                }else System.out.print("+ ");
            }
            System.out.println();
            z--;
        }    
        
        

        
        
         

          /*
            Nested Loops
            Via + / \
            + + + + + 
            + / + \ +
            + + + + +
            + \ + / +
            + + + + +
           */

           /*
            Nested Loops
            Via + Space
                + 
              + + +
            + + + + + 
              + + + 
                + 
            */



    }
}