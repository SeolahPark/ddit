package c_statement;

public class C_CountingStars {

	public static void main(String[] args) {
		int i = 0, j = 0, z = 0;

		for (i = 1; i < 2; i++) {
			for (j = 1; j < 4; j++) {
				System.out.println("*****");
			}
		}
		System.out.println();

		// [삼각형]
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
				if (i == j)
					System.out.println();
			}
			
		}
		System.out.println();

		// [반전삼각형]
		// 방법1
		for (i = 1; i <= 5; i++) {
			for (j = 5; j > 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 방법2
		for (i = 1; i <= 5; i++) {
			for (j = i; j <= 4; j++)
				System.out.print(" ");
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();

		// [역삼각형]
		// 방법1
		for (i = 5; i > 0; i--) {

			for (j = 1; j <= 5; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println(" ");
					break;
				}
			}
		}
		System.out.println();

		// 방법2
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5 - (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 방법3
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println();

		// [역반전삼각형]
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (i - 1); j++) {
				System.out.print(" ");
			}
			for (z = 5; z >= 0; z--) {
				if (z >= i)
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// [피라미드]
		// 방법1
		int num = 0;
		for (i = 1; i <= 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (z = 0; z < i + num; z++) {
				System.out.print("*");
			}
			num++;
			System.out.println();
		}
		System.out.println();
		num = 0;

		// 방법2
		for (i = 0; i < 5; i++) {
			for (z = 0; z <= 5 - i - 2; z++)
				System.out.print(" ");

			for (j = 0; j < 2 * i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		// 방법3
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 9; j++) {
				if(j <= 5-i) {
					System.out.print(" ");
				}else if(j >= 5+i) {
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		
		// 방법4
		for(i = 1 ; i <= 5 ; i++) {			
			for(j = 4; j>=i; j--) { 
				System.out.print(" "); 
			}
			for(j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			for(j = 2 ; j <= i ; j++) {
				System.out.print("*");
			}System.out.println();
			}


		// [역피라미드]
		// 방법1
		System.out.println();
		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= 5 - i; j++) {
				System.out.print("*");
			}
			for (z = 0; z <= (5 - i) - 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 방법2
		for (i = 1; i < 6; i++) {
			for (z = 0; z < i - 1; z++)
				System.out.print(" ");

			for (j = 0; j < 2 * (6 - i) - 1; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
