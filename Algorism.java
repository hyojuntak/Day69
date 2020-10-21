import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Main {
   static ArrayList<Integer> cal(ArrayList<Integer> a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            list.add(a.get(i)-1);
            if(a.get(i)%5==0) list.add(a.get(i)/5);
            if(a.get(i)%3==0) list.add(a.get(i)/3);
            if(a.get(i)%2==0) list.add(a.get(i)/2);

        }
        return list;

    }
  
  public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        ArrayList<Integer> minimum = new ArrayList<Integer>();
        minimum.add(a);

        while (true) {
            if(a==1) {System.out.print(count); break;}

            ArrayList<Integer> temp = minimum;
            minimum = null;
            minimum = cal(temp);
            count+=1;
            
            if (Collections.min(minimum)==1) {
                System.out.println(count);
                break;
            }
        }
  }
}
