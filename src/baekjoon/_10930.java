package baekjoon;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;

/**
 * @author Danny Yoon
 */
// public class Main {
public class _10930 {
	public static void main(String[] args) throws Exception {
		//long startTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

		/* 입력부 */
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);

		String raw_input = br.readLine();
		br.close();
		/* end of 입력부 */
		
		/* */
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(raw_input.getBytes());
		byte[] byteArrInput = md.digest();
		StringBuilder sb = new StringBuilder();
		for(byte txt : byteArrInput) {
			sb.append(String.format("%02x", txt));
		}
		/* */
		
		/* 출력부 */
		System.out.println(sb.toString());
		/* end of 출력부 */
		
		//long endTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기
		//System.out.println(endTime - startTime + "ms");
	}
}
