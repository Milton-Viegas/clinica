package com.margon.clinica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MargonApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MargonApplication.class.getResource("clinica.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
		stage.setTitle("Clínica Margon");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
