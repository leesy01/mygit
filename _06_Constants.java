package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; //국가 번호 final을 붙이는 순간 상수가 되므로 바꿀수가 없음
        //KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율
        final  String DATE_OF_BIRTH = "2001-04-02"; //생년월일
        System.out.println("내 생일은" + DATE_OF_BIRTH + "야..");
    }
}
