package com.learning.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private Jobs job;
	private double monthlyWage;
	private List<Employee> subordinates;

	public Employee(final String name, final Jobs job, final double monthlyWage) {
		this.name = name;
		this.job = job;
		this.monthlyWage = monthlyWage;
		subordinates = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(final Jobs job) {
		this.job = job;
	}

	public double getMonthlyWage() {
		return monthlyWage;
	}

	public void setMonthlyWage(final double monthlyWage) {
		this.monthlyWage = monthlyWage;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(final List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	public void addSubordinate(final Employee subordinate) {
		subordinates.add(subordinate);
	}

	public void removeSubordinate(final Employee subordinate) {
		subordinates.remove(subordinate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((job == null) ? 0 : job.hashCode());
		long temp;
		temp = Double.doubleToLongBits(monthlyWage);
		result = (prime * result) + (int) (temp ^ (temp >>> 32));
		result = (prime * result) + ((name == null) ? 0 : name.hashCode());
		result = (prime * result) + ((subordinates == null) ? 0 : subordinates.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (job != other.job) {
			return false;
		}
		if (Double.doubleToLongBits(monthlyWage) != Double.doubleToLongBits(other.monthlyWage)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (subordinates == null) {
			if (other.subordinates != null) {
				return false;
			}
		} else if (!subordinates.equals(other.subordinates)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", monthlyWage=" + monthlyWage + ", subordinates="
				+ subordinates + "]";
	}

}
