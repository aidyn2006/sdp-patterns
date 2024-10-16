package org.example.chainResponsibilitySdp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    private String subject;
    private String sender;
    private String body;
    private boolean isSpam;
    private int priority;

    public Email(String subject, String sender, String body) {
        this.subject = subject;
        this.sender = sender;
        this.body = body;
        this.isSpam = false;
        this.priority = 0;
    }


}
