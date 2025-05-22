package day1;

import java.util.Scanner;

public class GoodSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		int count = 0;
		for(int start = 0;start<n;start++) {
			for(int end=start;end<n;end++) {
				int pairs = 0;
				for(int i=start;i<=end;i++) {
					for(int j=i+1;j<=end;j++) {
						if(nums[i]==nums[j]) {
							pairs++;
						}
					}
				}
				if(pairs>=k) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
