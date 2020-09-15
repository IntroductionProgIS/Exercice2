package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;

public class Controller extends VBox{

    private Button btnCancel;
    private Button btnOpen;
    private  ListView listViewFile;		// list to show files inside directory
    private ComboBox<String> comboxRep; // combo box of parent directories

    private FileSelector fs;						 // class the reads directories

    public Controller(){
        super();
         fs = new FileSelector();
         initialize();
    }

    public void initialize(){

    	
    	// controller intialization
    	btnOpen = new Button("Open");
    	btnCancel = new Button("Cancel");
    	comboxRep = new ComboBox<String>();
    	listViewFile = new ListView();
    	
    	// TODO: layout the UI controllers
    	
    	/* initial loading of lists for combo and list
    	 first get the path, update the combo, set the selected item, update the list */
        String path = System.getProperty("user.dir");
        
        
    	//Update the ComboBox
        majComboView(path);
        
    	//Update the ListView
    	majListView(path);
    	

        comboxRep.setOnAction(event ->  {
            // TODO: update the list view
        });


        btnOpen.setOnMouseClicked(event -> {
        	
        	File dir = new File(comboxRep.getValue()+listViewFile.getSelectionModel().getSelectedItem()) ;
        	
        	if(dir.isFile()){
        		//can do something with the file (open it?)
        		System.exit(0);

        	} else if(dir.isDirectory()){
        		
        		// TODO: update the combo view, consider getAbsolutePath() method of class File
        	
        	} else{
        		//can do something else
        	}
        });



        listViewFile.setOnMouseClicked(event -> {
        	btnOpen.setDisable(false);
        	
        	// TODO: if double click, fire event on btnOpen
  
        });



        //with a lambda expression
        btnCancel.setOnAction((event)-> {
        	System.exit(0);
        });
    }


    /* 
     * updates the data model (i.e., what is stored inside the list)
     * depending on the selected item in the combo
     */
    public void majListView(String path)
    {
    	if (comboxRep.getSelectionModel().getSelectedItem() != null )
    	{
	    	//Get the elements to display in the ListView
			ObservableList<String> itemsListView = FXCollections.observableArrayList(fs.getListFile(path));
			
			//Change the items of the ListView
			listViewFile.setItems(itemsListView);
			
			//Disable the "Open" button
	    	btnOpen.setDisable(true);
    	}	
    }

    /* 
     * updates the combo view based on the selected path
     */
    private void majComboView(String path){
    	//Get the directories to display in the ComboBox
		ObservableList<String> itemsComboRep =  FXCollections.observableArrayList(fs.getListRepParent(path));
		
		//Change the items of the ComboBox
		comboxRep.setItems(itemsComboRep);
		
		//Select an item for the initialization
		comboxRep.getSelectionModel().selectLast();
    }
}






