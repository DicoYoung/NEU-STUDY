package SortPractice;

import java.util.Arrays;

public class MaopaoSort {

	public static void main(String[] args) {
		int[] nums = {84,83,88,87,61};
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
