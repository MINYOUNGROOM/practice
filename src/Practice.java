import java.util.Scanner;

/*
 * 김민영 Java 깜짝과제 1
 *
 *수강관리 프로그램 작성
 * */
public class Practice {
    Practice() {
        System.out.println("<<<<[메뉴선택]>>>>");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");
    }

    public static void main(String[] args) {
        new Practice();

        Scanner scanner = new Scanner(System.in);
        int i;


        while (true) {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("회원 관리 메뉴를 선택했습니다.");
                    break;
                case 2:
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                    break;
                case 3:
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                    break;
                case 4:
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                    new Practice();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return; // while문 종료
                default:
                    System.out.println("입력값이 정확하지 않습니다.");
            }
        }
    }
}