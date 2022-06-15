import javafx.application.Application;
import javafx.stage.Stage;

public class Classe extends Application {
	public void start(Stage primaryStage){
		primaryStage = new FenListeEmp ();
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch();
	}
}