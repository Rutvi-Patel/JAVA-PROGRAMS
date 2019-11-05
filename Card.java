package recursive;
import java.util.*;
public class Card {
	private String face;
	private int value;
	
	public static Card ace= new Card("A",11);
	public static Card jack= new Card("J",10);
	public static Card queen= new Card("Q",10);
	public static Card king= new Card("K",10);
	public static Card two= new Card("2",2);
	public static Card three= new Card("3",3);
	public static Card four= new Card("4",4);
	public static Card five= new Card("5",5);
	public static Card six= new Card("6",6);
	public static Card seven= new Card("7",7);
	public static Card eight= new Card("8",8);
	public static Card nine= new Card("9",9);
	public static Card ten= new Card("10",10);
	
			
			
	public Card(String face,int value) {
		this.face = face;
		this.value = value;
	}
	public static int getValue(Card i) {
		return i.value;
	}
	public String toString() {
		return this.face;
	}
	
}
