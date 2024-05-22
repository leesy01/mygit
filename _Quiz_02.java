package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String height = (a >= 120) ? "가능합니다." : "불가능합니다.";
        String height1 = (b >= 120) ? "가능합니다." : "불가능합니다.";
        System.out.println("키가 " + a + "cm 이므로 탑승이 " + height);
        System.out.println("키가 " + b + "cm 이므로 탑승이 " + height1);


    }
}
