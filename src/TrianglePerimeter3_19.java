import java.util.Scanner;

public class TrianglePerimeter3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȡ������
        Scanner input = new Scanner(System.in);
        System.out.println("�����ߣ�");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

        // ��С��������
        double temp;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }

        // �ж�������̱ߵĺ��Ƿ���ڵ�����
        if(a + b > c){
            double perimeter = a + b + c;
            System.out.println("�ܳ�Ϊ��"+perimeter);
        }else{
            System.out.println("����ֵ���Ϸ�");
        }

	}

}
