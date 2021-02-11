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
			System.out.println("s:显示队列信息");
			System.out.println("e:退出程序");
			System.out.println("a:添加元素");
			System.out.println("p:显示队列首元素信息");
			System.out.println("g:取出队列信息");
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
				System.out.println("请重新输入");
				break;	
			}
		}
		
	}

}
