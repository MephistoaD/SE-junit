package crazytest;

import crazytest.scanner.Scanner;
import crazytest.validator.Validator;

public class PassageController {
    public Scanner scanner;
    public Validator validator;

    PassageController(Scanner scanner, Validator validator){
        this.scanner = scanner;
        this.validator = validator;
    }

    public void run(){
        while (true){
            controllOneAccessAttemt();
        }
    }

    public void controllOneAccessAttemt(){
        String covidCertificate = scanner.scan();
        if (validator.validate(covidCertificate)){
            scanner.allowPassage();
        } else {
            scanner.denyPassage();
        }
    }

}
