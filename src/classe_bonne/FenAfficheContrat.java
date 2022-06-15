import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenAfficheContrat extends Stage{

	private VBox				racine			= new VBox();
	private GridPane			zoneDetail		= new GridPane();
	private AnchorPane  		zoneTable		= new AnchorPane();
	private HBox zonebasse = new HBox();
	private HBox zonefiltrehaut = new HBox();
	private HBox zonefiltrebas = new HBox();
	private VBox filtrebox = new VBox();
	private VBox nminbox = new VBox();
	private VBox nmaxbox = new VBox();
	private VBox dminbox = new VBox();
	private VBox dmaxbox = new VBox();
	private VBox ncontbox = new VBox();
	private VBox nclibox = new VBox();
	private VBox nomclibox = new VBox();
	private VBox numclibox = new VBox();
	private VBox datebox = new VBox();
	private VBox numbox = new VBox();
	private VBox persbox = new VBox();
	private VBox cautionbox = new VBox();
	private VBox soldebox = new VBox();
	private VBox				zoneFiltre			= new VBox();
	ComboBox<String> tri = new ComboBox<String>();
	ComboBox<String> filtre = new ComboBox<String>();
	Label blank	= new Label();
	Label nminlabel = new Label("n°min");
	Label nmaxlabel = new Label("n°max");
	Label dminlabel = new Label("Date début:");
	Label dmaxlabel = new Label("Date fin:");
	Label lblno	= new Label("n°XXX");
	Label lblcont = new Label("état du contrat :");
	Label lbldate = new Label("période d'occupation :");
	Label lblcli = new Label("n° de client :");
	Label lblnomcli = new Label("nom du client :");
	Label lblcat = new Label("n° d'emplacement :");
	Label lblpers = new Label("nombre personne suplémentaire");
	Label lblcaution = new Label("état caution :");
	Label lblsolde = new Label("solde restant :");
	TextField nmin = new TextField();
	TextField nmax = new TextField();
	TextField dmin = new TextField();
	TextField dmax = new TextField();
	
	TextField numcont = new TextField();
	TextField numcli = new TextField();
	TextField nomcli = new TextField();
	TextField date = new TextField();
	TextField cat = new TextField();
	TextField pers = new TextField();
	TextField caution = new TextField();
	TextField solde = new TextField();
	TableView<Contrat> 	tableContrat = new TableView<Contrat>();
	
	public FenAfficheContrat() {
		TableColumn<Contrat,Integer> colonne1 = new TableColumn<Contrat,Integer>("N°Emplacement");
		colonne1.setCellValueFactory(new PropertyValueFactory<Contrat,Integer>("numero"));
		tableContrat.getColumns().add(colonne1);
		TableColumn<Contrat,String> colonne2 = new TableColumn<Contrat,String>("Type d'emplacement");
		colonne2.setCellValueFactory(new PropertyValueFactory<Contrat,String>("categorie"));
		tableContrat.getColumns().add(colonne2);
		TableColumn<Contrat,Integer> colonne3 = new TableColumn<Contrat,Integer>("N°Contrat");
		colonne3.setCellValueFactory(new PropertyValueFactory<Contrat,Integer>("contrat"));
		tableContrat.getColumns().add(colonne3);
		TableColumn<Contrat,Integer> colonne4 = new TableColumn<Contrat,Integer>("N°Emplacement");
		colonne4.setCellValueFactory(new PropertyValueFactory<Contrat,Integer>("numero"));
		tableContrat.getColumns().add(colonne4);
		TableColumn<Contrat,String> colonne5 = new TableColumn<Contrat,String>("Type d'emplacement");
		colonne5.setCellValueFactory(new PropertyValueFactory<Contrat,String>("categorie"));
		tableContrat.getColumns().add(colonne5);
		TableColumn<Contrat,Integer> colonne6 = new TableColumn<Contrat,Integer>("N°Contrat");
		colonne6.setCellValueFactory(new PropertyValueFactory<Contrat,Integer>("contrat"));
		tableContrat.getColumns().add(colonne6);
		
		setTitle("liste contrat");
		tri.getItems().addAll("n° contrat","état contrat","n° client","nom du client");
		tri.setPromptText("trier par");
		filtre.getItems().addAll("n°emplacement","n°client","date contrat", "categorie");
		filtre.setPromptText("filtrer par");
		tableContrat.setPrefWidth(500);
		zoneTable.getChildren().add(tableContrat);
		filtrebox.getChildren().addAll(blank,filtre);
		dminbox.getChildren().addAll(dminlabel,dmin);
		dmaxbox.getChildren().addAll(dmaxlabel,dmax);
		zonefiltrehaut.getChildren().addAll(filtrebox,nminbox,nmaxbox,dminbox,dmaxbox);
		zonefiltrebas.getChildren().add(tri);
		
		nclibox.getChildren().addAll(lblno);
		ncontbox.getChildren().addAll(lblcont,numcont);
		nomclibox.getChildren().addAll(lblnomcli,nomcli);
		numclibox.getChildren().addAll(lblcli,numcli);
		datebox.getChildren().addAll(lbldate,date);
		numbox.getChildren().addAll(lblcat,cat);
		persbox.getChildren().addAll(lblpers,pers);
		cautionbox.getChildren().addAll(lblcaution,caution);
		soldebox.getChildren().addAll(lblsolde,solde);
		
		zoneDetail.addRow(1,  nclibox);
		zoneDetail.addRow(2,  ncontbox);
		zoneDetail.addRow(3,  datebox);
		zoneDetail.addRow(4,  numclibox);
		zoneDetail.addRow(5,  nomclibox);
		zoneDetail.addRow(6,  numbox);
		zoneDetail.addRow(7,  persbox);
		zoneDetail.addRow(8,  cautionbox);
		zoneDetail.addRow(9,  soldebox);
		
		zoneDetail.setHgap(10);
		zoneDetail.setVgap(10);
		tableContrat.setMinHeight(500);
		zoneDetail.setPadding(new Insets(10));
		zoneFiltre.setPadding(new Insets(10,10,10,0));
		tri.setStyle("-fx-margin-left: 20px;");
		filtrebox.setPadding(new Insets(10,10,10,0));
		nminbox.setPadding(new Insets(10));
		nmaxbox.setPadding(new Insets(10));
		dminbox.setPadding(new Insets(10));
		dmaxbox.setPadding(new Insets(10));
		racine.setPadding(new Insets(10));
		zonebasse.getChildren().addAll(zoneTable,zoneDetail);
		zoneFiltre.getChildren().addAll(zonefiltrehaut,zonefiltrebas);
		racine.getChildren().addAll(zoneFiltre,zonebasse);
		
		
		
		Scene scene = new Scene(racine);		
		//scene.getStylesheets().add("stylesheet.css");
		this.setScene(scene);
		this.show();
	}
}
