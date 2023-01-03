import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    static  int num;
    static  int x[];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number element A array:");
        num=in.nextInt();
        x=new int[num];
        int a[]=new int[num];
        for (int i=0;i<num;i++){
            System.out.println("input element "+(i+1)+":");
            a[i]=in.nextInt();
        }
        backup(a);
        a[0]=9;
        System.out.println("A array \n"+ Arrays.toString(a));

        System.out.println("B array \n"+Arrays.toString(x));
    }



    public static void backup(int a[]) {



            x=a;
    }

}
