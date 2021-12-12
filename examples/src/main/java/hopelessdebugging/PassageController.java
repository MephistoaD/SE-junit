package hopelessdebugging;

import hopelessdebugging.scanner.Scanner;
import hopelessdebugging.validator.Validator;

public class PassageController {
    public Scanner scanner;
    public Validator validator;

    PassageController(Scanner scanner, Validator validator){
        this.scanner = scanner;
        this.validator = validator;
    }

    public void run(){
        while (scanner.hasNext()){
            controllOneAccessAttemt();
        }
    }

    public void controllOneAccessAttemt(){
        String covidCertificate = scanner.scan();
        if (!validator.validate(covidCertificate)){
            scanner.allowPassage();
        } else {
            scanner.denyPassage();
        }
    }

}
