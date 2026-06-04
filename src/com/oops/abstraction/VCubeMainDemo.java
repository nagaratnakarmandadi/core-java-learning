package com.oops.abstraction;

public class VCubeMainDemo {

	public static void main(String[] args) {
		System.out.println("main method ");
		VCubeAbs j = new JavaFS();
		j.Technical();
		j.DailyAssignment();
		j.MockInterviews();
		j.Placements();
		j.WeeklyTest();
		VCubeAbs p = new PythonVcube();
		p.Technical();
		p.DailyAssignment();
		p.WeeklyTest();
		VCubeAbs d = new DevOpsVcube();
		d.Technical();
		d.DailyAssignment();
		d.MockInterviews();
		d.Placements();
		d.WeeklyTest();

	}

}
