public class FourTriangles {
    public static void main(String[] args) {

        int rows = 5;

        for (int row = rows; row >=1; row--) {

           
            for (int star = row; star >0; star--)
                
                for(int num= )System.out.print(star + " ");

                 System.out.print("        ");

          
            for (int star = 1; star <=rows-row+1; star++)
                System.out.print("*" + " ");

               

           
            
            for (int star = rows - row + 1; star >=1 ; star--)
                System.out.print("*" + " ");

            System.out.print("        ");


      

            for (int star = 1; star <= row; star++)
                System.out.print("*" + " ");

            System.out.println(); 
        }
    }
}
