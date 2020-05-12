package programmers.C30;

import java.util.Arrays;

public class L42576 {

	public static void main(String[] args) {
		L42576 quiz = new L42576();
		
		String[] participant =
			{"mislav", "stanko", "mislav", "ana"};
			//{"leo", "kiki", "eden"};
		String[] completion =
			{"stanko", "ana", "mislav"};
			//{"eden", "kiki"};
		
		System.out.println(quiz.solution(participant, completion));
		
	}

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int leng = participant.length;
		for(int i=0; i<leng-1; i++) {
			if(!participant[i].equals(completion[i]))
				return participant[i];
		}
		
		return participant[leng-1];
	}
	
//	public String solution(String[] participant, String[] completion) {
//		Map<String, Integer> hashPtcp = new HashMap<>();
//		Map<String, Integer> hashCplt = new HashMap<>();	
//		
//
//		for(String men : completion) {
//			hashCplt.put(men, 1);
//		}
//		
//		for(String men : participant) {
//			try {
//				hashPtcp.put(men, 1);	
//			} catch(NullPointerException e) {
//				return men;
//			}
//		}
//		
//		for(String men : hashPtcp.keySet()) {
//			if(hashPtcp.get(men) == -1)
//				return men;
//		}
//		
//		return null;
//	}
}
