package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class Result {

	public static final double MAX_MARKS = 100;

	private final LinkedHashMap<String, Double> subjectMarks;

	public Result() {
		subjectMarks = new LinkedHashMap<>();
	}

	public void setMark(String subject, double mark) {

		if (subject == null || subject.trim().isEmpty()) {
			throw new IllegalArgumentException("Subject cannot be empty.");
		}

		if (mark < 0 || mark > MAX_MARKS) {
			throw new IllegalArgumentException("Marks must be between 0 and 100.");
		}

		subjectMarks.put(subject.trim(), mark);
	}

	public Map<String, Double> getSubjectMarks() {
		return subjectMarks;
	}

	public double getTotal() {

		double total = 0;

		for (double mark : subjectMarks.values()) {
			total += mark;
		}

		return total;
	}

	public double getAverage() {

		if (subjectMarks.isEmpty()) {
			return 0;
		}

		return getTotal() / subjectMarks.size();
	}

	public double getPercentage() {
		return getAverage();
	}

	public String getGrade() {

		double percentage = getPercentage();

		if (percentage >= 90) {
			return "A+";
		}

		if (percentage >= 80) {
			return "A";
		}

		if (percentage >= 70) {
			return "B";
		}

		if (percentage >= 60) {
			return "C";
		}

		if (percentage >= 50) {
			return "D";
		}

		return "F";
	}

	public String getResultStatus() {

		if (subjectMarks.isEmpty()) {
			return "NOT AVAILABLE";
		}

		return getPercentage() >= 50 ? "PASS" : "FAIL";
	}

	public boolean hasResult() {
		return !subjectMarks.isEmpty();
	}

	public void clear() {
		subjectMarks.clear();
	}
}