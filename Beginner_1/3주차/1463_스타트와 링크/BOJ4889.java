import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String str = br.readLine();
            if (str.indexOf('-') != -1) {
                break;
            }

            int num = checkNum(str);
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }

    // 안정된 문자열 만들기 위한 최소 연산의 수
    public static Integer checkNum(String str) {
        int count = 0;
        boolean noanjung = false;
        // true면 {가 나온 상태

        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] arr = str.toCharArray();

        for (char c : arr) {
            // 지금 나온 것, 안정된 상태
            // { false -> 연산 X, true
            // { true -> 연산 O, 이미 열려있다는 것 -> count ++, false
            // } false -> 연산 O, 이미 닫혀있음 -> count++, true
            // } true -> 연산X, false
            if ((c == '{') && (noanjung == false)) noanjung = true;
            else if ((c == '{') && (noanjung == true)) {
                count++;
                noanjung = false;
            }
            else if ((c == '}') && (noanjung == false)) {
                count++;
                noanjung = true;
            }
            else if ((c == '}') && (noanjung == true)) noanjung = false;
        }
        return count;
    }
}