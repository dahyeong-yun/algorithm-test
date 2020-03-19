package baekjoon;

import java.util.Scanner;

/**
 * @author Danny Yoon
 */
// public class Main {
public class _2798 {
	public static void main(String[] args) throws Exception {
		//long startTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

		/* 입력부 */
		Scanner sc = new Scanner(System.in);
		int numSize = sc.nextInt();
		int target = sc.nextInt();
		int[] numCard = new int[numSize];
		for(int i=0; i<numSize; i++) {
			numCard[i] = sc.nextInt();
		}
		sc.close();
		/* end of 입력부 */
		
		/* */
		int sum = 0;
		int gab = target;
		for(int i=0; i<numSize; i++) {                         // i 0 1 2 3 4 
			for(int k=i+1; k<numSize; k++) {                   // k 1 2 3 4 
				for(int l=k+1; l<numSize; l++) {               // l 2 3 4 
					sum = numCard[i]+numCard[k]+numCard[l];
					//System.out.println("i = " + i +"/ k = " + k +"/ l = " + l );
					if(sum <= target) {
						int tmpGab = target - sum;
						if(gab > tmpGab) {
							gab = tmpGab;
						}
					}
				}
			}
		}
		System.out.println(target-gab);
		//long endTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기
		//System.out.println(endTime - startTime + "ms");
	}
}
