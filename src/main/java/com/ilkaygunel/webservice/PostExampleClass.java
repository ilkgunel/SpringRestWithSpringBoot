package com.ilkaygunel.webservice;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ilkaygunel.pojo.Member;

@RestController
public class PostExampleClass {
	@RequestMapping(value = "/saveOneMember", method = RequestMethod.POST)
	public ResponseEntity<Member> saveOneMember(@RequestBody Member member) {
		System.out.println(member);
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveBulkMember", method = RequestMethod.POST)
	public ResponseEntity<List<Member>> saveBulkMember(@RequestBody List<Member> memberList) {
		for (Member m : memberList) {
			System.out.println(m);
		}

		return new ResponseEntity<List<Member>>(memberList, HttpStatus.OK);
	}
}
