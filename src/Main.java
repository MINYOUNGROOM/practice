import java.util.Scanner;

/*
 * 김민영 Java 미니과제 3
 *
 * 놀이동산 입장권 계산 프로그램
 */
public class Main {
    public static void main(String[] args) {
        int age;
        int entryTime ;
        String isPatriot;
        String hasWelfareCard;
        int basic = 10000;
        int specialDiscount = 4000;
        int basicDiscount = 8000;
        int finalFee;

        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        age = scanner.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        entryTime  = scanner.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        isPatriot = scanner.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        hasWelfareCard = scanner.next();

        // TODO : 중복할인 되지 않으며, 중복될 경우 가장 할인을 많이 받은 금액 구현 필요
        if(age < 3){ // 3세 미만 무료 입장
            finalFee = 0;
        } else if (age < 13) { // 13세 미만 특별 할인 적용
            finalFee = basic - specialDiscount;
        } else if (entryTime > 17 ) { // 17시 이후에 입장하면 4000원 할인
            finalFee = basic - specialDiscount;
        } else if (isPatriot == "y" &&  hasWelfareCard == "y") { // 국가유공자 y , 복지카드 y 일 경우 8000원 할인
            finalFee = basic - basicDiscount;
        } else {
            finalFee = basic; // 기본 요금
        }
        System.out.println("입장료: " + finalFee);
    }
}

