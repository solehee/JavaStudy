package quiz;

public class B12_Array2Quiz {
public static void main(String[] args) {
	int[][] numArr=new int[][] {
		{1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1},
		{1, 1},
		{1, 1, 1, 1}
	};
	
	//1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ㺸����
	for (int row=0;row<numArr.length;++row) {
		for(int column=0;column<numArr[row].length;++column) {
			numArr[row][column]=(int)(Math.random()*101);
			
		}
	}
	//2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����
	int sum=0;
	int count=0;
	
	for (int row=0;row<numArr.length;++row) {
		int len = numArr[row].length;
		count +=len;
		for(int column=0;column<len;++column) {
			numArr[row][column]=(int)(Math.random()*101);
			System.out.print(numArr[row][column]+"\t");
			sum+=numArr[row][column];
		}
		System.out.println();
	}
	System.out.printf("����:%d, ���:%.2f\n",sum,sum/(double)count);
	
	//3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
	int[] rowSum = new int[numArr.length];
	
	for (int row=0;row<numArr.length;++row) {
		for(int column=0;column<numArr[row].length;++column) {
			rowSum[row] +=numArr[row][column];
			
		}
	}
	//4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
	int max_len=0;
	for(int row=0; row<numArr.length;++row) {
		max_len=Math.max(max_len, numArr[row].length);
	}
	int[] colSum = new int[max_len];
	for(int row=0; row<numArr.length;++row) {
		for(int column=0;column<numArr[row].length;++column) {
		colSum[column]+=numArr[row][column];
			
		}
	}
	//�迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
	System.out.println("���� �� : "+java.util.Arrays.toString(rowSum));
	System.out.println("���� �� : "+java.util.Arrays.toString(colSum));
	
	/*int width=7;
	int height=5;
	int i,j;

	int[][] random=new int[width][height];
	
	for (i=0;i<width;++i) {
		for(j=0;j<height;++j) {
		random[i][j]=(int)(Math.random()*101);
		}
	}

	int sum_row=0;
	int sum_col=0;
	int total=0;
	double avg=0;
	for(i=0;i<width;++i) {
		for (j=0;j<height;++j) {
			System.out.printf("[%d][%d] %2d ",i,j,random[i][j]);
		}
		System.out.println();
	}					
	for(i=0;i<width;++i) {
		for(j=0;j<height-1;++j) {
			sum_col+=random[i][j];
			sum_row+=random[i][j];
			total+=sum_col+sum_row;
			avg=((double)total/((double)width+(double)height));
			
		}
		System.out.printf("[%d][%d]�� �հ�%d [%d][%d]�� �հ� %d\n",
							i,j,sum_row,i,j,sum_col);
	}
	System.out.printf("�� �հ� %d\n",total);
	System.out.printf("��� %.2f\n",avg);
	*/
				
	}		
				
	
	
	
	
	
}

