package com.okar.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okar.springmvc.model.Book;

@Controller
public class SendJsonController {
	@RequestMapping(params = "/getJson")
	@ResponseBody
	public Book sendBookDetail() {
		Book book = new Book();
		book.setId(2121);
		book.setName("Okar's code");
		book.setAuthor("Okar");
		return book;
	}

}
