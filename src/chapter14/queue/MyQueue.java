package chapter14.queue;

import java.util.ArrayList;

public class MyQueue {

	ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data); // 추가
	}

	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		return(arrayQueue.remove(0));
	}//deQueue

	@Override
	public String toString() {
		return arrayQueue.toString();
	}

	

}
