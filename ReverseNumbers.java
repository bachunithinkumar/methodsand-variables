/*
class ReverseNumbers  {
    public static void main(String[] args) {
        int num = 4;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(fact);   
    }
}

*/

//4



public class ReverseNumbers {
    public static void main(String[] args) {

        String str = "6969";

        int len = 0;

     
        while (true) {
            try {
                str.charAt(len);
                len++;
            } catch (Exception e) {
                break; 
            }
        }

        int mid = len / 2;

        
        if (len % 2 == 0) {
            for (int i = 0; i < len; i++) {
                if (i == mid - 1 || i == mid) {
                    System.out.print(str.charAt(i));
                }
            }
        }
       
        else {
            for (int i = 0; i < len; i++) {
                if (i == mid) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}
