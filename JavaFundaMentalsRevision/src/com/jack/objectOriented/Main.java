package com.jack.objectOriented;

public class Main {

	public static void main(String[] args) {
		
		var textBox1 = new TextBox();
		textBox1.setText("Box One");
		System.out.println(textBox1.text.toUpperCase());
		
		var textBox2=  new TextBox();
		textBox2.setText("Box no 2");
		System.out.println(textBox2.text.toString());
	}
}
