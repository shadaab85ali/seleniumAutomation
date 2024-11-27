package PracticePrograms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] arr={"Java","Python","JavaScript"};
		
		
		
		System.out.println("Array list consists of last element as: "+arr[2]);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Array list consists of: "+arr[i]);
//		}
		for(String i : arr) {
			System.out.println(i);
		}
	}

}
