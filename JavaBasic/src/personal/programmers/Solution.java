package personal.programmers;

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] tmp = s.split(" ");
		int count = 0;

//		for (String a : tmp) {
//			if (a.contains(" "))
//				count = 0;
//			else
//				count++;
//
//			if (count % 2 == 0) {
//				answer += a.toLowerCase();
//			} else
//				answer += a.toUpperCase();
//		}

		for (String ss : tmp) {
			count = (ss.contains(" ")) ? 0 : count + 1;
			answer += (count % 2 == 0) ? (ss.toLowerCase()) : (ss.toUpperCase());
		}

		return answer;
	}
}