import java.util.*;
public class UpandDown {
	public static void main(String[] args){		
		Random r = new Random();
		int cardNum = r.nextInt(100);
		int start = 0, end = 99;
		int num=-1, i = 1; //num = -1 초기화  이유는 y/n 이외에 문자를 입력했을때 예외처리. cardNum 범위에서 벗어난 값으로 초기화한것.
		Scanner in = new Scanner(System.in);		
		System.out.println("CPU가 카드 넘버를 선택하였습니다.");
		while(true){
			if(num != cardNum){// ㄷ(y/n) 입력시 다른 문자 나올때를 위한 예외처리.
				System.out.println("범위 "+start + "~" + end);
				System.out.print(+i+". 범위 안에 있는 정수를 입력하세요 >>");
				num = in.nextInt();
			}
			if(num < start || num > end){ // 범위 초과시 다시 입력.
				System.out.println("범위를 초과 하였습니다. 다시 입력하시오.");
				continue;
			}
			if(cardNum == num){// 답을 맞추었을때. 
				System.out.print("계속 하시려면 y를 입력 . 종료하시려면 n 을 입력하시오. y/n >>");
				String yN;
				yN = in.next(); // String type
				char tmp = yN.charAt(0); // String(0) -> char 
				if(tmp == 'y' ){// 계속 실행
					start = 0; // 다시 시작하면서 초기화.
					end = 99;
					cardNum = r.nextInt(100);
					System.out.println("CPU가 카드 넘버를 선택하였습니다.");
					i=1;
					continue;				
				}
				else if(tmp == 'n')//종료
					break;
				else{
					System.out.println("잘못된 문자를 입력하셨습니다.");
					continue;
				}
			}
			else if(cardNum < num){ // 카드 넘버보다 높을때.
				end = num;
				System.out.println("더 낮게");
				System.out.println("--------------");
				i++;
				continue;
			}
			else if(cardNum > num){ // 카드 넘버보다 낮을때.
				start = num;
				System.out.println("더 높게");
				System.out.println("--------------");
				i++;
				continue;
			}
		}
		in.close();
	}
}
