package com.dphone.referral.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dphone.referral.bean.Referral;

@Controller
public class ReferralController {
	
	@RequestMapping("/welcomeReferral")
	public String welcomeReferral() {
		System.out.println("Adding referral");
		return "addReferal";
	}

	@RequestMapping("/addReferral")
	public String register(@RequestParam("email") String email, @RequestParam("name") String name,
			@RequestParam("mobileNo") int mobileNo, @RequestParam("age") int age,
			@RequestParam("refferalCode") String refferalCode, Model model) {
		System.out.println("In the add referral page");
		Referral referral = new Referral();
		referral.setEmailId(email);
		referral.setName(name);
		referral.setMobileNo(mobileNo);
		referral.setAge(age);
		referral.setRefferalCode(refferalCode);

		System.out.println(referral);
		
		//List<Referral> list = new ArrayList<Referral>();

		if (age < 18) {
			String msg = name + " is not qualied as a referral";
			model.addAttribute("referral", referral);
			model.addAttribute("errorMessage", msg);
			return "error";
		} else {
			String msg = name + " is qualified as a referral";
			model.addAttribute("email1", referral.getEmailId());
			model.addAttribute("name1", referral.getName());
			model.addAttribute("mobile1", referral.getMobileNo());
			model.addAttribute("age1", referral.getAge());
			model.addAttribute("code1", referral.getRefferalCode());
			model.addAttribute("message", msg);
			return "sucess1";
		}

	}
}
