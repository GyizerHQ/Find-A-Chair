import java.util.*;
import java.lang.Math;

public class ChairsInRoom {
	public static ArrayList<Object> CalculateList(ArrayList<ArrayList<Object>> x, int TotChair) {
		ArrayList<Object> list = new ArrayList<Object>();
		int sum = 0;
		for (int i = 0; i < x.size(); i++) {
			int avlChair = (int) (x.get(i).get(1)) - calculateX(x.get(i).get(0));
			if (avlChair < 0) {
				list.add(0);
			} else {
				sum = sum + Math.abs(avlChair);
				if (sum <= TotChair) {
					list.add(Math.abs(avlChair));
					if (sum == TotChair)
						break;
				}
				else if(sum>TotChair) {
					int temp = TotChair-sum+Math.abs(avlChair);
					list.add(temp);
					break;
				}
			}
		}
		return list;
	}

	public static int calculateX(Object str) {
		String s = str.toString();
		s = s.replaceAll("'", "");
		return s.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Chairs to pick");
		int TotChair = sc.nextInt();

		ArrayList<ArrayList<Object>> x = new ArrayList<ArrayList<Object>>();
		x.add(new ArrayList<Object>(Arrays.asList("'XXX'", 3)));
		x.add(new ArrayList<Object>(Arrays.asList("'XXXXX'", 6)));
		x.add(new ArrayList<Object>(Arrays.asList("'XXXXXX'", 9)));
		x.add(new ArrayList<Object>(Arrays.asList("'XXX'", 2)));
		if (TotChair > 8)
			System.out.println("Chairs must be less than 8");
		else if (TotChair == 0) {
			System.out.print(1);
		} else {
			System.out.println(CalculateList(x, TotChair));
		}
	}

}
