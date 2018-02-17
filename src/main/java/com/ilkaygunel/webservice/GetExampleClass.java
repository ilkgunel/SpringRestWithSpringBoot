package com.ilkaygunel.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ilkaygunel.pojo.Member;

@RestController
public class GetExampleClass {

	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public Member getMemberList(@RequestParam(value = "memberName", defaultValue = "ertan") String memberName) {
		Member returnedMember = null;
		List<Member> memberList = new ArrayList<>();
		Member member = new Member();
		member.setName("ertan");
		member.setSurname("şahin");
		member.setCity("Zonguldak");

		memberList.add(member);

		member = new Member();
		member.setName("serkan");
		member.setSurname("akbaba");
		member.setCity("Denizli");

		memberList.add(member);

		member = new Member();
		member.setName("ismail");
		member.setSurname("ceylan");
		member.setCity("giresun");

		memberList.add(member);

		for (Member m : memberList) {
			if (memberName.equals(m.getName()))
				returnedMember = m;
		}
		
		return returnedMember;
	}
}
