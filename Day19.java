import java.io.*;

import java.util.*;

public class Day19 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long[] dp = new long[n + 1];
    dp[0] = 1; 

    dp[1] = 1; 

    for (int i = 2; i < dp.length; i++) {
      for (int j = 0; j < i; j++) {
        dp[i] += dp[j] * dp[i - 1 - j];
      }
    }

    System.out.println(dp[n]); 
  }