import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class project {
    
    public static void main() {
         String filename;
        Scanner keyboardScan;       
        System.out.printf("Input file name of product = ");
        keyboardScan = new Scanner(System.in);
        filename = keyboardScan.next();
        try
        {
            Scanner scan = new Scanner(new File(filename));
            while(scan.hasNext()){
                String line = scan.nextLine();
                String []buf = line.split(",");
                product inputproduct = new product(buf[0],Integer.parseInt(buf[1].trim()));
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("\n" + e);
    }
       
        System.out.printf("Input file name of product = ");
        keyboardScan = new Scanner(System.in);
        filename = keyboardScan.next();
        try
        {
            Scanner scan = new Scanner(new File(filename));
            while(scan.hasNext()){
                String line = scan.nextLine();
                String []buf = line.split(",");
               employee input = new employee(buf[0],Integer.parseInt(buf[1].trim()),Integer.parseInt(buf[2].trim()),Integer.parseInt(buf[3].trim()),Integer.parseInt(buf[4].trim()),Integer.parseInt(buf[5].trim()));
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("\n" + e);
    }
       
        }
  

        }

 public class product {
      String pdname;
      int price;
      public product(String pdn, int pr){
            pdname = pdn;   
            price = pr;
          }
      public void print(){
            System.out.printf("30%s /t %d",this.pdname,this.price);
 }
 }



 public class employee{
        String name;
        int []pdsales ;
        int totalsale, bonus, totalbonus, totalincome, salesbonus ,overtimebounus;
        public employee(string n,int arc, int cct, int dish, int mco, int rg ){
           name = n ;
           pdsales = new int[]{arc, cct, dish, mco ,rg};
 }
        public void totalincome(int arc, int cct, int dish, int mco, int rg ){
           totalincome = (arc * this.pdsales[0])+(cct * this.pdsales[1])+(dish * this.pdsales[2])+(mco * this.pdsales[3])+(rg * this.pdsales[4]);
 }
        public void salesbonus(int pr, int i){
            //i = number of product
            if(pr > 0)
            {
                if(pr < 1000){
                 salesbonus = pr *(10/1000 * this.pdsales[i]) ;
                   }
                else if(10000 <= pr && pr <30000){
                 salesbonus = pr *(15/1000 * this.pdsales[i]) ;
                }
                else if(30000 <= pr && pr <50000){
                 salesbonus = pr *(20/1000 * this.pdsales[i]) ;
                }
                 else if( pr >= 50000){
                 salesbonus = pr *(25/1000 * this.pdsales[i]) ;
                }
                }
            }
        }
 
         
        