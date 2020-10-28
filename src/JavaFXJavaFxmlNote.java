public class JavaFXJavaFxmlNote {
    /*

    JavaFx
    
•	A Library with a set of interoperable API written in Java for the purpose of creating UI application.
•	Developed using Java and XML
•	Creates consistent UI look for our applications in all operating systems
•	Uses CSS for styling
•	Has two components – Stage and Scene
•	Stage
        	Top level container defines a space for the App
        	Every Application had at least one stage is called Primary stage and it’s created by runtime
        	Is a container for scene
        	Is a mediator between application and the platform on which it is running
        	Hosts one scene at a time

	Scene

        	A Platform on which it is running
        	Attached to stage/ hosted by a stage


•	IDE
        	Eclipse
        	NetBeans
        	Intelli J

•	Life cycle of JavaFx runtime
        	Main(String… args)
        	Application.init()
        	Application.start()
        	Stage.show()
        	Application.stop()
        	Creates consistent UI look for our applications in all operating



FXML

•	An XML based markup language for defining the user interface of a JavaFx application.
•	Components
        	FXML Source – is XML file with declaration of UI
        	FXML Loader class – is Utility class for loading an FXML file
        	Controller
                	Is a class responsible for behaviors
                	Instantiated by FXML Loader
                	Contains UI elements references
                	Maximum one controller per FXML
                	Event handlers for UI elements
                	Can have initialize method
                	Default constructor must be public

     */
}
