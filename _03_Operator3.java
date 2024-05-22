package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교 연산자
        System.out.println(5 > 3); // 5 는 3 보다 크다(참 true , 거짓 false)
        System.out.println(5 >= 3); // 5 는 3 보다 크거나 같다. 참
        System.out.println(5 >= 5); // 5 는 5 보다 크거나 같다. 참
        System.out.println(5 >= 7); // 5 는 7 보다 크거나 같다 .거짓
        System.out.println(5 < 3); // 5 는 3 보다 작다 .거짓
        System.out.println(5 <= 3); // 5 는 3 보다 작거나 같다. 거짓

        System.out.println(5 == 5); // 5 는 5 와 같다. 참
        System.out.println(5 == 3); // 5 는 3 와 같다. 거짓

        System.out.println(5 != 5); // 5 는 5 와 같지 않다. 거짓
        System.out.println(5 != 3); // 5 는 3 와 같지 않다. 참
    }
}
