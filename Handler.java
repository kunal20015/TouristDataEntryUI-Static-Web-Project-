package com.Servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class Handler extends HttpServlet{
	
	 @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
		    //Identification
	        String fullname = request.getParameter("fullname");
	        String dob = request.getParameter("dob");
	        String age = request.getParameter("age");
	        String gender = request.getParameter("gender");
	        String nationality = request.getParameter("nationality");
	        String passport = request.getParameter("passport");
		 
		 
	        //Contact
	        String mobile = request.getParameter("mobile");
	        String email = request.getParameter("email");
	        String paddress = request.getParameter("paddress");
	        String laddress = request.getParameter("laddress");
	        
	        
	        //Accommodation
	        String hotel = request.getParameter("hotel");
	        String room = request.getParameter("room");
	        String checkin = request.getParameter("checkin");
	        String checkout = request.getParameter("checkout");
	        String booking = request.getParameter("booking");
	        
	        
	        //Travel
	        String arrival = request.getParameter("arrival");
	        String departure = request.getParameter("departure");
	        String visa = request.getParameter("visa");
	        String origin = request.getParameter("origin");
	        String purpose = request.getParameter("purpose");
	        
	        
	        //Print to Console
	        System.out.println("===== Tourist Form Data =====");

	        System.out.println("Full Name: " + fullname);
	        System.out.println("Date of Birth: " + dob);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	        System.out.println("Nationality: " + nationality);
	        System.out.println("Passport / ID Number: " + passport);

	        System.out.println("Mobile Number: " + mobile);
	        System.out.println("Email: " + email);
	        System.out.println("Permanent Address: " + paddress);
	        System.out.println("Local Stay Address: " + laddress);

	        System.out.println("Hotel Name: " + hotel);
	        System.out.println("Room Number: " + room);
	        System.out.println("Check-in Time: " + checkin);
	        System.out.println("Check-out Time: " + checkout);
	        System.out.println("Booking Reference: " + booking);

	        System.out.println("Arrival Date: " + arrival);
	        System.out.println("Departure Date: " + departure);
	        System.out.println("Visa Type / Status: " + visa);
	        System.out.println("Country of Origin: " + origin);
	        System.out.println("Purpose of Visit: " + purpose);
	        
	}
}
