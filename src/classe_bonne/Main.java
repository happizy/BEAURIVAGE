package moi;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	static private FenReaffecterEmplacement fDetailEmp = new FenReaffecterEmplacement();
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage = new FenListeEmp();
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch();
	}
	static public void ouvrirReaffecterEmplacement(Emplacement e) {
		fDetailEmp.init(e.getContrat().getNumContrat(),e.getNumCli(),e.getNomCli(),e.getCategorie());
		fDetailEmp.show();
	}
}
