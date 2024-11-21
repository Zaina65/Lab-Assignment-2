package com.example.labassignment2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ApplicationForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Main Layout
        BorderPane mainLayout = new BorderPane();

        // Banner
        Label banner = new Label("DATA ENTRY FORM");
        banner.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold; -fx-padding: 10; -fx-alignment: center;");
        banner.setMaxWidth(Double.MAX_VALUE);
        mainLayout.setTop(banner);

        // Create GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // Name
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        // Father Name
        Label fatherLabel = new Label("Father Name:");
        TextField fatherField = new TextField();
        gridPane.add(fatherLabel, 0, 1);
        gridPane.add(fatherField, 1, 1);

        // CNIC
        Label cnicLabel = new Label("CNIC:");
        TextField cnicField = new TextField();
        gridPane.add(cnicLabel, 0, 2);
        gridPane.add(cnicField, 1, 2);

        // Date of Birth
        Label dobLabel = new Label("Date of Birth:");
        DatePicker datePicker = new DatePicker();
        gridPane.add(dobLabel, 0, 3);
        gridPane.add(datePicker, 1, 3);

        // Gender
        Label genderLabel = new Label("Gender:");
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleButton = new RadioButton("Male");
        maleButton.setToggleGroup(genderGroup);
        RadioButton femaleButton = new RadioButton("Female");
        femaleButton.setToggleGroup(genderGroup);
        gridPane.add(genderLabel, 0, 4);
        gridPane.add(maleButton, 1, 4);
        gridPane.add(femaleButton, 2, 4);

        // City
        Label cityLabel = new Label("City:");
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("Karachi", "Lahore", "Islamabad", "Peshawar");
        gridPane.add(cityLabel, 0, 5);
        gridPane.add(cityComboBox, 1, 5);

        // Buttons
        Button saveButton = new Button("Save");
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> primaryStage.close());
        gridPane.add(saveButton, 0, 6);
        gridPane.add(exitButton, 1, 6);

        // Right Section for Image Upload
        VBox rightSection = new VBox(10);
        rightSection.setAlignment(Pos.TOP_CENTER);
        rightSection.setPadding(new Insets(20)); // Add padding for better spacing

        Label imageLabel = new Label("Upload Image:");
        VBox.setMargin(imageLabel, new Insets(25, 0, 0, 0)); // Adjust margin to lower the position

        Button uploadButton = new Button("Browse");
        ImageView imageView = new ImageView();
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);

        uploadButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select an Image");
            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
            );
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                imageView.setImage(new Image(file.toURI().toString()));
            }
        });

        rightSection.getChildren().addAll(imageLabel, imageView, uploadButton);

        // Set GridPane and Image Upload to Layout
        mainLayout.setCenter(gridPane);
        mainLayout.setRight(rightSection);

        // Set the Scene
        Scene scene = new Scene(mainLayout, 600, 400);
        primaryStage.setTitle("Data Entry Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
