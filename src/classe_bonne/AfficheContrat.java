
import javafx.application.Application;
import javafx.stage.Stage;

public class AfficheContrat extends Application {
	public void start(Stage primaryStage) throws Exception {
		primaryStage = new FenAfficheContrat();
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch();
}
}
