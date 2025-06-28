package Assesment;

public class StringPalDrm {
	
	
	
	public static String revStr(String str) {
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			str = str.replaceAll("\\s", "");
			rev+=str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String st="A has Manoj jonAm saHa";
		String st2=revStr(st).toLowerCase();
		if (st.replaceAll("\\s", "").toLowerCase().equals(st2)) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		
	}

}
