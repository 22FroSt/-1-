import java.util.Arrays;
import java.util.Random;

public class Array {
	int [] Array;
	public Array() {
		Random r = new Random();

		int[] su = new int[6];

		for(int i = 1; i<=5; i++) {

		su[i]=r.nextInt(100)+1; //0~100 ���� 

			if(i>=1) {

				for(int j=0;j<i;j++) {

					if(su[i]==su[j]) {

					su[i]=r.nextInt();

					j=-1;

					}

				}

			}

		}

			//��������

			System.out.println("��������");

			Arrays.sort(su);

			for (int k : su) {

				System.out.println(k+" ");

			}

			//��������

			System.out.println("��������");

			for (int i = su.length-1; i>=0; i--) {

				System.out.println(su[i]+" ");

		}
	}
}
