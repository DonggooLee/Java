package org.ddongq.ex;

public class Ex08_threadTask implements Runnable {
	
	private String name;
	
	public Ex08_threadTask(String name) {
		setName(name);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
