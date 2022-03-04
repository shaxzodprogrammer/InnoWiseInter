package test.innowise.validator;

import test.innowise.repository.UserRepository;

public class UserNumberValidator implements Validator<Integer> {
    @Override
    public boolean isValid(Integer userNumber) {
        UserRepository userRepository = new UserRepository();
        int lastIndex = userRepository.getUsers().size() - 1;
        return (userNumber >= 0 && userNumber <= lastIndex);
    }
}
