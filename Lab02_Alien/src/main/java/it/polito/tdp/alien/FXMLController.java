package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtOutput; 

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtOutput.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String input = txtInput.getText();
    	txtInput.clear();
    	txtOutput.clear();
    	if (input.replace(" ","").matches("^[a-zA-Z]*$")) {
    		input = input.toLowerCase();
	    	if (input.contains(" ")) {
	    		String[] array = input.split(" ");
	    		String alienWord = array[0];
	    		String translation = array[1];
	    		dizionario.addWord(alienWord, translation);
	    		txtOutput.setText("aggiunta la parola: "+alienWord+" con traduzione: "+translation);
	    	}else {
	    		String output = dizionario.translateWord(input);
	    		if (output!=null)
	    			txtOutput.setText("la traduzione di: "+input+" è: "+output);
	    		else
	    			txtOutput.setText("la parola: "+input+" non è presente nel dizionario");
	    	}
    	}else {
    		txtOutput.setText("il testo deve contenere solo lettere da a-z e da A-Z");
    		return;
    	}

    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
