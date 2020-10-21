package JC.Day69;

public class Main {
   

    public static void show(int a) {
        int temp = a;
    
        for (int i = temp; i > 0; i--) {
            
            if(temp%2==1)
                temp = temp*3+1;
            
            else
                temp/=2;
            
        }
        System.out.println(temp);

    }

        

    public static void main(String[] args) {
        
        
        show(122);
    }
}
