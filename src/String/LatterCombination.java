package String;

import java.util.*;

class LatterCombination {
    public static List<String> letterCombinations(String digits) {
          List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        Map<Character, String> map = digToChar();
        solve(digits, 0, new StringBuilder(), result, map);
        return result;
    }

     private static void solve(String digits, int index, StringBuilder current, List<String> result, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String possible = map.get(digits.charAt(index));
        for (char c : possible.toCharArray()) {
            current.append(c);
            solve(digits, index + 1, current, result, map);
            current.deleteCharAt(current.length() - 1);
        }
    }

   public static Map<Character, String> digToChar() {
        Map<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        return mp;
    }
public static void main(String[] args) {
	String str="23";
	List<String> ans=letterCombinations(str);
	for (int i = 0; i < ans.size(); i++) {
		System.out.println(ans.get(i));
		
	}
}

}

