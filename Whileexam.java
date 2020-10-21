package JC.Day69;

public class Main {
   
    //for 증가값이 명확할때
    //while 불명확할때 (끝나는 조건 명확할때)
    //입력받은 temp가 1이 될때까지 while 구문을 반복 
    //temp 홀수이면 3배한 값에 1을 더하고 
    //temp 짝수이면 2로 나눈다


    public static void show(int a) {
        int temp = a;
        while (temp!=1) {
            if(temp%2==1){
                temp = temp*3+1;
            }
            else{
                temp/=2;

            }
        }

        System.out.println(temp);
    }

    public static void main(String[] args) {
        
        
        show(122);
    }
}
