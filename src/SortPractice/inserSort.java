package SortPractice;

import java.util.Arrays;

public class inserSort {

	public static void main(String[] args) {
		int[] nums = {84,83,88,87,61};
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int j = i-1;
			while(j>=0 && temp<nums[j]) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
			System.out.println(Arrays.toString(nums));
		}
		System.out.println("end:"+Arrays.toString(nums));
		
	}
}
