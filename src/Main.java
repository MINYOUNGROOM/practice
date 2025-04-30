import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/*
 * 김민영 Java 미니과제 5
 *
 * 달력 출력 프로그램
 */
public class Main {
    public static void main(String[] args) {
        int year;
        int mm;
        int days = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        year = scanner.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        mm = scanner.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, mm, 1);

        int firstDay = cal.get(Calendar.DAY_OF_WEEK); // 1- 일요일
        int endDay = cal.getActualMaximum(Calendar.DATE);

        // 달력 출력 포맷
        System.out.printf("[%04d년 %02d월]%n", year, mm);
        System.out.printf("%2s%2s%2s%2s%2s%2s%2s", "일", "월", "화", "수", "목", "금", "토" );
        System.out.println();

        // 첫 번째 날짜를 맞추기 위해 공백을 출력
        for (int i = 1; i < firstDay; i++) {
            System.out.print("   ");
        }

        // 날짜 for문 돌려서
        for (int day = 1; day <= endDay ; day++) {
            System.out.printf("%2d ", day);

            if(((firstDay + day - 1) % 7) == 0){ // 한 주 지나갈 때 마다 줄 바꿈
                System.out.println();
            }
        }
        scanner.close();
    }
}

