package newproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class milan_array_intersection {

	public static void main(String[] args) {

		List<Integer> firstlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		List<Integer> secondlist = Arrays.asList(1, 3, 5, 7, 9);

		List<Integer> intersection = new ArrayList<>();

		System.out.println("List of the common elements: ");

		for (int i = 0; i < firstlist.size(); i++)

		{
			for (int j = 0; j < secondlist.size(); j++) {

				if (firstlist.get(i) == secondlist.get(j))

				{
					intersection.add(i);

					System.out.println(firstlist.get(i));
				}

			}

		}

	}

}