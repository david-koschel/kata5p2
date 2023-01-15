package kata5p2;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderBD;

import java.util.List;

public class Kata5P2 {

    public static void main(String[] args) {
        MailListReaderBD mailListReader = new MailListReaderBD();
        List<Mail> mailList = mailListReader.read();

        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);

        HistogramDisplay histoDisplay = new HistogramDisplay("Histograma de Dominios", histogram);
        histoDisplay.execute();
    }
}
