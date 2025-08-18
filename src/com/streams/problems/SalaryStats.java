package com.streams.problems;

public class SalaryStats {

	double average;
	double min;
	double max;

	public SalaryStats(double avg, double min, double max) {
		this.average = avg;
		this.min = min;
		this.max = max;
	}

	public String toString() {
		return "SalaryStats [average=" + average + ", min=" + min + ", max=" + max + "]";
	}
}
