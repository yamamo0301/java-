
public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		int[] num2 = {1, 2, 3, 4};
		for (int num3 : num2) {
			System.out.println(num3);
		}
		
		int[] num4 = {1, 4, 14, 25};
		for (int num5 : num4) {
			if (num5 % 2 == 0) {
				continue;
			}
			System.out.println(num5);
		}
	}
}
