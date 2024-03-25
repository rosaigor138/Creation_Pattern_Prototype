package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportTest {

    @Test
    public void shouldReturnClonedObject() throws CloneNotSupportedException {
        Report report = new Report(
                new BodyReport("Original Report"),
                "Original Head", "Original Footer");
        Report cloneReport = report.clone();
        cloneReport.setHead("Cloned Head").setFooter("Cloned Footer");
        cloneReport.getBody().setDetailedInformation("Cloned Body");
        assertEquals(
                "Report{body=BodyReport{detailedInformation='Original Report'}" +
                        ", head='Original Head'," +
                        " footer='Original Footer'}"
                ,report.toString());
        assertEquals("Report{body=BodyReport{detailedInformation='Cloned Body'}" +
                ", head='Cloned Head'" +
                ", footer='Cloned Footer'}",cloneReport.toString());
    }
}