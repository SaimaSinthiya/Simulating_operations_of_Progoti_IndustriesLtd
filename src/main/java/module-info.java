module com.example.simulating_operations_of_progoti_industries_ltd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_progoti_industries_ltd to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1 to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1 to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2 to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan.User3;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan.User3 to javafx.fxml;
    exports com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan.User4;
    opens com.example.simulating_operations_of_progoti_industries_ltd.SakibAlHasan.User4 to javafx.fxml;
}