package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 	#������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2
	 	
	 	1. �ִ밪�� �Ű������� ���޹�����
	 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ����� ������
	 	
	 	ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	
	 	2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
	 	�ּҰ����� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ��������
	 	
	 	ex: range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 	
	 	3. �ּڰ��� �ִ밪�� �������� �Ű������� ���޹�����
	 	�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ����� ������
	 	
	 	ex: range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
	 		range(40, 45, 5)�� ��� -> [40]
	 		range(40, 46, 5)�� ��� -> [40, 45]
	*/
	/*
	 	# �Լ� �����ε�(overloading)
	  	 - �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����� �� �ִ�
	 */
	public static int[] range(float num) {
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
		return null;
	}

	
	
	public static int[] range(int num) {
		int[] arr = new int[num];
		for(int i=0;i<num;++i) {
			arr[i]=i;
		}
		return arr;
	}
	/*public static int[] range(int num) {
		int [] numArray=new int[num];
		if(num!=0) {
			for(int i=0;i<num;++i) {
				numArray[i]=i;
			}			
		}
		return numArray;	
	}*/
	
	//------------------------------------------
	public static int[] range(int start, int end) {		
		int increase = start>end?-1:1;
		int[] arr = new int [increase<0? start-end:end-start];
		
		for (int value=start, index=0;value!=end;value+=increase) {
			arr[index++] = value;
		}
		return arr;
	}
	
	
	/*public static int[] maxMin(int maxNum, int minNum) {
		int max = Math.max(maxNum, minNum);
		int min = Math.min(maxNum, minNum);
		int index=0;
		int range[] = new int[max];
		for (int i=min;i<max;++i) {
			range[index++]=i+1;
		}
		return range;
	}
	*/
	//--------------------------------------------------

	/**
	   ����ȭ �ּ� (�� ��ɿ� ���� ������ �� �� �ִ�)
	   
	   @start
	   	 �����ϴ� ���� ��������
   	   @end
   	  	 ������ ���� ��������
  	   @return
  	     �߸��� ���� �Է��ϸ� null�� ������, ����� ������ int[]�� ���ɴϴ�.
 	 */
	public static int[] range(int start, int end, int increase) {
		if(increase<0&& start<=end) {
			return null; //new int[];
		} else if(increase>0&&start>=end) {
			return null;
		} else if(increase==0) {
			return null;
		}
		//(100 - 70)/4
		//100 96 92 88 84 80 76 72
		
		//(100 - 92)/4
		// 100 96
		int size;
		if(increase>0) {
			int range = end-start;
			size=range%increase==0?range/increase: range/increase+1;
		}
		else {
			int range = start-end;
			size=range%(increase* -1)==0?
				range/(increase* -1): range/(increase* -1)+1;
		}
		System.out.println("size : "+ size);
		int[] arr = new int [size];
		
		for (int value=start, index=0; 
				increase>0? value<end : value>end;value+=increase) {
			arr[index++] = value;
			System.out.printf("arr[%d] : %d\n",index-1,value);
		}
		return arr;
	}
	
	/*public static int[] addArray(int maxNum, int midNum ,int minNum) {
		int max=0;
		int mid=0;
		int min=0;
		boolean large = (maxNum>midNum)&&(maxNum>minNum);
		boolean large2 = (midNum>maxNum)&&(midNum>minNum);
		int range[] = new int[max];
		if(large) {
			max = maxNum;
			mid=Math.max(minNum, midNum);
			min=Math.min(minNum, midNum);
			
			for(int i=1;i<max;++i) {
				for(int j=mid;j<i;) {
					j+=min;
					range[i]+=j;
				}
				return range;
			}
		}
		else if(large2) {
			max=midNum;
			mid=Math.max(maxNum, minNum);
			min=Math.min(maxNum, minNum);
			
			for(int i=1;i<max;++i) {
				for(int j=mid;j<i;) {
					j+=min;
					range[i]+=j;
				}
				return range;
			}
		}
		max=minNum; mid=Math.max(maxNum, midNum);
		min = Math.min(maxNum, midNum);
		for(int i=1;i<max;++i) {
			for(int j=mid;j<i;) {
				j+=min;
				range[i]+=j;
			}
		}
		return range;
	}*/
	//----------------------------------------------------------
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(range(10)));
		int minNum=20, maxNum=40; 
		int midNum=30;
		
		System.out.println(Arrays.toString(range(20,40)));
		System.out.println(Arrays.toString(range(99,5,-2)));
	}
}
