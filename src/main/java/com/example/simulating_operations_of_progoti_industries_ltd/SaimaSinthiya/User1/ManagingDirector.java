package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;



public class ManagingDirector extends User {
    private String strategicPlan;
    private int yearsOfExperience;

    public ManagingDirector(int userID, String name, String emailID, String phoneNumber,
                            String designation, String password, String strategicPlan, int yearsOfExperience) {
        super(userID, name, emailID, phoneNumber, designation, password);
        this.strategicPlan = strategicPlan;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getStrategicPlan() { return strategicPlan; }
    public void setStrategicPlan(String strategicPlan) { this.strategicPlan = strategicPlan; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    @Override
    public String toString() {
        return "ManagingDirector{" +
                "strategicPlan='" + strategicPlan + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}



