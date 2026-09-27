package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SMS system = new SMS(scanner);

		system.run();

		scanner.close();
	}
}
