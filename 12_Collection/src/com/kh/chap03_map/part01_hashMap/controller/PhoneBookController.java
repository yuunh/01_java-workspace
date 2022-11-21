package com.kh.chap03_map.part01_hashMap.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.chap03_map.part01_hashMap.model.vo.PhoneBook;

public class PhoneBookController {

	HashMap<String, String> hm = new HashMap<String, String>();
	
	public ArrayList<PhoneBook> searchPhoneBooks(String group) {
		ArrayList<PhoneBook> search = new ArrayList<PhoneBook>();
		for (PhoneBook ph : search) {
			if (ph.getGroup().contains(group)) {
				
			}
		}
		
		return search;
		
	}
}
