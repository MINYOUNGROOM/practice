import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
 * 김민영 Java 깜짝과제 2
 *
 * 문장 영문 알파벳 별 출현 빈도 프로그램 작성
 *
 * 문장의 각 영문 알파벳 별 출현 빈도의 개수,
 * 전체 알파벳 중 몇 % 비율로 나오는지 구해라
 * */
class FileUtils {

    public String getLoadText(String filePath) {
        StringBuilder sb = new StringBuilder();

        try {
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}


public class Practice {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        String text = fileUtils.getLoadText("C:\\Users\\KIMMINYOUNG\\OneDrive\\바탕 화면\\Text.txt");
        // 읽어온 파일을 전부 대문자로 변경
        text = text.toUpperCase();
        // 알파벳 별로 담길 배열 생성
        int[] counts = new int[26];
        // 전체 카운트 변수 정의
        int totalCount = 0;

        // 알파벳 별 카운트
        for (int i = 0; i < text.length(); i++) {
            char j = text.charAt(i);
            if (j >= 'A' && j <= 'Z') {
                counts[j - 'A']++;
                totalCount++;
            }
        }

        // 출력
        for (int i = 0; i < 26; i++) {
            char alpabet = (char) (i + 'A'); // i + 65
            int count = counts[i];
            double percentage = (count * 100.0) / totalCount;
            String percentageFormat = String.format("%.2f", percentage);
            System.out.println(alpabet + "     =" + count + "개,     " + percentageFormat + "%");
        }
    }
}