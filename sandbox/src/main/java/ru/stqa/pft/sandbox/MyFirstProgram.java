package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Katia");
		hello("tester");
		int a = 2;
		System.out.println("Площадь квадрата со стороной " + a + " равна " + square(a));
		int c = 2; int d = 5;
		System.out.println("Площадь прямоугольника со сторонами " + c + " и " + d + " равна " + square(c, d));
	}

	public static void hello (String name) {
		System.out.print("Hello, " + name + "! ");
	}

	public static int square (int a) {
		return a * a;
	}

	public static int square (int a, int b) {
		return a * b;
	}

}