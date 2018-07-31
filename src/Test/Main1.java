package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		Main1 main1=new Main1();
		List<Integer>list1=new LinkedList<Integer>();
		List<Integer>list2=new LinkedList<Integer>();
		list1.add(-1);
		list1.add(0);
		list1.add(1);
		list2.add(0);
		list2.add(1);
		list2.add(-1);
		boolean equalList = main1.equalList(list1, list2);
		System.out.println(equalList);
	}
	private boolean equalList(List list1, List list2) {
		if (list1.size() != list2.size())
			return false;
		for (Object object : list1) {
			if (!list2.contains(object))
				return false;
		}
		return true;
	}
}
