package com.revature.util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TextMessaging {
	
      static final String twilioNumber = "18132130583";
      public static final String ACCOUNT_SID = "";
      public static final String AUTH_TOKEN = "";
      
    public void sendMessage(String smsMessage, String phoneNumber) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("1"+phoneNumber),
            new PhoneNumber(twilioNumber),
            smsMessage).create();

        System.out.println(message.getSid());
    }
}
