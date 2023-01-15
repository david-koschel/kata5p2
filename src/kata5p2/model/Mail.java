package kata5p2.model;

public class Mail {

    String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomain() {
        return mail.split("@")[1];
    }
}
