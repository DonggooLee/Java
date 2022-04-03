package org.ddongq.test;

class GugudanPlay2 {
	public void play(int dan) {
		synchronized (this) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "x" + i + "=" + (dan*i));
			}
		}
	}
}

class Gugudan2 extends Thread{
	private int dan;
	private GugudanPlay2 gugudan;
	
	public Gugudan2(int dan, GugudanPlay2 gugudan) {
		this.dan = dan;
		this.gugudan = gugudan;
	}
	
	@Override
	public void run() {
		gugudan.play(dan);
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		GugudanPlay2 play = new GugudanPlay2();
		Gugudan2[] dan = new Gugudan2[8];
		
		for(int i=0; i<dan.length; i++) {
			dan[i] = new Gugudan2((i+2), play);
			dan[i].start();
		}
		
//		Gugudan2 dan2 = new Gugudan2(2, play);
//		Gugudan2 dan3 = new Gugudan2(3, play);
//		Gugudan2 dan4 = new Gugudan2(4, play);
//		Gugudan2 dan5 = new Gugudan2(5, play);
//		Gugudan2 dan6 = new Gugudan2(6, play);
//		Gugudan2 dan7 = new Gugudan2(7, play);
//		Gugudan2 dan8 = new Gugudan2(8, play);
//		Gugudan2 dan9 = new Gugudan2(9, play);
//		
//		dan2.start();
//		dan3.start();
//		dan4.start();
//		dan5.start();
//		dan6.start();
//		dan7.start();
//		dan8.start();
//		dan9.start();	
		
	}
}
