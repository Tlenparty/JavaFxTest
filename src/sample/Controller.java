package sample;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Controller {

    @FXML
    private TextField numberInputField; // Говорим java fx  о том что мы хотим использовать этот обьект
    //Поле так же называется как и в scene. Тут пользуемся трудами scene

    @FXML
    private Label randomNumberLabel;

    @FXML
    private Label randomNumberLabel1;

    @FXML
    private TextField numberInputField1;


    // Метод который будет вызываться сразу при запуске fxml
    @FXML
    public void initialize() {

    }

    @FXML
    void doRandomAction() {

        Random random = new Random();
        String message = numberInputField.getText();   // То что получим из нашего поля ввода
        numberInputField.clear(); // Очистка

        if (!message.isEmpty()) {

            //Обработка его для integer
            try {
                int number = Integer.parseInt(message); //Alt + T
                int randomNumber = random.nextInt(number + 1);
                randomNumberLabel.setText(String.valueOf(randomNumber));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                var alert = new Alert(Alert.AlertType.ERROR, "Введите число!");
                alert.setTitle("Ошибка ввода данных");
                alert.show();

            }


        }

    }

    @FXML
    void doGuess() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String guess = numberInputField1.getText();
        numberInputField1.clear();
        int counter = 0;
            try {
                randomNumberLabel1.setText(String.valueOf(Integer.parseInt(guess)));
                counter++;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                var alert = new Alert(Alert.AlertType.ERROR, "Введите число от 0 до 3");
                alert.setTitle("Ошибка ввода данных");
                alert.show();
            }
            if (randomNumber == Integer.valueOf(guess)) {
                randomNumberLabel1.setText("Победа");

            } else {
                counter++;
                numberInputField1.clear();
                randomNumberLabel1.setText("Неверное числоо" + " попытка № " + counter);
            }



    }
}


