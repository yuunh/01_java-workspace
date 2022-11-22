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
	

//public void addPhone(String key, String value) {
    
    
//   try {
//       prop.store(new FileOutputStream("PhoneBook.properties"), "==PhoneBook==");
//       OutputStream fr = new FileOutputStream("Phone.properties");
//       
//       if(key.equals(fr)) {
//          System.out.println("이미 있는 연락처입니다.");
//       } else {
//          prop.setProperty(key, value);
//          System.out.println(key +"의 연락처 생성 완료.");
//       }
//    } catch (FileNotFoundException e) {
//       e.printStackTrace();
//    } catch (IOException e) {
//       e.printStackTrace();
//    }      
    