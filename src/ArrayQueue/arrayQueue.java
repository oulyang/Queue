package ArrayQueue;



public class arrayQueue {
	private int maxSize;
	private int front;
	private int rear;
	private int[] arr;
	public arrayQueue() {
		super();
	}

	public arrayQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		arr=new int [maxSize];
		front=-1;
		rear=-1;
	}
	//判断队列是否满
	public boolean isFull() {
		return rear==maxSize-1;
	}
	//判断队列是否为空
	public boolean isEmpty() {
		return rear==front;
	}
	//往队列添加元素
	public void add(int e) {
		if(isFull()) {
			System.out.println("队列已满");
			return;
		}
		arr[++rear]=e;
	}
	//获取队列数据
	public int getQueue(){
		if(isEmpty()) {
			throw new RuntimeException("队列为空，不能取");
		}
		return arr[++front];
	}
	//显示当前队列数据
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("队列为空，无法显示");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	//显示队列头数据
	public void peek() {
		if(isEmpty()) {
			throw new RuntimeException("队列为空，无法显示");
		}
		System.out.println(arr[front+1]);
	}
}
