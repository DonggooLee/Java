package org.ddongq.test;

class GugudanPlay {
	public void play(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
	}
}

class Gugudan extends Thread{
	private int dan;
	private GugudanPlay gugudan;
	
	public Gugudan(int dan, GugudanPlay gugudan) {
		this.dan = dan;
		this.gugudan = gugudan;
	}
	
	@Override
	public void run() {
		gugudan.play(dan);
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Gugudan[] dan = new Gugudan[8];
		
		for(int i=0; i<dan.length; i++) {
			dan[i] = new Gugudan((i+2), new GugudanPlay());
			dan[i].start();
		}
		
	}
}
