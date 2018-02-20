package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.*;

public class Main extends Application {

    //create logger
    private static  final Logger log = Logger.getLogger(Main.class.getName());
    //My formatter for output
//    static class MyFormatter extends Formatter {
//
//        @Override
//        public String format(LogRecord record) {
//            return record.getLevel() + ": " + record.getMessage();
//        }
//    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        log.info("Load sample.fxml");
        primaryStage.setScene(new Scene(root, 346, 532));
        log.info("Set with and height of the scene ");
        primaryStage.setResizable(false);
        log.info("Set Resizable of the window");
        primaryStage.setTitle("Boolean Calculator");
        log.info("Set title of the window");
        primaryStage.getIcons().add(new Image("image\\icon.png"));
        log.info("Load the icon of the window");
        primaryStage.show();
        log.info("Show the window");
    }


    public static void main(String[] args) throws Exception {
        //write log to file by FileHandler
//        Handler fileHandler = new FileHandler("C:\\Users\\Volodymyr\\IdeaProjects\\Lab2Fx\\src\\logger\\LogFileForBoolCalc.log");
//        fileHandler.setFormatter(new SimpleFormatter());
//        log.addHandler(fileHandler);
//        //disable log output to console
//        log.setUseParentHandlers(false);
        launch(args);
    }
}
