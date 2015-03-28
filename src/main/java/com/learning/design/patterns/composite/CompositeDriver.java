package com.learning.design.patterns.composite;

public class CompositeDriver {

	public static void main(final String[] args) {
		Employee programManager = new Employee("Joe Bloggs", Jobs.PROGRAM_MANAGER, 5000);

		Employee masterEng = new Employee("Patrick", Jobs.MASTER_ENG, 3000);
		new Employee("Robert", Jobs.MASTER_ENG, 3000);
		new Employee("Mary", Jobs.MASTER_ENG, 3000);
		Employee senEng1 = new Employee("Brian", Jobs.SENIOR_ENG, 3000);
		Employee senEng2 = new Employee("Eoin", Jobs.SENIOR_ENG, 3000);
		Employee eng1 = new Employee("Amy", Jobs.ENGINEER, 2250);
		Employee eng2 = new Employee("Gerard", Jobs.ENGINEER, 2250);
		Employee trainee = new Employee("Chris", Jobs.TRAINEE_ENG, 1800);

		programManager.addSubordinate(masterEng);
		masterEng.addSubordinate(senEng1);
		masterEng.addSubordinate(senEng2);
		senEng1.addSubordinate(eng1);
		senEng2.addSubordinate(eng2);
		eng1.addSubordinate(trainee);

		System.out.println(programManager);
		for (Employee subs : programManager.getSubordinates()) {
			System.out.println("\t" + subs);
			for (Employee masterEngSubs : subs.getSubordinates()) {
				System.out.println("\t\t" + masterEngSubs);
				for (Employee senEngSubs : masterEngSubs.getSubordinates()) {
					System.out.println("\t\t\t" + senEngSubs);
					for (Employee engineerSubs : senEngSubs.getSubordinates()) {
						System.out.println("\t\t\t\t" + engineerSubs);
					}
				}
			}
		}

	}

}
