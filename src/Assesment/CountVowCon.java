package Assesment;

public class CountVowCon {
	public static void main(String[] args) {
		String str="Sonu kumar diwakar";
		str.toLowerCase();
		int vow=0;
		int con=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
		if (ch>='a'&&ch<='z') {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vow++;
			}
			else {
				con++;
			}
			
		}
		}
		System.out.println("vow count"+vow+" con count"+con);
	}

}
