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
	//�ж϶����Ƿ���
	public boolean isFull() {
		return rear==maxSize-1;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear==front;
	}
	//���������Ԫ��
	public void add(int e) {
		if(isFull()) {
			System.out.println("��������");
			return;
		}
		arr[++rear]=e;
	}
	//��ȡ��������
	public int getQueue(){
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ�����ȡ");
		}
		return arr[++front];
	}
	//��ʾ��ǰ��������
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("����Ϊ�գ��޷���ʾ");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	//��ʾ����ͷ����
	public void peek() {
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ��޷���ʾ");
		}
		System.out.println(arr[front+1]);
	}
}
