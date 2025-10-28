//1.

/*public class Chaining{
     static int a=20;
     static int b=30;
       
         static int sum(){
          int num=a+b;
          System.out.println(num);
           return num;
      
}
        static void avg(){
          int total=sum();
          double num1=total/2.0;
            System.out.println(num1);
      }
public static void main(String[] args){
                avg();
   }
      }*/

//2.

/*public class Chaining{
      static int r=5;
        
            static void area(){
              double area = Math.PI*r*r;
               System.out.println(area);
          }
                 static void perimeter(){
              double perimeter = 2*Math.PI*r;
               System.out.println(perimeter);
          }

        public static void main(String[] args){
             area();
             perimeter();
                 }
    
    }*/


//3.

/*public class Chaining{
       static int sub1=85;
       static int sub2=90;
       static int sub3=80;
            
          static int sum(){
            int marks=sub1+sub2+sub3;
              System.out.println(marks);
                 return marks;
               }
             
       static int avg(){
            int total=sum();
            int tot=total/3;
              System.out.println(tot);
                return tot;
               }

            public static void main(String[] args){
                
                 avg();
                  }
         }*/


//4.

/*public class Chaining{
                  
          static int p=5000;     
          static int r=5;
          static int t=2;

                static int simple(){
                int sim= p*r*t;
                int total=sim/100;
                  System.out.println(total);
                 return total;
              
   }
           public static void main(String[] args){
                 simple();                         
             }
     }*/

//5.


/*public class Chaining{

                 static int basic = 20000;
                 static int bonus= 5000;
 
                      static int calculateSalary() {
                      int sum=basic+bonus;
                      System.out.println(sum);
                      return sum;
  }
               public static void main(String[] args){
                          calculateSalary();
     }                
}*/

//6.

/*public class Chaining{
       static int marks1 = 78, marks2 = 85, marks3 = 90;
                 
               static int totals() {
               int sum=marks1+marks2+marks3;
               System.out.println(sum);
                return sum;
          }

               static double percentage(){
                   double total = totals();
                   double per= total/300*100;
                     System.out.println(per);
                       return per;
                   
           }
         public static void main(String[] args){
                   percentage();
       } 
}*/

//7.

/*public class Chaining{
        static int  x = 10, y = 20, temp;
        
           static void swap(){
           int temp=x;
           x=y;
           y=temp;
           System.out.println("x="+x+",y="+y);
           
  }
         public static void main(String[] args){
             swap();
     }
}*/

//8.
/*public class Chaining{
     static int num=5;

        static int square(){
               int r=num*num;
              System.out.println(r);
          return r;
}
          static void cube(){
              int sq= square();
              int s=sq*num;   
}
     public static void main(String[] args){
             cube();
}

}*/

//9.

/*public class Chaining{

    static double dollarRate = 84.5;

    
    public static void convertToINR(double usd) {
        double inr = usd * dollarRate;
        System.out.println(usd + " USD = " + inr + " INR");
    }

    public static void main(String[] args) {
        
        convertToINR(10);   
        convertToINR(50);   
        convertToINR(100);  
}

}*/

//10.

/*public class Chaining{

    static int rate = 10;

   
    public static void calculateAmount() {
     
        int amount = 500;

        
        int total = amount + rate;

       
        System.out.println("Total = " + total);
    }

    public static void main(String[] args) {
      
        calculateAmount();
    }
}*/
