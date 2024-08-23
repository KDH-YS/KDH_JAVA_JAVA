package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(coinBox.isEmpty()==false) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue()+"$");
		}
		
	}

}
