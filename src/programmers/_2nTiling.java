package programmers;

public class _2nTiling {

	public static void main(String[] args) {
		_2nTiling sol = new _2nTiling();
		System.out.println(sol.solution(4));
	}

	int[] answer = new int[60000];

	public int solution(int n) {
		answer[0] = 1;
		answer[1] = 2;
		for (int i = 2; i < answer.length; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		int result = answer[n-1];
		return result%1000000007;
	}
}
