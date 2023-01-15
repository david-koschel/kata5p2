package kata5p2;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

import java.util.List;

public class Kata5P2 {

    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "email.txt";
        MailListReader mailListReader = new MailListReader();
        List<Mail> mailList = mailListReader.read(fileName);

        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);

        HistogramDisplay histoDisplay = new HistogramDisplay("Histograma de Dominios", histogram);
        histoDisplay.execute();
    }
}
