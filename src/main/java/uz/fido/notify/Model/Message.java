package uz.fido.notify.Model;

public class Message {

    private String title;
    private String alertContent;

    public Message() {
    }

    public Message(String title, String alertContent) {
        this.title = title;
        this.alertContent = alertContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlertContent() {
        return alertContent;
    }

    public void setAlertContent(String alertContent) {
        this.alertContent = alertContent;
    }
}
