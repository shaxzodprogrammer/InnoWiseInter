package test.innowise.validator;

public class EmailValidation implements Validator<String> {

    @Override
    public boolean isValid(String value) {
        return false;
    }
}
