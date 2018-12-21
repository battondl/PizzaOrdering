package com.revature.util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TextMessaging {
	
      static final String twilioNumber = "18132130583";
      public static final String ACCOUNT_SID = "AC116f541c3bdb7020c20ed577481ffb54";
      public static final String AUTH_TOKEN = "e93663711400bda47a7498cf367830ac";
      
    public void sendMessage(String smsMessage, String phoneNumber) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("1"+phoneNumber),
            new PhoneNumber(twilioNumber),
            smsMessage).create();

        System.out.println(message.getSid());
    }
}