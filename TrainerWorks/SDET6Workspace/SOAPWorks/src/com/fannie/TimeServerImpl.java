package com.fannie;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.fannie.TimeServer")
public class TimeServerImpl  implements TimeServer{

	@Override
	public String getTimeAsString() {
		return  "Today's date is :" +new Date().toString();
	}

	@Override
	public String getServerName(String name) {
		return "Server FannieMae Says Hi to "+ name;
	}

	@Override
	public String getCompanyName() {
		return "Company Name FanniMae";
	}

	@Override
	public String checkCreditScore(String custName, int creditScore) {
		if(creditScore < 400){
			return "Sorry Loan cannot be sanctioned Mr/Ms/Mrs " + creditScore;
		}else if(creditScore >=400 && creditScore<600){
			return "We are working on your profile, Mr/Ms/Mrs " + creditScore;
		}else {
			return "Loan Approved Mr / Ms/ Mrs " + custName;
		}
	}

}
