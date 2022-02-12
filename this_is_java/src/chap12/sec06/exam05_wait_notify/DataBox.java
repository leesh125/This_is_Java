package chap12.sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
		data = null; // 소비자가 데이터를 읽으면 null
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// 소비자가 아직 데이터를 읽지 않았다면
		if(this.data != null) { 
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}
	
	
}
