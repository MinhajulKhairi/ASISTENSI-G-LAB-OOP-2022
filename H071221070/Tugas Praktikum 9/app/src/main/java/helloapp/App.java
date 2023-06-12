package helloapp;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) {
        
        stage = mainStage;

        stage.setTitle("Kalkulator Konversi Mata Uang");
        stage.setScene(getScene1());
        stage.setResizable(false);
        stage.show();
    }

    // Scene 1
    private Scene getScene1() {
        ImageView ivBanner = new ImageView("/images/peaceminusone.jpg");
        ivBanner.setFitHeight(170);
        ivBanner.setFitWidth(170);
        ivBanner.setPreserveRatio(true);

        Text tTitle = new Text("Konversi Mata Uang");

        Button btnPilih = new Button("Mulai");
        btnPilih.setId("button-pilih");

        VBox sectionRight = new VBox(ivBanner, tTitle, btnPilih);
        sectionRight.setSpacing(30);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");

        btnPilih.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
            .add(getClass()
                .getResource("/styles/style.css")   
                    .toExternalForm());

        return scene;
    }

    // Scene 2
    private Scene getScene2() {
        Text tTitle = new Text("Konversi Mata Uang");
        Button btnUSD = new Button("Rp \uD83C\uDDEE\uD83C\uDDE9 \u2192 \uD83C\uDDFA\uD83C\uDDF8 $");
        btnUSD.getStyleClass().add("section-menu");
        Button btnJPY = new Button("Rp \uD83C\uDDEE\uD83C\uDDE9 \u2192 \uD83C\uDDEF\uD83C\uDDF5 \u00A5");
        btnJPY.getStyleClass().add("section-menu");
        Button btnKRW = new Button("Rp \uD83C\uDDEE\uD83C\uDDE9 \u2192 \uD83C\uDDF0\uD83C\uDDF7 \u20A9");
        btnKRW.getStyleClass().add("section-menu");
        Button btnEUR = new Button("Rp \uD83C\uDDEE\uD83C\uDDE9 \u2192 \uD83C\uDDEA\uD83C\uDDFA \u20AC");
        btnEUR.getStyleClass().add("section-menu");

        Text tDescription = new Text("(Data Provided by Webull, updated on 5/23/2023, 19:34)");
        tDescription.setId("info-description");
        tDescription.setUnderline(true);
        
        VBox sectionRight = new VBox(tTitle, btnUSD, btnEUR, btnJPY, btnKRW, tDescription);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");
        


        btnUSD.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        btnEUR.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        btnJPY.setOnAction(v -> {
            stage.setScene(getScene5());
        });

        btnKRW.setOnAction(v -> {
            stage.setScene(getScene6());
        });

        //rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
            .add(getClass()
                .getResource("/styles/style.css")
                    .toExternalForm());

        return scene;
    }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Scene getScene3() {
        Text tTitle = new Text("Rupiah - US Dollar");

        TextField tfRupiah = new TextField();
        tfRupiah.setId("input-money");
        Text tHasil = new Text("Hasil");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-konversi");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, tfRupiah, hasil, vButton);
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");
        sectionRight.setPadding(new Insets(15, 30, 5, 30));

        btnKonv.setOnAction(v -> {
            double rupiah = Double.parseDouble(tfRupiah.getText());
            double getKonversi = rupiah / 14880;
            
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
            String formattedResult = decimalFormat.format(getKonversi);
            lHasil.setText("$" + formattedResult);
        });
        
        btnClear.setOnAction(v -> {
            tfRupiah.clear();
            lHasil.setText("-");
        });

        btnBack.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
            .add(getClass()
                .getResource("/styles/style.css")
                    .toExternalForm());

        return scene;
    }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Scene getScene4() {
        Text tTitle = new Text("Rupiah - Europe EURO");

        TextField tfRupiah = new TextField();
        tfRupiah.setId("input-money");
        Text tHasil = new Text("Hasil");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-konversi");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, tfRupiah, hasil, vButton);
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");
        sectionRight.setPadding(new Insets(15, 30, 5, 30));

        btnKonv.setOnAction(v -> {
            double rupiah = Double.parseDouble(tfRupiah.getText());
            double getKonversi = rupiah / 16097;
            
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
            String formattedResult = decimalFormat.format(getKonversi);
            lHasil.setText("\u20AC " + formattedResult);
        });

        btnClear.setOnAction(v -> {
            tfRupiah.clear();
            lHasil.setText("-");
        });

        btnBack.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
            .add(getClass()
                .getResource("/styles/style.css")
                    .toExternalForm());

        return scene;
    }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

private Scene getScene5() {
    Text tTitle = new Text("Rupiah - Japanese Yen");

    TextField tfRupiah = new TextField();
        tfRupiah.setId("input-money");
        Text tHasil = new Text("Hasil");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-konversi");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, tfRupiah, hasil, vButton);
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");
        sectionRight.setPadding(new Insets(15, 30, 5, 30));


    btnKonv.setOnAction(v -> {
        double rupiah = Double.parseDouble(tfRupiah.getText());
        double getKonversi = rupiah / 107.791;
        
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        String formattedResult = decimalFormat.format(getKonversi);
        lHasil.setText("\u00A5 " + formattedResult);
    });

    btnClear.setOnAction(v -> {
        tfRupiah.clear();
        lHasil.setText("-");
    });

    btnBack.setOnAction(v -> {
        stage.setScene(getScene2());
    });

    //rootNode
    HBox rootNode = new HBox(sectionRight);

    Scene scene = new Scene(rootNode, 400, 700);

    // Style
    scene.getStylesheets()
        .add(getClass()
            .getResource("/styles/style.css")
                .toExternalForm());

    return scene;
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

private Scene getScene6() {
    Text tTitle = new Text("Rupiah - Korean Won");

    TextField tfRupiah = new TextField();
        tfRupiah.setId("input-money");
        Text tHasil = new Text("Hasil");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-konversi");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, tfRupiah, hasil, vButton);
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");
        sectionRight.setPadding(new Insets(15, 30, 5, 30));

    btnKonv.setOnAction(v -> {
        double rupiah = Double.parseDouble(tfRupiah.getText());
        double getKonversi = rupiah / 11.3134;
        
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        String formattedResult = decimalFormat.format(getKonversi);
        lHasil.setText("\u20A9 " + formattedResult);
    });

    btnClear.setOnAction(v -> {
        tfRupiah.clear();
        lHasil.setText("-");
    });

    btnBack.setOnAction(v -> {
        stage.setScene(getScene2());
    });

    //rootNode
    HBox rootNode = new HBox(sectionRight);

    Scene scene = new Scene(rootNode, 400, 700);

    // Style
    scene.getStylesheets()
        .add(getClass()
            .getResource("/styles/style.css")
                .toExternalForm());

    return scene;
}


    public static void main(String[] args) {
        launch();
    }
}