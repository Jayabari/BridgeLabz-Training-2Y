package com.tech.StudentManagementApp;

import java.sql.*;
import java.util.Scanner;

public class StudentAppManagement {
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db";
	static final String DB_USER = "root";
	static final String DB_PASSWORD = "Ja@100@ya";

	static Connection conn;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
			while (true) {
				System.out.println("\n1:Add Student  2:View Students  3:Update Student  4:Delete Student");
				System.out.println("5:Add Result   6:View Results   7:Update Result   8:Delete Result   9:Exit");
				System.out.print("Choice: ");
				String c = sc.nextLine();
				try {
					switch (c) {
						case "1": addStudent(); break;
						case "2": viewStudents(); break;
						case "3": updateStudent(); break;
						case "4": deleteStudent(); break;
						case "5": addResult(); break;
						case "6": viewResults(); break;
						case "7": updateResult(); break;
						case "8": deleteResult(); break;
						case "9": return;
						default: System.out.println("Invalid choice");
					}

				} catch (SQLException e) {
					System.out.println("SQL Error: " + e.getMessage());
				}
			}
		} catch (SQLException e) {
			System.out.println("DB connection error: " + e.getMessage());
		} finally {
			try { if (conn != null) conn.close(); } catch (Exception ignored) {}
			sc.close();
			System.out.println("Exit");
		}
	}

	static String esc(String s) {
		return s == null ? "" : s.replace("'", "''");
	}

	static boolean existsStudent(String id) throws SQLException {
		String sql = "SELECT 1 FROM student WHERE Id = '" + esc(id) + "'";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
			return rs.next();
		}
	}

	static boolean existsResult(String id) throws SQLException {
		String sql = "SELECT 1 FROM results WHERE student_id = '" + esc(id) + "'";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
			return rs.next();
		}
	}

	static Integer parseMark(String s) {
		if (s == null || s.isEmpty() || !s.matches("\\d+")) return null;
		int m = Integer.parseInt(s);
		return (m >= 0 && m <= 100) ? m : null;
	}

	static String gradeFor(double p) {
		if (p >= 90) return "A+";
		if (p >= 80) return "A";
		if (p >= 70) return "B+";
		if (p >= 60) return "B";
		if (p >= 50) return "C";
		return "F";
	}

	// --- Add Student ---
	static void addStudent() throws SQLException {
		System.out.print("Student ID: ");
		String id = sc.nextLine();
		if (id.isEmpty()) { System.out.println("ID required"); return; }
		if (existsStudent(id)) { System.out.println("Student ID already exists"); return; }

		System.out.print("First Name: ");
		String fn = sc.nextLine();
		System.out.print("Last Name: ");
		String ln = sc.nextLine();
		if (fn.isEmpty() || ln.isEmpty()) {
			System.out.println("First & Last name required");
			return;
		}

		String sql = "INSERT INTO student(Id, FirstName, LastName) VALUES ('" +
				esc(id) + "', '" + esc(fn) + "', '" + esc(ln) + "')";
		try (Statement st = conn.createStatement()) {
			st.executeUpdate(sql);
		}
	}

	// --- View Students ---
	static void viewStudents() throws SQLException {
		String sql = "SELECT Id, FirstName, LastName FROM student";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
			boolean any = false;
			System.out.printf("%-10s %-15s %-15s%n", "ID", "First Name", "Last Name");
			while (rs.next()) {
				any = true;
				System.out.printf("%-10s %-15s %-15s%n",
						rs.getString(1), rs.getString(2), rs.getString(3));
			}
			if (!any) System.out.println("No students found");
		}
	}

	// --- Update Student ---
	static void updateStudent() throws SQLException {
		System.out.print("Student ID: ");
		String id = sc.nextLine();
		if (!existsStudent(id)) { System.out.println("Not found"); return; }

		String q = "SELECT FirstName, LastName FROM student WHERE Id = '" + esc(id) + "'";
		String fn = "", ln = "";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(q)) {
			if (rs.next()) {
				fn = rs.getString(1);
				ln = rs.getString(2);
			}
		}

		System.out.print("New First Name (" + fn + "): ");
		String t = sc.nextLine();
		if (!t.isEmpty()) fn = t;

		System.out.print("New Last Name (" + ln + "): ");
		t = sc.nextLine();
		if (!t.isEmpty()) ln = t;

		String sql = "UPDATE student SET FirstName='" + esc(fn) +
				"', LastName='" + esc(ln) + "' WHERE Id='" + esc(id) + "'";
		try (Statement st = conn.createStatement()) { st.executeUpdate(sql); }
	}

	// --- Delete Student ---
	static void deleteStudent() throws SQLException {
		System.out.print("Student ID: ");
		String id = sc.nextLine();
		if (!existsStudent(id)) { System.out.println("Not found"); return; }

		System.out.print("Confirm delete (y/N): ");
		if (!sc.nextLine().equalsIgnoreCase("y")) return;

		try (Statement st = conn.createStatement()) {
			st.executeUpdate("DELETE FROM results WHERE student_id='" + esc(id) + "'");
			st.executeUpdate("DELETE FROM student WHERE Id='" + esc(id) + "'");
		}
	}

	// --- Add Result ---
	static void addResult() throws SQLException {
		System.out.print("Student ID: ");
		String sid = sc.nextLine();
		if (!existsStudent(sid)) { System.out.println("Student must exist"); return; }
		if (existsResult(sid)) { System.out.println("Result already exists"); return; }

		System.out.print("Marks1: "); Integer m1 = parseMark(sc.nextLine());
		System.out.print("Marks2: "); Integer m2 = parseMark(sc.nextLine());
		System.out.print("Marks3: "); Integer m3 = parseMark(sc.nextLine());
		if (m1 == null || m2 == null || m3 == null) {
			System.out.println("Invalid marks"); return;
		}

		int total = m1 + m2 + m3;
		double perc = total / 3.0;
		String grade = gradeFor(perc);

		String sql = "INSERT INTO results(student_id, marks1, marks2, marks3, total, percentage, grade) VALUES('" +
				esc(sid) + "', " + m1 + ", " + m2 + ", " + m3 + ", " + total + ", " + perc + ", '" + esc(grade) + "')";
		try (Statement st = conn.createStatement()) { st.executeUpdate(sql); }
	}

	// --- View Results ---
	static void viewResults() throws SQLException {
		String sql = "SELECT student_id, marks1, marks2, marks3, total, percentage, grade, created_at FROM results";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
			boolean any = false;
			System.out.printf("%-10s %-4s %-4s %-4s %-6s %-10s %-5s %-20s%n",
					"ID", "M1", "M2", "M3", "Total", "Percent", "Grade", "Created At");
			while (rs.next()) {
				any = true;
				System.out.printf("%-10s %-4d %-4d %-4d %-6d %-10.2f %-5s %-20s%n",
						rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
						rs.getInt(5), rs.getDouble(6), rs.getString(7), rs.getString(8));
			}
			if (!any) System.out.println("No results found");
		}
	}

	// --- Update Result ---
	static void updateResult() throws SQLException {
		System.out.print("Student ID: ");
		String sid = sc.nextLine();
		if (!existsResult(sid)) { System.out.println("Not found"); return; }

		int cur1 = 0, cur2 = 0, cur3 = 0;
		String q = "SELECT marks1, marks2, marks3 FROM results WHERE student_id='" + esc(sid) + "'";
		try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(q)) {
			if (rs.next()) { cur1 = rs.getInt(1); cur2 = rs.getInt(2); cur3 = rs.getInt(3); }
		}

		System.out.print("Marks1 (" + cur1 + "): ");
		String t = sc.nextLine();
		Integer m1 = t.isEmpty() ? cur1 : parseMark(t);
		if (m1 == null) return;

		System.out.print("Marks2 (" + cur2 + "): ");
		t = sc.nextLine();
		Integer m2 = t.isEmpty() ? cur2 : parseMark(t);
		if (m2 == null) return;

		System.out.print("Marks3 (" + cur3 + "): ");
		t = sc.nextLine();
		Integer m3 = t.isEmpty() ? cur3 : parseMark(t);
		if (m3 == null) return;

		int total = m1 + m2 + m3;
		double perc = total / 3.0;
		String grade = gradeFor(perc);

		String sql = "UPDATE results SET marks1=" + m1 + ", marks2=" + m2 + ", marks3=" + m3 +
				", total=" + total + ", percentage=" + perc + ", grade='" +
				esc(grade) + "' WHERE student_id='" + esc(sid) + "'";
		try (Statement st = conn.createStatement()) { st.executeUpdate(sql); }
	}

	static void deleteResult() throws SQLException {
		System.out.print("Student ID: ");
		String sid = sc.nextLine();
		if (!existsResult(sid)) { System.out.println("Not found"); return; }

		System.out.print("Confirm delete (y/N): ");
		if (!sc.nextLine().equalsIgnoreCase("y")) return;

		String sql = "DELETE FROM results WHERE student_id='" + esc(sid) + "'";
		try (Statement st = conn.createStatement()) { st.executeUpdate(sql); }
	}
}
