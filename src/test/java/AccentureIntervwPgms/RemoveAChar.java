package AccentureIntervwPgms;

public class RemoveAChar {

	public static void main(String[] args) {
String s="CloudComputing";
char C='C';
		removechar(s, C);
	}
	
	public static void removechar(String st, char c){

		int n=st.length();

		String finalStr="";

		for(int i=0;i<n;i++){
		if(st.charAt(i)!=c){
		finalStr=finalStr+st.charAt(i);
		}

		}
		System.out.println(finalStr);



		}

}
