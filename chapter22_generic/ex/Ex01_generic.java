package org.ddongq.ex;

class Box {
	
	// 필드
	private Object obj;
	// 메소드
	public Object getObj() {			//getter는 값을 꺼내와야하기 떄문에 메소드데이터 타입이 그필드의 데이터 타입이다.
		return obj;
	}
	public void setObj(Object obj) {	//setter는 저장만 하면 끝이기떄문에 void
		this.obj = obj;
	}

}

// 담을 물건들
class BallPen {}
class Pencil {}

public class Ex01_generic {
	public static void main(String[] args) {
		
		Box box = new Box();					// 디폴트 생성자가 자동으로 생성된 뒤 호출됨
		
		box.setObj(new BallPen());
		//Object obj =  new BallPen();			// 업캐스팅
		BallPen myPen = (BallPen)box.getObj();	// 볼펜을 빼려면 볼펜으로 다운 캐스팅 해줘야 한다!
		System.out.println(myPen);
		
		box.setObj(new Pencil());
		Pencil myPencil = (Pencil)box.getObj();
		System.out.println(myPencil);
		
		Bag<Pen> pen = new Bag<>();
		
	}
}




