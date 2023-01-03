import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    static  int num,num1;
    static ArrayList <Integer> a;
    static ArrayList <Integer> b;
    static ArrayList <Integer>  c;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number element A array:");
        num=in.nextInt();
    a=add(num);
        System.out.println("input number element B array:");
        num1=in.nextInt();
       b= add(num1);
        c=new ArrayList<>();
       c= addC(num,num1);
        System.out.println(" A array \n"+ Arrays.toString(a.toArray()));
        System.out.println(" B array \n"+ Arrays.toString(b.toArray()));
        System.out.println(" C array \n"+ Arrays.toString(c.toArray()));
    }


public static ArrayList add( int number){
    Scanner in=new Scanner(System.in);

  ArrayList<Integer>  arr=new ArrayList<>();

    for (int i=0;i<number;i++){
        System.out.println("input element "+(i+1)+":");
        arr.add(i,in.nextInt());
    }return arr;
}
    public static ArrayList addC( int number,int number1) {

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr =new ArrayList<>();


        for (int i=0;i<number;i++){
            arr.add(a.get(i));

        }

        for (int i=0;i<number1;i++){
          arr.add(b.get(i));

        }return arr;
    }

}
