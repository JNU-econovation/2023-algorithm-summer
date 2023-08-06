package econostudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i -1] + dp[i - 2];
        }


        System.out.println(dp[N]);
    }
}
