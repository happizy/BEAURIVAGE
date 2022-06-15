package sae;

import javafx.stage.Stage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FenListeEmp extends Stage{
	//data
	ObservableList<Emplacement> liste = FXCollections.observableArrayList();
	//items
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
	private VBox datebox = new VBox();
	private VBox catbox = new VBox();
	private VBox				zoneFiltre			= new VBox();
	ComboBox<String> tri = new ComboBox<String>();
	ComboBox<String> filtre = new ComboBox<String>();
	Label blank	= new Label();
	Label nminlabel = new Label("n°min");
	Label nmaxlabel = new Label("n°max");
	Label dminlabel = new Label("Date début:");
	Label dmaxlabel = new Label("Date fin:");
	Label lblno	= new Label();
	Label lblcont = new Label("n° de contrat :");
	Label lblcli = new Label("n° de client :");
	Label lblnomcli = new Label("nom du client :");
	Label lbldate = new Label("période d'occupation :");
	Label lblcat = new Label("catégorie :");
	TextField nmin = new TextField();
	TextField nmax = new TextField();
	TextField dmin = new TextField();
	TextField dmax = new TextField();
	
	TextField numcont = new TextField();
	TextField numcli = new TextField();
	TextField nomcli = new TextField();
	TextField date = new TextField();
	TextField cat = new TextField();
	
	Button bnReaffect = new Button("réaffecter");
	TableView<Emplacement> 	tableEmployes	= new TableView<Emplacement>();
	
    Categorie c = new Simple(40,6,150,"tente");
    Categorie c1 = new Standard(40,150,520);
	Client client = new Client ("Bob", "Robert", "20 rue des chemins");
	Client client1 = new Client ("micher", "kaleb", "20 rue des chemins");
	Contrat cont = new Contrat("05/07/2022", "15/07/2022", 80, 400,"courier", "pres jeu pour enfants" ,client);
	Contrat cont1 = new Contrat("09/07/2022", "10/07/2022", 80, 400,"courier", "pres jeu pour enfants" ,client1);
	Emplacement emp = new Emplacement(18, c ,cont);
	Emplacement emp1 = new Emplacement(6, c1 ,cont1);
	
	public FenListeEmp() {
		TableColumn<Emplacement,Integer> colonne1 = new TableColumn<Emplacement,Integer>("N°Emplacement");
		colonne1.setCellValueFactory(new PropertyValueFactory<Emplacement,Integer>("numero"));
		tableEmployes.getColumns().add(colonne1);
		TableColumn<Emplacement,String> colonne2 = new TableColumn<Emplacement,String>("Type d'emplacement");
		colonne2.setCellValueFactory(new PropertyValueFactory<Emplacement,String>("categorie"));
		tableEmployes.getColumns().add(colonne2);
		TableColumn<Emplacement,Integer> colonne3 = new TableColumn<Emplacement,Integer>("N°Contrat");
		colonne3.setCellValueFactory(new PropertyValueFactory<Emplacement,Integer>("contrat"));
		tableEmployes.getColumns().add(colonne3);
		
		tableEmployes.setOnMouseClicked(e -> {
			if (tableEmployes.getSelectionModel().getSelectedItem() != null) {
				lblno.setText("emplacement n°"+tableEmployes.getSelectionModel().getSelectedItem().getNumero());
				numcont.setText(""+tableEmployes.getSelectionModel().getSelectedItem().getContrat().toString());
				numcont.setEditable(false);
				numcli.setText(""+tableEmployes.getSelectionModel().getSelectedItem().getNumCli());
				numcli.setEditable(false);
				nomcli.setText(tableEmployes.getSelectionModel().getSelectedItem().getNomCli());
				nomcli.setEditable(false);
				date.setText(""+tableEmployes.getSelectionModel().getSelectedItem().getDateArrivee()+" - "+tableEmployes.getSelectionModel().getSelectedItem().getDateDepart());
				date.setEditable(false);
				cat.setText(""+tableEmployes.getSelectionModel().getSelectedItem().getCategorie());
				cat.setEditable(false);
			}
			
		
			
			
		});
		
		liste.add(emp);
		liste.add(emp1);
        tableEmployes.setItems(liste);
        
		tri.setOnAction(e -> {
			if (tri.getValue().equals("n°emplacement")) {
				ObservableList<Emplacement> nvliste = liste.sorted(Comparator.comparing(Emplacement::getNumero));
				tableEmployes.setItems(nvliste);
			}
			if (tri.getValue().equals("n°client")) {
				ObservableList<Emplacement> nvliste = liste.sorted(Comparator.comparing(Emplacement::getNumCli));
				tableEmployes.setItems(nvliste);
			}
			if (tri.getValue().equals("date début contrat")) {
				ObservableList<Emplacement> nvliste = liste.sorted(Comparator.comparing(Emplacement::getDateArrivee));
				tableEmployes.setItems(nvliste);
			}
			
			if (tri.getValue().equals("date fin contrat")) {
				ObservableList<Emplacement> nvliste = liste.sorted(Comparator.comparing(Emplacement::getDateDepart));
				tableEmployes.setItems(nvliste);
			}
			
			if (tri.getValue().equals("categorie")) {
				ObservableList<Emplacement> nvliste = liste.sorted(Comparator.comparing(Emplacement::getCat));
				tableEmployes.setItems(nvliste);
			}
		});
		
		
		
		
		
		
		setTitle("liste d'emplacements");
		tri.getItems().addAll("n°emplacement","n°client","date début contrat", "date fin contrat", "categorie");
		tri.setPromptText("trier par");
		filtre.getItems().addAll("n°emplacement","n°client","date contrat", "categorie");
		filtre.setPromptText("filtrer par");
		tableEmployes.setPrefWidth(450);
		zoneTable.getChildren().add(tableEmployes);
		filtrebox.getChildren().addAll(blank,filtre);
		nminbox.getChildren().addAll(nminlabel,nmin);
		nmaxbox.getChildren().addAll(nmaxlabel,nmax);
		dminbox.getChildren().addAll(dminlabel,dmin);
		dmaxbox.getChildren().addAll(dmaxlabel,dmax);
		zonefiltrehaut.getChildren().addAll(filtrebox,nminbox,nmaxbox,dminbox,dmaxbox);
		zonefiltrebas.getChildren().add(tri);
		ncontbox.getChildren().addAll(lblcont,numcont);
		nclibox.getChildren().addAll(lblcli,numcli);
		nomclibox.getChildren().addAll(lblnomcli,nomcli);
		datebox.getChildren().addAll(lbldate,date);
		catbox.getChildren().addAll(lblcat,cat);
		zoneDetail.addRow(0,  lblno, bnReaffect);
		zoneDetail.addRow(1,  ncontbox);
		zoneDetail.addRow(2,  nclibox);
		zoneDetail.addRow(3,  nomclibox);
		zoneDetail.addRow(4,  datebox);
		zoneDetail.addRow(5,  catbox);
		zoneDetail.setHgap(10);
		zoneDetail.setVgap(10);
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