package basic;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		//생성자 선언과 동시에 배열 삽입 (데이터)
		//int[] score = new int[5] 5개의 integer를 담고있는 배열
		
		//배열값 한번에 삽입 가능 
		/* int[] score = new int[] {10,20,30,40,50}; */
		
		//배열 식 축약
		int[] score= {10,20,30,40,50}; 
		
		//score라는 생성자의 길이를 세는 함수 
		int count = score.length; 
		
		System.out.println(count);
		
		//배열에 값 참조해서 담기 
		/*
		 * score[0] = -1; // -1으로 초기화
		 */		System.out.println(score[0]);
		 
		 //리스트활용하기
		 ArrayList<Integer> scoreList = new ArrayList<>();
		 scoreList.add(10);
		 scoreList.add(20);
		 scoreList.add(30);
		 scoreList.add(40);
		 scoreList.add(50);
		 
		 System.out.println(scoreList.get(1)); //20
		 
		 //리스트에 인덱스값 추가하기 
		 scoreList.add(1,100); //1번째 인덱스에 100이라는 value 넣기 
		 
		 System.out.println(scoreList); // [10, 100, 20, 30, 40, 50]
		 
		 //리스트에 인덱스값 제거하기
		 scoreList.remove(0); // 0번째 인덱스값 삭제하기 
		 
		 System.out.println(scoreList); // [100, 20, 30, 40, 50]
		 System.out.println(scoreList.get(1)); // 20
		 System.out.println(scoreList); // [100, 20, 30, 40, 50]
		 
		 
		 
		 
 //-------------------------------스트링배열----------------------------------------------

		 // 1)일반 기초배열		 
		 String[] names = {"홍길동","이순신","유관순"};
		 
		 //	2)ArrayList 스트링배열
		 ArrayList<String> colors = new ArrayList<>();
		 colors.add("blue");
		 colors.add("yello");
		 colors.add("green");
		 colors.add("puple");
		 
		//set() method로 기존에 추가된 값 변경가능(스트링배열만 가능)
		 colors.set(4,"black");
		 
		 System.out.println(colors);
	}
}