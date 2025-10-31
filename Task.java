//1. 


public class Task{
         
           public byte value(){
      
               byte b1=2;
               return b1;

        }
                   public short Shortvalue(){
      
               short s1=25;
               return s1;
        }
      
                    public int intvalue(){
      
                        int i1=20;
                        return i1;
        }          
                     public long longvalue(){
      
                        long l1=30;
                        return l1;
        }      
                       public float floatvalue(){
      
                        float f1=40.0f;
                        return f1;
        }                
                       public double doublevalue(){
      
                        double d1=50.0;
                        return d1;
        }                 
               public char charvalue(){
      
                        char ch='A';
                        return ch;
                        
        }  
                
               public String Stringvalue(){
                        String c="Ant";
                        return c;
                        
        }   

                public boolean booleanvalue(){
                        boolean d=true;
                        return d;
                        
        }                    
               

                    public static void main(String[] args){
                   Task obj1=new Task();
                   Task obj2=new Task();
                   Task obj3=new Task();
                   Task obj4=new Task();
                   Task obj5=new Task();
                   Task obj6=new Task();
                   Task obj7=new Task();
                   Task obj8=new Task();
                   Task obj9=new Task();


                   System.out.println(obj1.value());
                    System.out.println(obj2.Shortvalue());
                    System.out.println(obj3.intvalue());
                     System.out.println(obj4.longvalue());
                    System.out.println(obj5.floatvalue());
                    System.out.println(obj6.doublevalue());
                    System.out.println(obj7.charvalue());
                      System.out.println(obj8.Stringvalue());
                        System.out.println(obj9.booleanvalue());
      }
          

            }
