package object;

public class Ex5 {
    public static void main(String[] args) {
        String str1 = new String("test"); // 주소 대신 문자열 값 출력
        System.out.println(str1.toString()); // 참조변수 출력시 자동으로 toString()메소드 호출
        System.out.println(str1);

        String str2 = new String("test");

        if(str1.equals(str2)){ // 주소 대신 문자열의 내용을 비교
            System.out.println("str1와 str2은 같은 문자열입니다.");
        }

    }
}
