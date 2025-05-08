import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * 김민영 Java 미니과제 6
 *
 * 가상 선거 및 당선 시뮬레이션 프로그램
 */
public class Main {
    public static void main(String[] args) {
        int voteNum; // 투표수
        int votePeopleCnt; // 후보자 수
        List<String> peoples = new ArrayList<String>(); // 후보자 리스트
        Random randomVotes = new Random();

        Scanner scanner = new Scanner(System.in);

        // 1. 투표를 진행할 투표 수 입력 & 후보자 수 입력
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        voteNum = scanner.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        votePeopleCnt = scanner.nextInt();
        scanner.nextLine();

        // 2. 후보자 이름을 입력 받음
        for (int i = 1; i <= votePeopleCnt; i++) {
            System.out.print( i+ "번째 후보자이름을 입력해 주세요.");
            String name = scanner.nextLine();
            peoples.add(name);
        }

        // 3. 각 투표자에게 기호 부여
        System.out.println("[투표진행률]:");
        for (int i = 1; i < peoples.size() + 1 ; i++) {

            System.out.println("[기호:" + i + "]" + peoples.get(i) + "투표%들어갈 부분" + "(투표수: "+")");
        }

        scanner.close();
    }
}

