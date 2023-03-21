public class NumPrimos {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 100) {
            boolean esPrimo = true;
            int divisor = 2;
            while (divisor <= num) {
                if (num % divisor == 0) {
                    esPrimo = false;
                    break;

                }
                divisor++;

            }
            if (esPrimo) {
                System.out.println(num + " ");

            }
            num++;

        }             
       

       
        for (int i = 0; i <= 9; i++)
        System.out.println(i + " ");
        
        if (true) {

        }
     


        for (int i = 2; i <= 50; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    

        


      
        
    }
    
}
        
        