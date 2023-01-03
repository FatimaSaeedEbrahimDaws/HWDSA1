import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4a {


    static int num, num1;
    static ArrayList<sudent> a;
    static ArrayList<sudent> b;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number element A array:");
        num = in.nextInt();
        a = add(num);
        System.out.println("input number element B array:");
        num1 = in.nextInt();
        b = add(num1);

        System.out.println(" A array \n" + Arrays.toString(a.toArray()));
        System.out.println(" B array \n" + Arrays.toString(b.toArray()));

        if(equel())
            System.out.println("A equel B");
        else System.out.println("A not equel B");
    }


    public static ArrayList<sudent> add(int number) {
        Scanner in = new Scanner(System.in);

        ArrayList<sudent> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            sudent s = new sudent();
            System.out.println("input element " + (i + 1) + ":");
            System.out.println("Name:");
            s.name = in.next();
            System.out.println("ID:");
            s.id = in.nextInt();
            arr.add(s);
        }
        return arr;
    }
    public static boolean equel() {

    int s=num;
    boolean bo=false;
    if (num<num1)s=num1;
for (int i=0;i<s;i++){
    if(a.get(i).name.equals(b.get(i).name)&& a.get(i).id==b.get(i).id)
     bo=true;
else bo=false;


}return  bo;

}}




