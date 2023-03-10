package CheckPoint;

public class CheckPoint8_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] array = new int[5][3][8];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + " ");
				}
				System.out.println("---"+j);
			}
			System.out.println("- "+i);
		}
	}
}
