package kata5p2.view;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mailList) {
        Histogram<String> result = new Histogram<>();
        mailList.forEach(mail -> result.increment(mail.getDomain()));
        return result;
    }
}
