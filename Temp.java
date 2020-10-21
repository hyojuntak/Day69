package JC.Day69;

public class Main {
   
    //섭씨와 화씨의 변환
    //실수와 정수 변환
    //섭씨 0도가 화씨 32.00도
    //섭씨 100도가 화씨 212.00도 


    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            double f = 9.8/5*i+32; // 실수로 연산 할 때는 정수에 .0을 붙여준다.
            System.out.printf("섭씨 %d도 = 화씨 %.2f도.\n",i,f); //정수 : %d, 실수 : %f (.2 -> 소숫점 두자리수까지)
        }    
       
    }
}
