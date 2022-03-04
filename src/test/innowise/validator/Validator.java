package test.innowise.validator;

public interface Validator<T> {
    boolean isValid(T value);
}
