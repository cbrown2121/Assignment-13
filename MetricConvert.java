import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MetricConvert extends Application{
    
    public static void main(String[] args) {
        launch(args);

 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);

        // Ferinheight > Celcius
        Label ferinheightLabel = new Label("Ferinheight > Celcius");
        grid.add(ferinheightLabel, 0, 0);
        TextField ferinheightText = new TextField();
        grid.add(ferinheightText,1,0);
        Button celciusButton = new Button("Convert");
        grid.add(celciusButton, 2,0);
        Label ferinheightResult = new Label();
        grid.add(ferinheightResult, 3,0);
        

        Label feetLabel = new Label("Feet > Meters");
        grid.add(feetLabel, 0, 1);
        TextField feetText = new TextField();
        grid.add(feetText,1,1);
        Button metersButton = new Button("Convert");
        grid.add(metersButton,2,1);
        Label feetResult = new Label();
        grid.add(feetResult, 3,1);

        Label poundLabel = new Label("Pounds > Kilograms");
        grid.add(poundLabel, 0, 2);
        TextField poundText = new TextField();
        grid.add(poundText,1,2);
        Button kiloButton = new Button("Convert");
        grid.add(kiloButton,2,2);
        Label poundResult = new Label();
        grid.add(poundResult,3,2);

        Label MPHLabel = new Label("MPH > KPH");
        grid.add(MPHLabel, 0, 3);
        TextField MPHText = new TextField();
        grid.add(MPHText,1,3);
        Button KPHButton = new Button("Convert");
        grid.add(KPHButton, 2,3);
        Label MPHResult = new Label();
        grid.add(MPHResult,3,3);

        // Determine what each button does
        celciusButton.setOnAction(e -> {
            try {
                double Ferinheight = Double.parseDouble(ferinheightText.getText());
                double Celsius = (Ferinheight - 32) * 5 / 9;
                ferinheightResult.setText(String.format("%.2f Fahrenheit is %.2f Celsius", Ferinheight, Celsius));
                } catch (NumberFormatException ex) {
                    ferinheightResult.setText("Please enter a valid number");
            }
        });

        metersButton.setOnAction(e -> {
            try {
                double Feet = Double.parseDouble(feetText.getText());
                double Meters = (Feet * 0.305);
                feetResult.setText(String.format("%.2f Feet is %.2f Meters", Feet, Meters));
            } catch (NumberFormatException ex) {
                feetResult.setText("Please eneter a valid number");
            }
        });

        kiloButton.setOnAction(e -> {
            try {
                double Pounds = Double.parseDouble(poundText.getText());
                double Kilograms = (Pounds * 0.454);
                poundResult.setText(String.format("%.2f Pounds is %.2f Kilograms" , Pounds, Kilograms));
            } catch (NumberFormatException ex) {
                poundResult.setText("Please enter a valid number");
            }
        });

        KPHButton.setOnAction(e -> {
            try{
                double MPH = Double.parseDouble(MPHText.getText());
                double KPH = (MPH * 1.609);
                MPHResult.setText(String.format("%.2f MPH is %.2f KPH", MPH, KPH));
            } catch (NumberFormatException ex) {
                poundResult.setText("Please enter a valid number");
            }
        });
        primaryStage.show();
    }
}