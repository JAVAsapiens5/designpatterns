package adapter;

import java.util.ArrayList;

public class MailNotifierProgram {

    public static void main(String[] args) {

        Notifier notifier = new MailNotifierAdapter();
        notifier.notify(new ArrayList<>(), "wiadomość");
    }
}
