import java.util.Random;
import java.util.Scanner;

/*
 * 김민영 Java 미니과제 4
 *
 * 주민등록번호 생성 프로그램
 */
public class Main {
    public static void main(String[] args) {
        int year;
        int mm;
        int dd;
        char sex;
        String resultFirst;
        int resultRandom;

        Scanner scanner = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        year = scanner.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        mm = scanner.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        dd = scanner.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        sex = scanner.next().charAt(0);

        int genderCode = 0;

        // 성별 코드 조건문
        switch (sex) {
            case ('f'):
                if (year >= 2000)
                    genderCode = 4;
                else {
                    genderCode = 2;
                }
                break;
            case ('m'):
                if (year >= 2000)
                    genderCode = 3;
                else {
                    genderCode = 1;
                }
                break;
            default:
                break;
        }

        // 생년월일 조합
        resultFirst = String.format("%04d%02d%02d", year, mm, dd);

        // 뒤 임의번호 생성
        Random random = new Random();
        resultRandom = random.nextInt(1000000);  // 2.3279967568276427 (0 ~ 9 사이의 값)
        resultRandom = Integer.parseInt(String.format("%d%06d", genderCode, resultRandom));

        System.out.println(resultFirst + "-" + resultRandom);
    }
}

