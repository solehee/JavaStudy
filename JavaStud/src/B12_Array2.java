
public class B12_Array2 {
	public static void main(String[] args) {
		// �迭 ���ο��� �迭�� ���� �� �ִ�
		
		int[] numbers = {1,2,3,4,5,6};
		int[][] arr2= {
				{65, 66, 67, 68, 69},
				numbers,
				{9, 9, 9, 9, 9, 9, 9, 9, 9}
		};
		// stack �� ������� �ʰ� hip�� ����� ���̸� �� �� ���� ��������
		System.out.println(arr2[0][3]);
		System.out.println(arr2[1][3]);
		System.out.println(arr2[2][3]);
		
		// n���� �迭�� n�� �ݺ������� ��� Ž�� �� �� �ִ�
		for (int i =0; i<arr2.length;++i) {
			for (int j=0;j<arr2.length;++j){
				System.out.printf("arr2[%d][%d]: %d\n",i,j,arr2[i][j]);
				
			}
		}
		//---------------------------
		
		int[][] block1= {
				{0, 1, 1},
				{0, 0, 1},
				{0, 0, 1},
		};
		int width=3;
		int height=3;
		for (int i=0;i<width;++i) {
			for(int j=0;j<height;++j) {
			if(block1[i][j]==0)	{
				System.out.print("�� ");
			}
			else if(block1[i][j]==1) {
				System.out.print("�� ");
			}
			}
			System.out.println();
		}
	}
}
