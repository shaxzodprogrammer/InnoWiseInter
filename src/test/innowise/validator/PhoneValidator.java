package test.innowise.validator;

public class PhoneValidator implements Validator<String>{
    @Override
    public boolean isValid(String phone) {
        return phone.replaceAll("\\s+", "").matches("375\\d{9,}");
    }
}
