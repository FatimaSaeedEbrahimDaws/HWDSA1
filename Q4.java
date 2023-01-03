import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {


        static  int num,num1;
        static ArrayList<Integer> a;
        static ArrayList <Integer> b;


        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("input number element A array:");
            num=in.nextInt();
            a=add(num);
            System.out.println("input number element B array:");
            num1=in.nextInt();
            b= add(num1);

            System.out.println(" A array \n"+ Arrays.toString(a.toArray()));
            System.out.println(" B array \n"+ Arrays.toString(b.toArray()));
            if(a.equals(b))
       System.out.println( "A equel B");
   else     System.out.println( "A not equel B");
        }


        public static ArrayList add( int number){
            Scanner in=new Scanner(System.in);

            ArrayList<Integer>  arr=new ArrayList<>();

            for (int i=0;i<number;i++){
                System.out.println("input element "+(i+1)+":");
                arr.add(i,in.nextInt());
            }return arr;
        }


        }




