import java.util.*;
public class UpandDown {
	public static void main(String[] args){		
		Random r = new Random();
		int cardNum = r.nextInt(100);
		int start = 0, end = 99;
		int num=-1, i = 1; //num = -1 �ʱ�ȭ  ������ y/n �̿ܿ� ���ڸ� �Է������� ����ó��. cardNum �������� ��� ������ �ʱ�ȭ�Ѱ�.
		Scanner in = new Scanner(System.in);		
		System.out.println("CPU�� ī�� �ѹ��� �����Ͽ����ϴ�.");
		while(true){
			if(num != cardNum){// ��(y/n) �Է½� �ٸ� ���� ���ö��� ���� ����ó��.
				System.out.println("���� "+start + "~" + end);
				System.out.print(+i+". ���� �ȿ� �ִ� ������ �Է��ϼ��� >>");
				num = in.nextInt();
			}
			if(num < start || num > end){ // ���� �ʰ��� �ٽ� �Է�.
				System.out.println("������ �ʰ� �Ͽ����ϴ�. �ٽ� �Է��Ͻÿ�.");
				continue;
			}
			if(cardNum == num){// ���� ���߾�����. 
				System.out.print("��� �Ͻ÷��� y�� �Է� . �����Ͻ÷��� n �� �Է��Ͻÿ�. y/n >>");
				String yN;
				yN = in.next(); // String type
				char tmp = yN.charAt(0); // String(0) -> char 
				if(tmp == 'y' ){// ��� ����
					start = 0; // �ٽ� �����ϸ鼭 �ʱ�ȭ.
					end = 99;
					cardNum = r.nextInt(100);
					System.out.println("CPU�� ī�� �ѹ��� �����Ͽ����ϴ�.");
					i=1;
					continue;				
				}
				else if(tmp == 'n')//����
					break;
				else{
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
					continue;
				}
			}
			else if(cardNum < num){ // ī�� �ѹ����� ������.
				end = num;
				System.out.println("�� ����");
				System.out.println("--------------");
				i++;
				continue;
			}
			else if(cardNum > num){ // ī�� �ѹ����� ������.
				start = num;
				System.out.println("�� ����");
				System.out.println("--------------");
				i++;
				continue;
			}
		}
		in.close();
	}
}
