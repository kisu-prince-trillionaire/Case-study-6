package com.dphone.referral.dao;

import java.util.ArrayList;
import java.util.List;

import com.dphone.referral.bean.Referral;

public class ReferralDao {
	public void viewReferral() {
		List<Referral> list = new ArrayList<Referral>();
		Referral referral1 = new Referral("vishal@gmail","Vishal Kumar",245456,23,"vish@123");
		Referral referral2 = new Referral("vishal@gmail","Vishal Kumar",245456,23,"vish@123");
		Referral referral3 = new Referral("vishal@gmail","Vishal Kumar",245456,23,"vish@123");
		Referral referral4 = new Referral("vishal@gmail","Vishal Kumar",245456,23,"vish@123");
		Referral referral5 = new Referral("vishal@gmail","Vishal Kumar",245456,23,"vish@123");
		
		list.add(referral1);
		list.add(referral2);
		list.add(referral3);
		list.add(referral4);
		list.add(referral5);
	}
}
