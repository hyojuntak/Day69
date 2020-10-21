package JC.Day69;

public class Main {
    //윤년 판별 : 연도가 4의 배수이고 100의 배수는 아니고 400의 배수 


    public boolean isLeapYear(int year){
        
        boolean isS=false;
        if ((year%4==0) && (year%100!=0 || year%400==0)) {
            isS = true;
        }
        
        return isS;

    } 

    public static void main(String[] args) {
        //멤버 메소드 (isLeapYear) 이기 때문에 -> 클래스 객체 생성 후 접근 
        Main hc = new Main();
        System.out.println(hc.isLeapYear(2017));
    }
}
