package hopelessdebugging;

import hopelessdebugging.scanner.Scanner;
import hopelessdebugging.validator.Validator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = Scanner.create();
        Validator validator = Validator.create();

        PassageController p = new PassageController(scanner, validator);
        p.run();
    }
}
