package main;

import notification.EmailNotifier;
import notification.Notifier;
import notification.SMSNotifierDecorator;
import notification.SlackNotifierDecorator;

public class Main {
    public static void main(String[] args) {
       
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello, Email!");

       
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello, SMS and Email!");

       
        Notifier slackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        slackNotifier.send("Hello, Slack, SMS, and Email!");
    }
}
