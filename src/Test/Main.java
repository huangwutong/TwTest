package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int []nums=new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=scanner.nextInt();
		}
		Main main=new Main();
		int len = main.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}
	public int removeDuplicates(int[] nums) {
		List<Integer>list=new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			nums[i]=list.get(i);
		}
		return list.size();
	}
}





