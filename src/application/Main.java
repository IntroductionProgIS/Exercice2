package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	/*For classic Layout
    	 * 
    	 *   Controller c = new Controller();
    	 * 
    	 *   primaryStage.setTitle("File selector");
    	 *   primaryStage.setScene(new Scene(c, 216, 404));
    	 *   primaryStage.show();
    	 */
    		
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("File selector");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
        
        // TODO: 1 - Create the scene using either Scene Builder or Classic Layout 
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
