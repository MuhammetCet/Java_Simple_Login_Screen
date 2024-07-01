module com.example.javasimpleloginscreen {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens com.example.javasimpleloginscreen to javafx.fxml;
    exports com.example.javasimpleloginscreen;
}