package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection con;

	// สร้างเมธอดชื่อเดียวกับคลาส (constructor)
	public MemberDAO() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver"); // โหลด JDBC Driver
		con = DriverManager.getConnection("jdbc:mysql://localhost/cryptocurrencymarket?characterEncoding=utf-8", "root",
				""); // เชื่อมต่อกับฐานข้อมูล
	}

	// สร้างเมธอดสำหรับปิดการเชื่อมต่อฐานข้อมูล
	public void closeConnection() throws SQLException {
		con.close();
	}

	// สร้างเมธอดสำหรับดึงข้อมูลจาก ResultSet มาเก็บใน JavaBeans
	private Member mappingMember(ResultSet resultSet) throws SQLException {
		Member member = new Member(resultSet.getString("email"), resultSet.getString("password"),
				resultSet.getString("username"), resultSet.getString("phone"),resultSet.getString("permiss"));
		return member; // ส่งกลับเป็น javabean
	}

	// สร้างเมธอดที่ทำงานกับฐานข้อมูล

	public ArrayList<Member> getAllMember() throws SQLException {
		ArrayList<Member> memberList = new ArrayList<Member>(); // ประกาศอาร์เรย์เปล่าสำหรับเก็บ javabeans

		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member"); // เตรียมคำสั่ง SQL
		ResultSet resultSet = pStatement.executeQuery(); // ส่งคำสั่ง SQL ไปยังฐานข้อมูล
		// วนลูปอ่านผลลัพธ์ทีละแถว
		while (resultSet.next()) {
			Member member = mappingMember(resultSet); // แปลงข้อมูลเป็น javabean
			memberList.add(member); // เก็บ javabean ในอาร์เรย์
		}
		return memberList; // ส่งกลับเป็นอาร์เรย์ของ javabean
	}

	public void createMember(Member member) throws SQLException {
		PreparedStatement pStatement = con
				.prepareStatement("INSERT INTO member (email, password, username, phone, permiss) VALUES (?, ?, ?, ?, ?)");
		pStatement.setString(1, member.getEmail());
		pStatement.setString(2, member.getPassword());
		pStatement.setString(3, member.getUsername());
		pStatement.setString(4, member.getPhone());
		pStatement.setString(5, "user");
		pStatement.executeUpdate();
	}

	public void updateMember(Member member) throws SQLException {
		PreparedStatement pStatement = con
				.prepareStatement("UPDATE member SET password = ?, username = ?, phone = ? WHERE email = ?");
		pStatement.setString(1, member.getPassword());
		pStatement.setString(2, member.getUsername());
		pStatement.setString(3, member.getPhone());
		pStatement.setString(4, member.getEmail());
		pStatement.executeUpdate();
	}

	public Member getMember(String email, String password) throws SQLException {		
		Member member = null;
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member WHERE email = ? AND password = ?"); // เตรียมคำสั่ง SQL
		pStatement.setString(1, email);	
		pStatement.setString(2, password);	
		ResultSet resultSet = pStatement.executeQuery(); // ส่งคำสั่ง SQL ไปยังฐานข้อมูล		
		if (resultSet.next()) // ถ้าพบข้อมูล
			member = mappingMember(resultSet); // นำผลลัพธ์ที่ฐานข้อมูลส่งกลับแปลงเป็น object
		return member; 	// ส่งกลับเป็น javabean
	}

	public Member getAdmin(String permiss) throws SQLException {		
		Member member = null;
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member WHERE permiss = ?"); // เตรียมคำสั่ง SQL
		pStatement.setString(1, permiss);		
		ResultSet resultSet = pStatement.executeQuery(); // ส่งคำสั่ง SQL ไปยังฐานข้อมูล		
		if (resultSet.next()) // ถ้าพบข้อมูล
			member = mappingMember(resultSet); // นำผลลัพธ์ที่ฐานข้อมูลส่งกลับแปลงเป็น object
		return member; 	// ส่งกลับเป็น javabean
	}

	public Member getMemberForEidit(String email) throws SQLException {		
		Member member = null;
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member WHERE email = ? "); // เตรียมคำสั่ง SQL
		pStatement.setString(1, email);	
		ResultSet resultSet = pStatement.executeQuery(); // ส่งคำสั่ง SQL ไปยังฐานข้อมูล		
		if (resultSet.next()) // ถ้าพบข้อมูล
			member = mappingMember(resultSet); // นำผลลัพธ์ที่ฐานข้อมูลส่งกลับแปลงเป็น object
		return member; 	// ส่งกลับเป็น javabean
	}

	public void deleteMember (String email) throws SQLException {	 
        PreparedStatement pStatement = con.prepareStatement("DELETE FROM member WHERE email = ?");
        pStatement.setString(1, email);
        pStatement.executeUpdate();
	}


	public static void main(String[] args) {
		try {
			// ก่อนใช้เมธอดต่างๆใน DAO ต้องสร้าง object ก่อน
			// ในที่นี้จะเรียกเมธอด ProductDAO() ซึ่งมีการโหลด JDBC Driver
			// และเชื่อมต่อฐานข้อมูล
			MemberDAO memberDAO = new MemberDAO();

			// เพิ่มข้อมูล
			ArrayList<Member> list = memberDAO.getAllMember();
       		 for (Member member : list) {
				if (member.getEmail().equals("porinut1@gmail.com") && member.getPassword().equals("1234")) {
					System.out.println("found");
					System.out.println(member.getEmail());
				}else{
					System.out.println("not found");
				}
			}
			// แก้ไขข้อมูล
			// Product oldProduct = new Product(1, "Update Centrum", "สูตรใหม่", 400);
			// productDAO.updateProduct(oldProduct);

			// ปิดการเชื่อมต่อ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}