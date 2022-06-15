package moi;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.time.LocalDate;
import java.util.ArrayList;

import javafx.beans.binding.*;
import javafx.stage.Stage;

public class FenReaffecterEmplacement extends Stage {
	// les composants du formulaire
		private GridPane			racine			= new GridPane();
		private HBox				zoneBoutons		= new HBox();
		private Label 				lblContrat	= new Label("N° de contrat (*) :");
		private Label 				lblNum			= new Label("N° du client (*) : ");
		private Label 				lblNom		= new Label("Nom du client : ");
		private Label 				lblCategorie	= new Label("Catégorie :");
		private Label 				lblEmplacement		= new Label("Emplacements disponibles : ");
	
		private TextField			txtContrat	= new TextField();
		private TextField			txtNum			= new TextField();
		private TextField			txtNom		= new TextField();
		private ComboBox<String>	cbEmplacement		= new ComboBox<String>();
		private TextField			txtCategorie		= new TextField();
		private Button 				bnOK 			= new Button("OK");
		private Button 				bnAnnuler 		= new Button("Annuler");
		
		// constructeur : initialisation de la fenetre et des données
		public FenReaffecterEmplacement(){		
			this.setTitle("Réaffecter un emplacement");
			this.sizeToScene();
			this.setResizable(false);
			this.setScene(new Scene(creerContenu()));	
		}
		
		private Parent creerContenu() {
			txtContrat.setDisable(true);
			txtNum.setDisable(true);
			txtNom.setDisable(true);
			txtCategorie.setDisable(true);
			BooleanBinding rien= Bindings.equal(-1, cbEmplacement.getSelectionModel().selectedIndexProperty());
			
			
				
			bnOK.disableProperty().bind(Bindings.when(rien).then(true).otherwise(false));		
			bnOK.setPrefWidth(100);
			
			bnOK.setOnAction(e-> {
				
			});
			
			
			/*bnOK.setOnAction(e -> {
				int sup;
				if (cbSuperieur.getSelectionModel().getSelectedIndex()==0 || cbSuperieur.getSelectionModel().getSelectedIndex()==-1) {
					sup = -1;
				} else {
					sup = Integer.parseInt(cbSuperieur.getSelectionModel().getSelectedItem());
				}
				float sal;
				if (txtSalaire.getText().isEmpty()) {
					sal = -1;
				} else {
					sal = Float.parseFloat(txtSalaire.getText());
				} 
				float prim;
				if (txtPrime.getText().isEmpty()) {
					prim = -1;
				} else {
					prim = Float.parseFloat(txtPrime.getText());
				} 
				
				String date = dpEmbauche.getValue().getYear()+"/"+dpEmbauche.getValue().getMonthValue()+"/"+dpEmbauche.getValue().getDayOfMonth();
				
				Employe emp = new Employe(
					Integer.parseInt(txtMatricule.getText()),
					txtNom.getText(),
					txtPoste.getText(),
					sup,
					date,
					sal,
					prim,
					Integer.parseInt(cbDept.getSelectionModel().getSelectedItem())
				);	
				Principale.modifierEmploye(emp);
				this.close();
			});
			*/
			bnAnnuler.setPrefWidth(100);
			bnAnnuler.setOnAction(e -> {
				this.close();
			});

			zoneBoutons.getChildren().addAll(bnOK, bnAnnuler);
			zoneBoutons.setSpacing(10);
			racine.addRow(0,  lblContrat, txtContrat);
			racine.addRow(1,  lblNum, txtNum);
			racine.addRow(2,  lblNom, txtNom);
			racine.addRow(3,  lblCategorie, txtCategorie);
			racine.addRow(4,  lblEmplacement, cbEmplacement);
			
			racine.add(zoneBoutons, 1, 6);
			racine.setHgap(10);
			racine.setVgap(15);
			racine.setPadding(new Insets(10));
			return racine;
		}
		
		/*public void init(ArrayList<Integer> lesSup, ArrayList<Integer> lesDep, int mat, String nom, String poste, int sup, String emb, float sal, float prime, int dep) {
			txtMatricule.setText(""+mat);
			txtNom.setText(nom);
			txtPoste.setText(poste);
			if (!emb.equals("")) {
				String dateemb[] = emb.split("/");
				int annee = Integer.parseInt(dateemb[0]);
				int mois = Integer.parseInt(dateemb[1]);
				int jour = Integer.parseInt(dateemb[2]);
				dpEmbauche.setValue(LocalDate.of(annee, mois, jour));
			}
			txtSalaire.clear();
			if (sal!=-1) txtSalaire.setText(""+sal);
			txtPrime.clear();
			if (prime!=-1) txtPrime.setText(""+prime);
			this.cbSuperieur.getItems().clear();
			for (int i=0; i<lesSup.size() ; i++) {
				this.cbSuperieur.getItems().add(""+lesSup.get(i));
			}
			this.cbSuperieur.getItems().add(0, "- aucun -");
			this.cbSuperieur.setValue(cbSuperieur.getItems().get(0));
			
			this.cbDept.getItems().clear();
			for (int i=0; i<lesDep.size() ; i++) {
				this.cbDept.getItems().add(""+lesDep.get(i));
			}
			this.cbDept.setValue(cbDept.getItems().get(0));
		}*/
	
}
