import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class BOJ15657 {
    static Integer N;
    static Integer M;
    static Integer[] nNum;
    static int[] sortNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" "); // N M
        N = Integer.parseInt(MN[0]);
        M = Integer.parseInt(MN[1]);

        String[] Nstr = br.readLine().split(" ");
        nNum = new Integer[N];

        for (int i = 0; i < N; i++) {
            nNum[i] = Integer.parseInt(Nstr[i]);
        }

        sortNum = new int[M];
        Arrays.sort(nNum);

        dfs(0, 0);
    }

    public static void dfs(int index, int depth) {
        if (depth == M) { // depth가 M이 되면 한줄 완성
            for (int i = 0; i < M; i++) {
                System.out.print(sortNum[i] + " ");

            }

            System.out.println();
            return;
        }

        for (int i = index; i < N; i++) {
            sortNum[depth] = nNum[i];
            dfs(i, depth + 1);
        }
    }
}