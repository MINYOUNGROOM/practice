import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/*
 * 김민영 Java 미니과제 5
 *
 * 달력 출력 프로그램
 */
public class Main {
    public static void main(String[] args) {
        int voteNum; // 투표수
        int votePeopleCnt; // 후보자 수
        List<String> peoples = new ArrayList<String>(); // 후보자 리스트

        Scanner scanner = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        voteNum = scanner.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        votePeopleCnt = scanner.nextInt();
        System.out.print("1번째 후보자이름을 입력해 주세요.");
        peoples.add(scanner.nextLine());
        System.out.print("2번째 후보자이름을 입력해 주세요.");
        peoples.add(scanner.nextLine());
        System.out.print("3번째 후보자이름을 입력해 주세요.");
        peoples.add(scanner.nextLine());
        System.out.print("4번째 후보자이름을 입력해 주세요.");
        peoples.add(scanner.nextLine());

        // 각 투표자에게 기호 부여
        System.out.println("[투표진행률]:");
        for (int i = 0; i < peoples.size()+1; i++) {


            System.out.println("[기호:" + i + "]" + peoples.get(i));
        }


        scanner.close();
    }
}

