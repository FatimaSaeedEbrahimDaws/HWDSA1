import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static  int num;
    static sudent  x[];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number element A array:");
        num=in.nextInt();
        x=new sudent[num];
      sudent a[]=new sudent[num];
        for (int i=0;i<num;i++){
            sudent s=new sudent();
            System.out.println("input element "+(i+1)+":");
            System.out.println("Name:");
         s.name=in.next();
            System.out.println("ID:");
          s.id=in.nextInt();
a[i]=s;
        }
        backup(a);
        a[0].setName("fatima");
        a[0].setId(123);
        System.out.println(" A array \n"+ Arrays.toString(a));

        System.out.println(" B array \n"+Arrays.toString(x));
    }



    public static void backup(sudent a[]) {


        for (int i=0;i<num;i++)
            x[i]=a[i];
    }
}
