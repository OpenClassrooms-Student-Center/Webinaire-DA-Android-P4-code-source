package com.kirabium.gegemail.model;

import java.util.Date;

public class Mail {
    String subject, text, recipient;
    Date mDate;

    public Mail(String subject, String text, String recipient) {
        this.subject = subject;
        this.text = text;
        this.recipient = recipient;
        this.mDate = new Date();
    }

    public Mail(String subject, String text, String recipient, Date date) {
        this.subject = subject;
        this.text = text;
        this.recipient = recipient;
        mDate = date;
    }

}
