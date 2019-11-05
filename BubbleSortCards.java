package recursive;

import java.util.*;
public class BubbleSortCards {
	public static void bubbleSortCards(Card[] arr) {
		for (int i = 0; i < arr.length;i++) {
			for (int j = 0;j<arr.length-1-i;j++) {
				if (Card.getValue(arr[j]) > Card.getValue(arr[j+1])) {
					Card temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				if (Card.getValue(arr[j]) == Card.getValue(arr[j+1])) {
					if(arr[i].toString()=="J") {
						Card temp2 = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp2;
					}
				}
			}
		}
	}//method
	
	public static void main(String args[]) {
		Card myHand [] = {Card.jack, Card.seven, Card.queen, Card.five};
		System.out.println(Arrays.toString(myHand));
		bubbleSortCards(myHand);
		System.out.println(Arrays.toString(myHand));
	}

}
