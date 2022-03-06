package org.ddongq.test2;

public class Test04 {
	public static void main(String[] args) {
//		Q. 전체 구구단 출력하기_2
//		ex) 2x1 = 2 	3x1 = 3 	...		9x1 = 9
//			2x2 = 4		3x2 = 6		...		9x2 = 18
//			...
//			2x9 = 18	3x9 = 27 	...		9x9 = 81
		
//		int i=2;
//        int j=1;
//        while (i<=9) {     
//            while (j<=9) 
//            {
//               System.out.print( i +" X "+ j +" = " + (i*j));
//               j++;
//               System.out.println();
//             } 
//            j = 1;
//            i++;
//            System.out.println();
//        }
//        
//        // 도현씨 문제 풀이
//        for(int b=1; b<10; b++) {
//           for(int a=2; a<10; a++) {
//              System.out.print(a+"*"+b+ "="+a*b+"   ");
//              if(a==9){
//                 System.out.println("\n");
//              }
//           }
//        }
        
        // 선생님 문제 풀이
        
        for(int num=1; num<=9; num++) {
	        for(int dan=2; dan<=9; dan++) {
	        	System.out.print(dan + "X" + num + "=" + (dan*num) + "\t"); // \t는 한칸씩 띄우기 위해
	        }
	        System.out.println();
        }
        
	}
}
