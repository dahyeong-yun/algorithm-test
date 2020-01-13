package programmers.C30;

import java.util.Arrays;

public class C30L42748 {

	public static void main(String[] args) {
		C30L42748 quiz = new C30L42748();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = quiz.solution(array, commands);
		
		for(int el : result) {
			System.out.print(el+" ");	
		}
		//[5, 6, 3]
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int answerPointer = 0;

		for(int[] command : commands) {
			int[] tmpAnswer = new int[command[1]-command[0]+1];  // 첫번째 답 임시 배열
			int j = 0;                                         // 반복 변수
			for(int i = command[0]; i<=command[1]; i++) {     // 배열 복사
				tmpAnswer[j]= array[i-1];
				j++;
			}
			
			Arrays.sort(tmpAnswer);
			answer[answerPointer] = tmpAnswer[command[2]-1];
			answerPointer++;
			
			tmpAnswer = null;
		}
		return answer;
	}
}
