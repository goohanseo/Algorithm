package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i + 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q <= quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] = S[i-1]);
        }
    }
}

/*
데이터 갯수 : M, 질의 갯수 : N
for (M)
arr[i]에 넣기
sum[i]도 같이 계산하기
for (N)
Scanner sc = scanner.in
Scanner sc = scanner.in
S[a]-S[b]
 */