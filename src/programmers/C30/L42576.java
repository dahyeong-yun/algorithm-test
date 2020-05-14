package programmers.C30;

import java.util.Arrays;

public class L42576 {

	public static void main(String[] args) {
		L42576 quiz = new L42576();
		
		String[] participant =
			{"ana", "mislav", "mislav", "stanko"};
			//{"leo", "kiki", "eden"};
		String[] completion =
			{"ana",  "mislav", "stanko"};
			//{"eden", "kiki"};
		
		System.out.println(quiz.solution(participant, completion));
		
	}

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int leng = completion.length;
		for(int i=0; i<leng; i++) {
			if(!completion[i].equals(participant[i]))
				return participant[i];
		}
		
		return participant[leng];
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
