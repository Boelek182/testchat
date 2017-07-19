package com.test.mychat;

import java.util.Random;

/**
 * Created by 15997034 on 18/07/2017.
 */

public class ChatMessage {

    public String body, sender, receiver, senderName;
    public String Date, Time;
    public String msgid;
    public boolean isMine; //Did I send the message

    public ChatMessage(String Sender, String Receiver, String messageString,
                       String ID, boolean isMINE){
        body = messageString;
        isMine = isMINE;
        sender = Sender;
        msgid = ID;
        receiver = Receiver;
        senderName = sender;
    }

    public void setMsgID() {
        msgid += "-" + String.format("%02d", new Random().nextInt(100));
    }
}
