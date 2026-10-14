# JavaFX Random

A small JavaFX window (FXML + controller) with two mini-features:

- **Random!** generates a random number from 0 up to the entered value;
  on non-numeric input it shows an error dialog.
- **Guess** is a number-guessing game: the computer picks a number from 0 to 2,
  and the user enters a guess and sees the result.

## Run

Requires JDK 11+ and the JavaFX SDK. The easiest way is to open the project in IntelliJ IDEA,
attach the JavaFX library and run `sample.Main`, or from the console:

```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -d out src/sample/*.java
cp src/sample/sample.fxml out/sample/
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -cp out sample.Main
```
