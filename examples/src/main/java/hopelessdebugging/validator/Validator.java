package hopelessdebugging.validator;

public interface Validator {
    public static Validator create() {
        return new DummyValidator();
    }

    public boolean validate(String certificateCode);
}