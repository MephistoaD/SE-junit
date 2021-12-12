package hopelessdebugging.validator;

public class DummyValidator implements Validator {
    @Override
    public boolean validate(String certificateCode) {
        return certificateCode.charAt(0) == 'v';
    }
}
