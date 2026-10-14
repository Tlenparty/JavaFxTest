# JavaFX Random

Небольшое окно на JavaFX (FXML + контроллер) с двумя мини-функциями:

- **Random!** — генерирует случайное число от 0 до введённого значения;
  при нечисловом вводе показывает диалог с ошибкой.
- **Guess** — игра «угадай число»: компьютер загадывает число от 0 до 2,
  пользователь вводит вариант и видит результат.

## Запуск

Требуется JDK 11+ и JavaFX SDK. Проще всего открыть проект в IntelliJ IDEA,
подключить библиотеку JavaFX и запустить `sample.Main`, либо из консоли:

```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -d out src/sample/*.java
cp src/sample/sample.fxml out/sample/
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -cp out sample.Main
```
