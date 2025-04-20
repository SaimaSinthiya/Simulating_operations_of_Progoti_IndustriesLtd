package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;



import java.io.Serializable;
import com.example.simulating_operations_of_progoti_industries_ltd.AbstractClass.User;

public class ManagingDirector extends User implements Serializable {
    private String strategicPlan;
    private int yearsOfExperience;

    public ManagingDirector(int id, String name, String password, String phoneNo, String email,
                            String userType, String gender, String dob, String strategicPlan, int yearsOfExperience) {
        super(id, name, password, phoneNo, email, userType, gender, dob);
        this.strategicPlan = strategicPlan;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getStrategicPlan() {
        return strategicPlan;
    }

    public void setStrategicPlan(String strategicPlan) {
        this.strategicPlan = strategicPlan;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public ManagingDirector verifyLogin(int id, String pw) {
        if (this.getId() == id && this.getPassword().equals(pw)) {
            this.setStatus("Active");
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return "ManagingDirector{" + super.toString() +
                ", strategicPlan='" + strategicPlan + '\'' +
                ", yearsOfExperience=" + yearsOfExperience + '}';
    }
}

