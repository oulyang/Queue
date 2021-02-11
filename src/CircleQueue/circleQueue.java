package CircleQueue;

public class circleQueue {
	private int maxSize;
	private int front;
	private int rear;
	private int[] arr;
	public circleQueue() {
		super();
	}
	public circleQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		arr=new int [maxSize];	
	}
	//判断队列是否满
	public boolean isFull() {
		return (rear+1)%maxSize==front;
	}
	//判断队列是否为空
	public boolean isEmpty() {
		return rear==front;
	}
	//添加数据
	public void add(int e) {
		if(isFull()) {
			System.out.println("队列已满");
			return;
		}
		arr[rear]=e;
		rear=(rear+1)%maxSize;
	}
	//获取队列数据
	public int getQueue(){
		if(isEmpty()) {
			throw new RuntimeException("队列为空，不能取");
		}
		int value=arr[front];
		front=(front+1)%maxSize;
		return value;
	}
	//显示当前队列数据
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("队列为空，无法显示");
		}
		for(int i=front;i<front+size();i++) {
			System.out.print(" "+arr[i%maxSize]);
		}
		System.out.println();
	}
	//求出当前队列有效数据的个数
	public int size() {
		return (rear+maxSize-front)%maxSize;
	}
	//显示队列头数据
	public void peek() {
		if(isEmpty()) {
			throw new RuntimeException("队列为空，无法显示");
		}
		System.out.println( arr[front]);
	}
}
