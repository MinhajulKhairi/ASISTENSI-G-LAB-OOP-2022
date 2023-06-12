package assignment9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showScene1();
        stage.show();
        primaryStage.setTitle("Kalkulator");
    }

    public void showScene1() {

        Image image = new Image("/IconKalkulatorIzzata.png");
        ImageView imageView = new ImageView(image);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Label nama = new Label("KALKULATOR IZZATA");
        nama.setFont(Font.font("Times New Roman", 18));
        nama.setTextFill(Color.BLACK);

        Button mulai = new Button("MULAI");
        mulai.setFont(Font.font("Times New Roman", 15));
        mulai.setTextFill(Color.BLACK);

        VBox vbox = new VBox(root, nama, mulai);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(7);

        mulai.setOnAction(e -> showScene2());
        Scene scene1 = new Scene(vbox, 350, 450);
        stage.setScene(scene1);
    }

    public void showScene2() {
        Label pilihMenu = new Label("PILIH KALKULATOR");
        pilihMenu.setFont(Font.font("Times New Roman", 18));
        pilihMenu.setTextFill(Color.BLACK);

        Button kalkulator1 = new Button("Konversi Suhu");
        kalkulator1.setFont(Font.font("Times New Roman", 15));
        kalkulator1.setTextFill(Color.BLACK);

        Button kalkulator2 = new Button("Operasi Balok");
        kalkulator2.setFont(Font.font("Times New Roman", 15));
        kalkulator2.setTextFill(Color.BLACK);

        VBox vbox = new VBox(pilihMenu, kalkulator1, kalkulator2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        kalkulator1.setOnAction(e -> konversiSuhu());
        kalkulator2.setOnAction(e -> operasiBalok());
        Scene scene2 = new Scene(vbox, 350, 450);
        stage.setScene(scene2);
    }

    // Kalkulator 1
    public void konversiSuhu() {
        Label konversiSuhu = new Label("KONVERSI SUHU");
        konversiSuhu.setFont(Font.font("Times New Roman", 18));
        konversiSuhu.setTextFill(Color.BLACK);

        Label celciuss = new Label("Celcius :");
        TextField input1 = new TextField();
        Label fahrenheitt = new Label("Fahrenheit :");
        TextField input2 = new TextField();
        Label kelvinn = new Label("Kelvin :");
        TextField input3 = new TextField();
        Label output = new Label();

        Button calculate = new Button("Calculate");
        calculate.setFont(Font.font("Times New Roman", 12));
        calculate.setTextFill(Color.BLACK);
        calculate.setOnAction(action -> {
            try {
                if (!input1.getText().isEmpty()) {
                    double celcius = Double.parseDouble(input1.getText());
                    double fahrenheit = celcius * 9 / 5 + 32;
                    input2.setText(String.format("%.2f", fahrenheit));
                    double kelvin = celcius + 273.15;
                    input3.setText(String.format("%.2f", kelvin));

                } else if (!input2.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(input2.getText());
                    double celcius = (fahrenheit - 32) * 5 / 9;
                    input1.setText(String.format("%.2f", celcius));
                    double kelvin = (fahrenheit + 459.67) * 5 / 9;
                    input3.setText(String.format("%.2f", kelvin));

                } else if (!input3.getText().isEmpty()) {
                    double kelvin = Double.parseDouble(input3.getText());
                    double celcius = kelvin - 273.15;
                    input1.setText(String.format("%.2f", celcius));
                    double fahrenheit = kelvin * 9 / 5 - 459.67;
                    input2.setText(String.format("%.2f", fahrenheit));
                }
            } catch (NumberFormatException e) {
                output.setText("Masukan angka");
            }
        });

        Button clear = new Button("Clear");
        clear.setFont(Font.font("Times New Roman", 12));
        clear.setTextFill(Color.BLACK);
        clear.setOnAction(e -> konversiSuhu());

        Button backtoHome = new Button("Back to Home");
        backtoHome.setFont(Font.font("Times New Roman", 12));
        backtoHome.setTextFill(Color.BLACK);
        backtoHome.setOnAction(e -> showScene2());

        HBox hbox = new HBox(clear, calculate);
        VBox vBox = new VBox(celciuss, input1, fahrenheitt, input2, kelvinn, input3, output);
        VBox vbox = new VBox(konversiSuhu, vBox, hbox, backtoHome);
        hbox.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        vbox.setSpacing(10);
        Scene scene3 = new Scene(vbox, 350, 450);
        stage.setScene(scene3);
    }

    // Kalkulator 2
    public void operasiBalok() {
        Label operasiBalok = new Label("OPERASI BALOK");
        operasiBalok.setFont(Font.font("Times New Roman", 18));
        operasiBalok.setTextFill(Color.BLACK);

        Label panjang = new Label("Masukkan panjang :");
        TextField input1 = new TextField();
        Label lebar = new Label("Masukkan lebar :");
        TextField input2 = new TextField();
        Label tinggi = new Label("Masukkan tinggi :");
        TextField input3 = new TextField();
        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.setFont(Font.font("Times New Roman", 12));
        keliling.setTextFill(Color.BLACK);
        keliling.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double angka3 = Double.parseDouble(input3.getText());
                double hasil = 4 * (angka1 + angka2 + angka3);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Inputan Hanya Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.setFont(Font.font("Times New Roman", 12));
        luas.setTextFill(Color.BLACK);
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double angka3 = Double.parseDouble(input3.getText());
                double hasil = 2 * (angka1 * angka2 + angka1 * angka3 + angka2 * angka3);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Inputan Hanya Angka");
            }
        });

        Button volume = new Button("Volume");
        volume.setFont(Font.font("Times New Roman", 12));
        volume.setTextFill(Color.BLACK);
        volume.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double angka3 = Double.parseDouble(input3.getText());
                double hasil = angka1 * angka2 * angka3;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Inputan Hanya Angka");
            }
        });

        Button clear = new Button("Clear");
        clear.setFont(Font.font("Times New Roman", 13));
        clear.setTextFill(Color.BLACK);
        clear.setOnAction(e -> operasiBalok());

        Button backtoHome = new Button("Back to Home");
        backtoHome.setFont(Font.font("Times New Roman", 13));
        backtoHome.setTextFill(Color.BLACK);
        backtoHome.setOnAction(e -> showScene2());

        HBox hbox = new HBox(keliling, luas, volume);
        VBox vbox1 = new VBox(hbox);
        VBox vbox2 = new VBox(clear, backtoHome);
        VBox vbox4 = new VBox(operasiBalok);
        VBox vbox3 = new VBox(vbox4, panjang, input1, lebar, input2, tinggi, input3, output, vbox1, vbox2);
        hbox.setAlignment(Pos.CENTER);
        vbox1.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);
        vbox4.setAlignment(Pos.CENTER);

        
        hbox.setSpacing(10);
        vbox1.setSpacing(10);
        vbox3.setSpacing(10);
        Scene scene3 = new Scene(vbox3, 350, 450);
        stage.setScene(scene3);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}