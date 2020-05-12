package programmers.C30;

public class L42862 {
	public static void main(String[] args) {
		L42862 quiz = new L42862();
		
		int[] lost = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
		int[] reserve = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
		
		System.out.println(quiz.solution(30, lost, reserve));
		
	}
	
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
	     // n명에 대한 배열
	     int[] total = new int[n];
	     
	     // 배열의 기본 값은 1
	     for(int i = 0; i<n; i++) {
	    	 total[i]++;
	     }

	     // reserve는 +1
	     for(int i : reserve) {
	    	 total[i-1]++;
	     }
	
	     // lost는 -1
	     for(int i : lost) {
	    	 total[i-1]--;
	     }	
	     
	     // total[n]이 2 일 때, n-1이 0이면 둘 다 1로 변경 2부터 len 까지
	     for(int i = 1; i<n; i++) {
	    	 if(total[i] == 2 && total[i-1] == 0) {
	    		total[i]--;
	    		total[i-1]++;
	    	 }
	     }
	     
	     // total[n]이 2 일 때, n+1이 0이면 둘 다 1로 변경 1부터 len-1
	     for(int i = 0; i<n-1; i++) {
	    	 if(total[i] == 2 && total[i+1] == 0) {
	    		total[i]--;
	    		total[i+1]++;
	    	 }
	     }
	     

	     
	     // total[n]이 1이상인 수 cnt
	     for(int i = 0; i<n; i++) {
	    	if(total[i]>=1) {;
	    		answer++;
	    	}
	     }
	     
	     return answer;
    }
}
