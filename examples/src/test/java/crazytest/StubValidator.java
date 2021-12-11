package crazytest;

import crazytest.validator.Validator;

public class StubValidator implements Validator {
    public boolean valid;

    public StubValidator(boolean valid) {
        this.valid = valid;
    }

    
    public boolean validate(String certificateCode) {
        return this.valid;
    }

}