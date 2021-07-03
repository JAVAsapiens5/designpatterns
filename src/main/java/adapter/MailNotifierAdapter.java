package adapter;

import java.util.List;

public class MailNotifierAdapter implements Notifier {

    @Override
    public void notify(List<String> recipients, String message) {
        MailSender mailSender = new MailSender("System notification", message, recipients);
        mailSender.sendMessage();
    }
}
