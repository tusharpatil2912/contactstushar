package com.slksoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.slksoft.entity.Contacts;


public interface ContactsDao {

	@Insert("INSERT into contacts(id,firstname,lastname,gender,email,phone,city,state,country,picture) VALUES(#{id},#{firstname},#{lastname},#{gender},#{email},#{phone},#{city},#{state},#{country},#{picture})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	public void addNewContact(Contacts contacts);
	
	@Select("select * from contacts")
	public List<Contacts> getAllContacts();
}
