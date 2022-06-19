package ch03;

public class While99dan {

	public static void main(String[] args) {
		int row = 2;
		while(row < 10) {
			int column = 1;
			while(column < 10) {
				System.out.printf("%4d", row * column);
				column ++;
			}
			System.out.println();
			row ++; // 각 단이 끝나면 다음 단으로 
		}
	}

}
