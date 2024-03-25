package org.example;

public class Report implements Cloneable{
    private BodyReport body;
    private String head;
    private String footer;

    public Report(BodyReport body, String head, String footer){
        this.body = body;
        this.head = head;
        this.footer = footer;
    }


    public BodyReport getBody() {
        return body;
    }

    public Report setBody(BodyReport body) {
        this.body = body;
        return this;
    }

    public String getHead() {
        return head;
    }

    public Report setHead(String head) {
        this.head = head;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public Report setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    @Override
    public Report clone() throws CloneNotSupportedException {
        Report cloneReport = (Report) super.clone();
        cloneReport.body = (BodyReport) cloneReport.body.clone();

        return cloneReport;
    }

    @Override
    public String toString() {
        return "Report{" +
                "body=" + body +
                ", head='" + head + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
