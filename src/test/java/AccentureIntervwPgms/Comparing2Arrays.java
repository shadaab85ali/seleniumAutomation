package AccentureIntervwPgms;

import java.util.Arrays;

public class Comparing2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {3,2,4,5};
		int arr2[]= {2,3,6,4};
		
		if(areEquals(arr1,arr2)) {
			System.out.println("Arrays are equal");
		}else {System.out.println("Arrays are not equal");}

	}

	public static boolean areEquals(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		
		if(n!=m) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<n;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
		
		
	}
}
