package Backjun;

import java.util.Scanner;

public class P1545_평균 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
/*
N개 입력 받기 N< 1000
N 크기 만큼의 배열 만들기
세준의 성적 입력 받기 0<N<=100
그 중 최고 점수를 선택하기
배열 다 더하고 나서 sum[]/max*100/N
다시 전체 배열을 돌면서 다 더해주기
 */