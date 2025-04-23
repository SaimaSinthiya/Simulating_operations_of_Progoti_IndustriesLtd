package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;

public class RiskAssessment implements Serializable {
    private String riskId;
    private String description;
    private String riskLevel;
    private String mitigationPlan;

    public RiskAssessment(String riskId, String description, String riskLevel, String mitigationPlan) {
        this.riskId = riskId;
        this.description = description;
        this.riskLevel = riskLevel;
        this.mitigationPlan = mitigationPlan;
    }

    public String getRiskId() {
        return riskId;
    }

    public String getDescription() {
        return description;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getMitigationPlan() {
        return mitigationPlan;
    }

    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setMitigationPlan(String mitigationPlan) {
        this.mitigationPlan = mitigationPlan;
    }

    @Override
    public String toString() {
        return "RiskAssessment{" +
                "riskId='" + riskId + '\'' +
                ", description='" + description + '\'' +
                ", riskLevel='" + riskLevel + '\'' +
                ", mitigationPlan='" + mitigationPlan + '\'' +
                '}';
    }
}
