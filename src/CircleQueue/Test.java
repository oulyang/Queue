package CircleQueue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleQueue cq=new circleQueue(3);
		char key=' ';
		Scanner s=new Scanner(System.in);
		boolean loop=true;
		while(loop) {
			System.out.println("s:��ʾ������Ϣ");
			System.out.println("e:�˳�����");
			System.out.println("a:���Ԫ��");
			System.out.println("p:��ʾ������Ԫ����Ϣ");
			System.out.println("g:ȡ��������Ϣ");
			key=s.next().charAt(0);
			switch(key) {
			case's':
				cq.showQueue();
				break;
			case'e':
				System.exit(0);
				break;
			case'a':
				int value=s.nextInt();
				cq.add(value);
				break;
			case'p':
				cq.peek();
				break;
			case'g':
				try {
					int ret=cq.getQueue();
					System.out.println(ret);
				}catch(Exception e){
					e.getMessage();
				}
				break;
			default:
				System.out.println("����������");
				break;	
			}
		}
		
	}

}
