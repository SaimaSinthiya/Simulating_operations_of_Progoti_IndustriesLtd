package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;


import java.io.Serializable;

public class AuditReport implements Serializable {
    private String reportId;
    private String period;
    private String summary;

    public AuditReport(String reportId, String period, String summary) {
        this.reportId = reportId;
        this.period = period;
        this.summary = summary;
    }

    public String getReportId() { return reportId; }
    public String getPeriod() { return period; }
    public String getSummary() { return summary; }

    public void setReportId(String reportId) { this.reportId = reportId; }
    public void setPeriod(String period) { this.period = period; }
    public void setSummary(String summary) { this.summary = summary; }

    @Override
    public String toString() {
        return "AuditReport{" +
                "reportId='" + reportId + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}
