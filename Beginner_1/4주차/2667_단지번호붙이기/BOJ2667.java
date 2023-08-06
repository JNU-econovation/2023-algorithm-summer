import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ2667 {
    static int N;
    static int[][] node;
    static boolean[][] visited;
    static List<Integer> danzi;
    static int index; // 현재 단지
    static int homeNum; // 현재 단지의 집의 개수

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        node = new int[N][N];
        danzi = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                node[i][j] = Integer.parseInt(str[j]);
            }
        }

//        index = 0; // 지금 몇번째 단지인지 O, 단지 안의 집의 수 X

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && node[i][j] == 1) {
                    homeNum = 0; // 단지 안의 집의 수
                    DFS(i, j);
//                    index++;
                    danzi.add(homeNum);
                }
            }
        }

        Collections.sort(danzi);

        System.out.println(danzi.size());
        danzi.forEach(i -> System.out.println(i));
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        homeNum++;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < N && newY < N) {
                if (node[newX][newY] == 1 && !visited[newX][newY]) {
                    DFS(newX, newY);
                }
            }
        }

    }
}
