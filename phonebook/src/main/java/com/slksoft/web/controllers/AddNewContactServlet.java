package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-new-contact")
public class AddNewContactServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/contact-form.jsp").forward(req, resp);
	}
	
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String category= req.getParameter("category");
	String name= req.getParameter("name");
	String brand= req.getParameter("brand");
	String description= req.getParameter("description");
	String QuantityPerUnit= req.getParameter("quantity_per_unit");
	Double unit_price=Double.parseDouble(req.getParameter("unit_price"));
	String picture= req.getParameter("picture");
	Integer discount=Integer.parseInt(req.getParameter("discount"));
	
	ProductsService service=new ProductsService();
	Product product=new Product();
	
	product.setCategory(category);
	product.setName(name);
	product.setBrand(brand);
	product.setDescription(description);
	product.setQuantityPerUnit(QuantityPerUnit);
	product.setUnitPrice(unit_price);
	product.setPicture(picture);
	product.setDiscount(discount);
	
	service.addNewProduct(product);
	req.setAttribute("product", product);
	req.getRequestDispatcher("/WEB-INF/views/contact-form.jsp").forward(req, resp);
    
	}*/
}
