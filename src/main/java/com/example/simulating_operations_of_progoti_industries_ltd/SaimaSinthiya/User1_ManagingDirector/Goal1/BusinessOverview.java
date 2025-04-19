package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Goal1;

import java.io.Serializable;



public class BusinessOverview implements Serializable {
        private String companyOverview;
        private String marketAnalysis;
        private String financialOverview;

        public BusinessOverview(String companyOverview, String marketAnalysis, String financialOverview) {
            this.companyOverview = companyOverview;
            this.marketAnalysis = marketAnalysis;
            this.financialOverview = financialOverview;
        }

        // Getters and Setters
        public String getCompanyOverview() {
            return companyOverview;
        }

        public void setCompanyOverview(String companyOverview) {
            this.companyOverview = companyOverview;
        }

        public String getMarketAnalysis() {
            return marketAnalysis;
        }

        public void setMarketAnalysis(String marketAnalysis) {
            this.marketAnalysis = marketAnalysis;
        }

        public String getFinancialOverview() {
            return financialOverview;
        }

        public void setFinancialOverview(String financialOverview) {
            this.financialOverview = financialOverview;
        }
    }


