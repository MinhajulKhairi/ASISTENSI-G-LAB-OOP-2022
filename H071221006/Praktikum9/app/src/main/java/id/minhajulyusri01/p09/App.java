package id.minhajulyusri01.p09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) throws Exception {
        stage = mainStage;

        stage.setTitle("OOP 09");
        stage.setScene(getScene1());
        stage.setResizable(false);
        stage.show();
    }

    private Scene getScene1() {
        StackPane spLayout = new StackPane();
        Scene scene = new Scene(spLayout, 350, 400);
        scene.getStylesheets().add(getClass().getResource("/styles/home_style.css").toExternalForm());

        // Setting background
        ImageView ivBackground = new ImageView("/image/bgd1.png");
        ivBackground.setFitWidth(scene.getWidth());
        ivBackground.setFitHeight(scene.getHeight());
        spLayout.getChildren().add(ivBackground);

        // Text Title
        Text tLeft = new Text("KALKULATOR");
        tLeft.getStyleClass().add("title-text-left");
        Text tRight = new Text(" SEDERHANA");
        tRight.getStyleClass().add("title-text-right");
        TextFlow tfTitle = new TextFlow(tLeft, tRight);
        HBox hbox = new HBox(5, tLeft, tRight);
        hbox.setAlignment(Pos.CENTER);

        // Button Explore
        Region space = new Region();
        space.setPrefHeight(12);
        Button btnExplore = new Button("Mulai");
        btnExplore.getStyleClass().add("btn-explore");

        // VBOX layout
        VBox vLayout = new VBox(hbox, tfTitle, space, btnExplore);
        vLayout.setSpacing(8);
        spLayout.getChildren().add(vLayout);
        vLayout.setPadding(new Insets(45));
        vLayout.setAlignment(Pos.CENTER);

        // actions
        btnExplore.setOnAction(v -> {
            stage.setScene(getScene2());

        });

        stage.setScene(scene);
        stage.show();
        return scene;
    }

    // SCENE 2
    private Scene getScene2() {
        // BUTTON
        Button button1 = new Button("Celcius ke Kelvin");
        Button button2 = new Button("Celcius ke Fahrenheit");
        Button button3 = new Button("Celcius ke Reamur");
        Button button4 = new Button("Dollar ke Rupiah");

        button1.getStyleClass().addAll("button", "button1");
        button2.getStyleClass().addAll("button", "button2");
        button3.getStyleClass().addAll("button", "button3");
        button4.getStyleClass().addAll("button", "button4");

        button1.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        button2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        button3.setOnAction(v -> {
            stage.setScene(getScene5());
        });

        button4.setOnAction(v -> {
            stage.setScene(getScene6());
        });

        VBox sectionLeft = new VBox(button1, button2);
        sectionLeft.setSpacing(30);
        sectionLeft.setAlignment(Pos.CENTER);
        sectionLeft.setPrefWidth(200);
        sectionLeft.setId("section-right");

        VBox sectionRight = new VBox(button3, button4);
        sectionRight.setSpacing(30);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(200);
        sectionRight.setId("section-right");

        HBox rootNode = new HBox(sectionLeft, sectionRight);
        rootNode.setStyle("-fx-background-color: white");
        rootNode.setSpacing(20);
        rootNode.setAlignment(Pos.CENTER);

        Text newTitle = new Text("PILIH MENU");
        newTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 24px; -fx-font-family: League Spartan;");
        StackPane spTitle = new StackPane(newTitle);
        spTitle.setPrefHeight(70);
        spTitle.setStyle("-fx-background-color: #52b9d5;");

        VBox content = new VBox(spTitle, rootNode);
        content.setSpacing(80);
        content.setAlignment(Pos.TOP_CENTER);
        content.setStyle("-fx-background-color: white");

        Scene scene = new Scene(new StackPane(content), 350, 400);

        // atur css
        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    // SCENE 3
    private Scene getScene3() {
        // SCENE
        Text title = new Text("Konversi Celcius ke Kelvin");
        Label inputNilai = new Label("Input Nilai");
        TextField inputan = new TextField();
        Label label3 = new Label();

        // BUTTON
        Button button = new Button("Konversi");
        Button button2 = new Button("Back to Home");
        Button button3 = new Button("Clear");

        // SECTION RIGHT
        VBox sectionRight = new VBox(title, inputNilai, inputan, label3, button3, button, button2);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(320);
        sectionRight.setId("section-right");

        // BUTTON 1
        button.setOnAction(v -> {
            try {
                double celcius = Double.parseDouble(inputan.getText());
                double kelvin = celcius + 273.15;
                label3.setText("Hasil Konversi : " + kelvin);
            } catch (Exception e) {
                label3.setText("Input tidak valid");
            }

        });

        // BUTTON 2
        button2.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // BUTTON 3
        button3.setOnAction(v -> {
            inputan.clear();
        });

        // ROOT NODE
        VBox rootNode = new VBox(sectionRight);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getStyleClass().add("rootNode");

        Scene scene = new Scene(new StackPane(rootNode), 350, 400);

        // atur css
        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    // SCENE 4
    private Scene getScene4() {
        // SCENE
        Text title = new Text("Konversi Celcius ke Fahrenheit");
        Label inputNilai = new Label("Input Nilai");
        TextField inputan = new TextField();
        Label label5 = new Label();

        // BUTTON
        Button button = new Button("Konversi");
        Button button2 = new Button("Back to Home");
        Button button3 = new Button("Clear");

        // SECTION RIGHT
        VBox sectionRight = new VBox(title, inputNilai, inputan, label5, button3, button, button2);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(320);
        sectionRight.setId("section-right");

        // BUTTON 1
        button.setOnAction(v -> {
            try {
                double celcius = Double.parseDouble(inputan.getText());
                double fahrenheit = 9.0 / 5.0 * celcius + 32;
                label5.setText("Hasil Konversi : " + fahrenheit);
            } catch (Exception e) {
                label5.setText("Input tidak valid");
            }

        });

        // BUTTON 2
        button2.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // BUTTON 3
        button3.setOnAction(v -> {
            inputan.clear();
        });

        // ROOT NODE
        VBox rootNode = new VBox(sectionRight);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getStyleClass().add("rootNode");

        Scene scene = new Scene(new StackPane(rootNode), 350, 400);

        // atur css
        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    // SCENE 5
    private Scene getScene5() {
        // SCENE
        Text title = new Text("Konversi Celcius ke Reamur");
        Label inputNilai = new Label("Input Nilai");
        TextField inputan = new TextField();
        Label label6 = new Label();

        // BUTTON
        Button button = new Button("Konversi");
        Button button2 = new Button("Back to Home");
        Button button3 = new Button("Clear");

        // SECTION RIGHT
        VBox sectionRight = new VBox(title, inputNilai, inputan, label6, button3, button, button2);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(320);
        sectionRight.setId("section-right");

        // BUTTON 1
        button.setOnAction(v -> {
            try {
                double celcius = Double.parseDouble(inputan.getText());
                double reamur = 4.0 / 5.0 * celcius;
                label6.setText("Hasil Konversi : " + reamur);
            } catch (Exception e) {
                label6.setText("Input tidak valid");
            }
        });

        // BUTTON 2
        button2.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // BUTTON 3
        button3.setOnAction(v -> {
            inputan.clear();
        });

        // ROOT NODE
        VBox rootNode = new VBox(sectionRight);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getStyleClass().add("rootNode");

        Scene scene = new Scene(new StackPane(rootNode), 350, 400);

        // atur css
        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    // SCENE 6
    private Scene getScene6() {
        // SCENE
        Text title = new Text("Konversi Dollar ke Rupiah");
        Label inputNilai = new Label("Input Nilai Dollar");
        TextField inputan = new TextField();
        Label label8 = new Label();

        // BUTTON
        Button button = new Button("Konversi Dollar ke Rupiah");
        Button button2 = new Button("Back to Home");
        Button button3 = new Button("Clear");

        // SECTION RIGHT
        VBox sectionRight = new VBox(title, inputNilai, inputan, label8, button3, button, button2);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(320);
        sectionRight.setId("section-right");

        // BUTTON 1
        button.setOnAction(v -> {
            try {
                double dollar = Double.parseDouble(inputan.getText());
                double dolar = dollar * 14888;
                label8.setText("Hasil Konversi : Rp." + dolar);
            } catch (Exception e) {
                label8.setText("Input tidak valid");
            }

        });

        // BUTTON 2
        button2.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // BUTTON 3
        button3.setOnAction(v -> {
            inputan.clear();
        });

        // ROOT NODE
        VBox rootNode = new VBox(sectionRight);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getStyleClass().add("rootNode");

        Scene scene = new Scene(new StackPane(rootNode), 350, 400);

        // atur css
        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
