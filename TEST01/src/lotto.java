import java.util.Random;

public class lotto {

	public static void lottoNum() {
		int a[] = new int[6];
		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
		}
		for (int b = 0; b < 6; b++) {
			System.out.print(a[b] + "\t");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		System.out.print("1회: \t");
		lottoNum();
		System.out.print("2회: \t");
		lottoNum();
		System.out.print("3회: \t");
		lottoNum();
		System.out.print("4회: \t");
		lottoNum();
		System.out.print("5회: \t");
		lottoNum();

	}

}
