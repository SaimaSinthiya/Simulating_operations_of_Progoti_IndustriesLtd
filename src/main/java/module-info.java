module com.example.simulating_operations_of_progoti_industries_ltd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_progoti_industries_ltd to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Profile;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Profile to javafx.fxml;
}