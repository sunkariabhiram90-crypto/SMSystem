package com;

public class Attendance {

	public static final double GOOD = 75.0;
	public static final double WARNING = 60.0;

	private int totalClasses;
	private int presentClasses;
	private int absentClasses;

	public Attendance() {

		totalClasses = 0;
		presentClasses = 0;
		absentClasses = 0;
	}

	public void update(int totalClasses, int presentClasses) {

		if (totalClasses < 0) {
			throw new IllegalArgumentException("Total classes cannot be negative.");
		}

		if (presentClasses < 0 || presentClasses > totalClasses) {

			throw new IllegalArgumentException("Invalid present class count.");
		}

		this.totalClasses = totalClasses;
		this.presentClasses = presentClasses;
		this.absentClasses = totalClasses - presentClasses;
	}

	public int getTotalClasses() {
		return totalClasses;
	}

	public int getPresentClasses() {
		return presentClasses;
	}

	public int getAbsentClasses() {
		return absentClasses;
	}

	public double getPercentage() {

		if (totalClasses == 0) {
			return 0;
		}

		return presentClasses * 100.0 / totalClasses;
	}

	public String getStatus() {

		double percentage = getPercentage();

		if (percentage >= GOOD) {
			return "GOOD";
		}

		if (percentage >= WARNING) {
			return "WARNING";
		}

		return "LOW";
	}
}
