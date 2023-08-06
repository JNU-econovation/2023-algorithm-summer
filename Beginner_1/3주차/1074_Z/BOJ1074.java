import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ1074 {
    static int N;
    static int r;
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        r = Integer.parseInt(str[1]);
        c = Integer.parseInt(str[2]);

        int row = (int) Math.pow(2, N);
        System.out.println("row = " + row);

        int count = 0;

        // 1. 2^2 까지만 남을 때까지 쪼개기
        for (int i = row; i > 2; i = i / 2) {
            int before = i; // 쪼개기전의 사이즈
            int sabonmyeon = (check4(before));
            count += (before * before) / 4 * (sabonmyeon - 1);
            System.out.println("사분면 " + sabonmyeon);
            System.out.println("과정 " + count);
        }

        // 2. 마지막에 1234 중 어디인지 구하기
        System.out.println("위치는 " + count1234());
        count += count1234();
        System.out.println(count);
    }

    public static int check4(int jjoganRow) {
        jjoganRow = jjoganRow / 2;
        if (r < jjoganRow && c < jjoganRow) { // 1사분면
            return 1;
        } else if (r < jjoganRow && c >= jjoganRow) { // 2사분면
            return 2;
        } else if (r >= jjoganRow && c < jjoganRow) { //
            return 3;
        } else if (r >= jjoganRow && c >= jjoganRow) {
            return 4;
        } else {
            System.out.println("이상하다" +jjoganRow);
            return 0;
        }
    }

    public static int count1234() {
        if (r % 2 == 0 && c % 2 == 0) {
            return 0;
        } else if (r % 2 == 0 && c % 2 == 1) {
            return 1;
        } else if (r % 2 == 1 && c % 2 == 0) {
            return 2;
        } else if (r % 2 == 1 && c % 2 == 1) {
            return 3;
        }
        else System.out.println("또뭐가");
        return 0;
    }
}