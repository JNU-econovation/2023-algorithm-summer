import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2178 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;
    static int M, answer;

    static int node[][];
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        node = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i  = 1; i < N; i ++) {
            String[] line = br.readLine().split("");
            for (int j = 1; j < M; j++) {
                node[i][j] = Integer.parseInt(line[j]);
            }
        }
        BFS(1, 1);

        System.out.println(node[N][M]);
    }


    private static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int nx = point.x;
            int ny = point.y;

            for (int i = 0; i < 4; i++) {
                int newX = nx + dx[i];
                int newY = ny + dy[i];

                if (newX <= N && newY <= M && newX > 0 && newY > 0 && node[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.add(new Point(newX, newY));

                    visited[newX][newY] = true;
                    node[newX][newY] = node[x][y] + 1;
                }
            }
        }
    }
}
