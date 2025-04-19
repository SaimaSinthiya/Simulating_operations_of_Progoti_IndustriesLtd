package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Goal1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BusinessOverviewSceneController {
    @FXML private Label companyOverviewLabel;
    @FXML private Label marketAnalysisLabel;
    @FXML private Label financialOverviewLabel;

    private BusinessOverview businessOverview;

    public void setBusinessOverview(BusinessOverview businessOverview) {
        this.businessOverview = businessOverview;
        companyOverviewLabel.setText(businessOverview.getCompanyOverview());
        marketAnalysisLabel.setText(businessOverview.getMarketAnalysis());
        financialOverviewLabel.setText(businessOverview.getFinancialOverview());
    }
}