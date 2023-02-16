package Array;

import java.util.LinkedHashSet;

public class Duplicateremove {public static void main(String[] args) {
    int[] arr={5,1,2,3,5,1};
    int[] arr1={2,4,3,2,4,8,9};
    int[] arr2=new int[arr.length+arr1.length];
    LinkedHashSet<Integer> ls=new LinkedHashSet<>();
    for (int i = 0; i < arr2.length; i++) {
		if(i<arr.length)
			ls.add(arr[i]);
		else
			ls.add(arr1[i-arr.length]);
	}
    System.out.println(ls);
}
}
