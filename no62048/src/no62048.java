/*
 < ������ �簢�� >
 ���� ���̰� Wcm, ���� ���̰� Hcm�� ���簢�� ���̰� �ֽ��ϴ�. 
 ���̿��� ����, ���� ����� �����ϰ� ���� ���·� ���� �׾��� ������, ��� ����ĭ�� 1cm x 1cm ũ���Դϴ�. 
 �� ���̸� ���� ���� ���� 1cm �� 1cm�� ���簢������ �߶� ����� �����̾��µ�, �������� �� ���̸� �밢�� ������ 2���� �մ� �������� �߶� ���ҽ��ϴ�.
 �׷��Ƿ� ���� ���簢�� ���̴� ũ�Ⱑ ���� �����ﰢ�� 2���� �������� �����Դϴ�. ���ο� ���̸� ���� �� ���� �����̱� ������, 
 �� ���̿��� ���� ������ ����, ���� ����� �����ϰ� 1cm �� 1cm�� �߶� ����� �� �ִ� ��ŭ�� ����ϱ�� �Ͽ����ϴ�.
������ ���� W�� ������ ���� H�� �־��� ��, ����� �� �ִ� ���簢���� ������ ���ϴ� solution �Լ��� �ϼ��� �ּ���.

 < ���ѻ��� >
 W, H : 1�� ������ �ڿ���
 
 < ����� �� >
 w = 8, h = 12 -> result = 80
 ���ΰ� 8, ���ΰ� 12�� ���簢���� �밢�� �������� �ڸ��� �� 16�� ���簢���� ����� �� ���� �˴ϴ�. 
 ���� ���簢�������� 96���� ���簢���� ���� �� �־����Ƿ�, 96 - 16 = 80 �� ��ȯ�մϴ�.
 
 */

import java.util.Scanner;

public class no62048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		System.out.println(solution(w,h));
	}
	
	public static long solution(int w,int h) {
		long answer = 1;
		long lw = w;
        long lh = h;
        
        if (lw == lh) {
         answer = lw * lw - lw;   
        }else if(lw > lh) {
			answer = lw * lh - (lw + lh - gcd(lw, lh));
		} else {
			answer = lw * lh - (lw + lh - gcd(lh, lw));
		} 
        
		return answer;
	}
    
    public static long gcd(long big, long small) {
		while(small > 0) {
			long temp = big % small;
			big = small;
			small = temp;
		}
		return big;
	}

}
