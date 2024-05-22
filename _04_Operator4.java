package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 참 이면 참
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //하나라도 거짓이면 거짓

        // AND 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다 참
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 거짓

        // OR 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다 참
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1보다 작다 참
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1보다 작다 거짓

        //System.out.println(1 < 3 < 5); 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true); //!때문에 반대가 되어서 거짓
        System.out.println(!false); // 참
        System.out.println(!(5 == 5)); // 5는 5와 같지만 !때문에 거짓
        System.out.println(!(5 == 3)); // 참
    }
}
