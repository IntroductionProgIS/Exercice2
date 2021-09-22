# Exercise 2

The aim of this exercise is to create a file selector containing:

  - **A Combo Box** to navigate through parent folders
  - **A List View** to select a file, or open a folder
  - **Two Buttons** to operate an action on a selected file and close the window

<p align="center"><img src="/img/fileSelector.png" width="300"></p>

1. Install SceneBuilder
   1. Go to this link to download the fitting SceneBuilder for Java11 installation for your OS : https://gluonhq.com/products/scene-builder/
   2. Execute the downloaded file and follow the instructions
   3. When the installation is finished, look for the SceneBuilder.exe or SceneBuilder.app location in your system
   4. Inside Eclipse : 
      1. Go to Window \> Preferences
      2. Select JavaFX tab
      3. Browse for the SceneBuilder Executable to the location of your .exe or .app file you found earlier
	

2. Import this project in Eclipse *To import this project in eclipse, you should open Eclipse and follow these steps:*
   1. *Go to File \> Import...*
   2. *Select Git \> Projects from Git*
   3. *Select Clone URI*
   4. *Fill the URI box with `https://github.com/IntroductionProgIS/Exercice2.git` (All the other parts should be automatically filled)*
   5. *Click on "Next", "Next" and "Finish"*

> *To see the tasks that you need to do in a project: Go to Eclipse and select Window \> Show View \> Tasks*

3. Setup the project properties to add the .jar from javafx to the project

4. Create a run configuration for this project, inside Run As \> Run Configurations, with Main.java as the main class. Inside Arguments for this configuration, add inside the VM arguments : "--add-modules=javafx.controls --add-modules=javafx.fxml"

5. Complete the project view by creating it inside SceneBuilder.
   * Create a file "sample.fxml" inside the application package, right click on it and select * Open in SceneBuilder *


