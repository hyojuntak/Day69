package JC.Day69;

public class Main {
   //do-while은 적어도 한번은 실행 
   


    public static void show(int a) {
        int temp = a;

        do {
            if(temp%2==1){
                temp = temp*3+1;
                System.out.print(temp+" ");
            }
            else{
                temp/=2;
                System.out.print(temp+" ");
            }
        } while (temp!=1);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        
        
        show(122);
    }
}
