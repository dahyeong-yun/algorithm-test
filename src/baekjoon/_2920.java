package baekjoon;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Danny Yoon
 */
// public class Main {
public class _2920 {
	public static void main(String[] args) throws Exception {
		//long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

		/* 입력부 */
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);

		String raw_input = br.readLine();
		br.close();
		/* end of 입력부 */
		
		String[] trimed_input = raw_input.split(" ");
		boolean align = true;
		
		int tmp = 0;
		int val = 0;
		for(int i=0; i < trimed_input.length - 1; i++) {
			val = Integer.parseInt(trimed_input[i+1]) - Integer.parseInt(trimed_input[i]);
			if(Math.abs(val)!=1) {
				align = false;
			}
			tmp += val;
		}
		// System.out.println("tmp : "+ tmp);
		/* */
		int asc = trimed_input.length - 1;
		int des = asc * -1;
		if(tmp == asc && align) {
			System.out.println("ascending");
		} else if (tmp == des && align) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		
//		int int_inpupt = Integer.parseInt(str_input);
		//long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		//long secDiffTime = (afterTime - beforeTime); // 두 시간에 차 계산
		//System.out.println("시간차이 : " + secDiffTime + " ms");
	}
}
