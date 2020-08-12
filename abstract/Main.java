import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("This is ArrayList 1");
		list.add("This is ArrayList 2");
		list.add("This is ArrayList 3");
		// 使用 List interface 中所提供的方法列出所有元素
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// 使用 for each 列出所有元素
		for (String s : list)
			System.out.println(s);

		// 使用 iterator 列出所有元素
		Iterator iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
