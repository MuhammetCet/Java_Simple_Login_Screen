package com.example.javasimpleloginscreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;

public class Controller {
    @FXML
    private Label cikti;

    @FXML
    private JFXButton giris;

    @FXML
    private TextField kullanici;

    @FXML
    private PasswordField sifre;

    @FXML
    void girisYap(ActionEvent event) {
if (kullanici.getText().equals("root") && sifre.getText().equals("admin123")){
    cikti.setText("Giriş Başarılı");
}else {
    cikti.setText("Kullanıcı Adı veya Şifre Yanlış");
}
    }

}