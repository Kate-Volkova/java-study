package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Kati");
		hello("tester");
		Square s = new Square(5);
		System.out.println("Square with edge " + s.a + " is equal " + s.square());
		Rectangle r = new Rectangle(28, 1);
		System.out.println("Rectangle square with edges " + r.b + " & " + r.c + " is equal " + r.square());
	}

	public static void hello (String name) {
		System.out.print("Hello, " + name + "! ");
	}



}