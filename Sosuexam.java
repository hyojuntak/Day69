package JC.Day69;


public class Main {

    //소수 판별 
    //제곱근을 이용해서 소수판별 (Math.sqrt()를 이용)
    //소수는 1과 자기자신만으로 나누어 떨어지는 수
    //1과 자기자신을 제외한 수로는 나누어 떨어지지 않는다. 
    //제곱근을 이용하는 방법(에라토스테네스의 채) 
    //101이 소수인지 판별하고 싶다면 101의 제곱근 10, 
    //2~10으로 101을 나누어 떨어지는지 확인 


    static boolean isPrime(int n) {
        boolean isS = true;
        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            isS = true;
            if(n%i==0)
                isS=false;
                break;

        }
        return isS;
    }


    public static void main(String[] args) {
        
        int number = 101;
        boolean ifPrime = isPrime(number);

        if(ifPrime)
            System.out.printf("%d는 1과 자신으로만 나눠 떨어지는 소수다", number);
        else
            System.out.printf("%d는 1과 자신으로만 나눠 떨어지는 소수가 아니다", number);


        
        
        
    }


}
