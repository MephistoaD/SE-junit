package crazytest;

import crazytest.scanner.*;
import crazytest.validator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPassageController {
    
    @Test
    @DisplayName("get a valid certificate and allow passage")
    void test_valid_certificate(){
        // ARRANGE
        boolean pass = true;
        
        Scanner scanner = new StubScanner("X54oecbuefb");
        Validator validator = new StubValidator(pass);
        PassageController passageController = new PassageController(scanner, validator);
        
        // ACT
        passageController.controllOneAccessAttemt();
        
        // ASSERT
        assertEquals(((StubScanner) scanner).allowPassage , pass); // confirm the allowPassage function has ben called
        assertEquals(((StubScanner) scanner).denyPassage, !pass); // confirm the denyPassage function has not been called
    }

    @Test
    @DisplayName("get an invalid certificate and allow passage")
    void testInvalidCertificate(){
        // ARRANGE
        boolean pass = false;
        
        Scanner scanner = new StubScanner("X54oecbuefb");
        Validator validator = new StubValidator(pass);
        PassageController passageController = new PassageController(scanner, validator);
        
        // ACT
        passageController.controllOneAccessAttemt();
        
        // ASSERT
        assertEquals(((StubScanner) scanner).allowPassage , pass);
        assertEquals(((StubScanner) scanner).denyPassage, !pass);
    }
}
