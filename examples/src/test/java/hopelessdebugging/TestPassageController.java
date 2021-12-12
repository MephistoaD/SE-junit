package hopelessdebugging;

import hopelessdebugging.scanner.Scanner;
import hopelessdebugging.validator.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassageController {
    
    @Test
    @DisplayName("get a valid certificate and allow passage")
    void test_valid_certificate(){
        // ARRANGE
        boolean passage = true;
        
        Scanner scanner = (Scanner) new StubScanner("X54oecbuefb");
        Validator validator = (Validator) new StubValidator(passage);
        PassageController passageController = new PassageController(scanner, validator);
        
        // ACT
        passageController.controllOneAccessAttemt();
        
        // ASSERT
        assertEquals(((StubScanner) scanner).allowPassage , passage);
        assertEquals(((StubScanner) scanner).denyPassage, !passage);
    }

    @Test
    @DisplayName("get an invalid certificate and allow passage")
    void testInvalidCertificate(){
        // ARRANGE
        boolean passage = false;
        
        Scanner scanner = (Scanner) new StubScanner("X54oecbuefb");
        Validator validator = (Validator) new StubValidator(passage);
        PassageController passageController = new PassageController(scanner, validator);
        
        // ACT
        passageController.controllOneAccessAttemt();
        
        // ASSERT
        assertEquals(((StubScanner) scanner).allowPassage , passage);
        assertEquals(((StubScanner) scanner).denyPassage, !passage);
    }
}
