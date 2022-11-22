package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {

		int[] arr = {99, 22, 68, 30, 87, 1, 13};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) { // 전체적인 사이클이 돌아가는 for문
			for (int j = 1; j < arr.length; j++) { // 자기들끼리 돌아가는 for문
				if (arr[j - 1] > arr[j]) { // 앞에 숫자가 뒤에 숫자보다 큰 경우 // 3 0
					temp = arr[j - 1]; // temp에 더 큰 숫자를 보관 // temp = 3
					arr[j - 1] = arr[j]; // 더 작은 숫자를 앞으로 보내기 // arr[j - 1] = 0
					arr[j] = temp; // temp에 저장한 숫자를 뒤로 보내기 // arr[j] = 3
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
