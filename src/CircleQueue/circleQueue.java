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
	//�ж϶����Ƿ���
	public boolean isFull() {
		return (rear+1)%maxSize==front;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear==front;
	}
	//�������
	public void add(int e) {
		if(isFull()) {
			System.out.println("��������");
			return;
		}
		arr[rear]=e;
		rear=(rear+1)%maxSize;
	}
	//��ȡ��������
	public int getQueue(){
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ�����ȡ");
		}
		int value=arr[front];
		front=(front+1)%maxSize;
		return value;
	}
	//��ʾ��ǰ��������
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("����Ϊ�գ��޷���ʾ");
		}
		for(int i=front;i<front+size();i++) {
			System.out.print(" "+arr[i%maxSize]);
		}
		System.out.println();
	}
	//�����ǰ������Ч���ݵĸ���
	public int size() {
		return (rear+maxSize-front)%maxSize;
	}
	//��ʾ����ͷ����
	public void peek() {
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ��޷���ʾ");
		}
		System.out.println( arr[front]);
	}
}
