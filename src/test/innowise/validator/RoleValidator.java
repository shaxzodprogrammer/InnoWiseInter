package test.innowise.validator;

import test.innowise.enums.Roles;
import test.innowise.validator.Validator;

import java.util.HashMap;
import java.util.Map;

public class RoleValidator implements Validator<String> {

    @Override
    public boolean isValid(String role) {
        HashMap<String, Integer> roles = Roles.getRole();
        for (Map.Entry<String, Integer> entry : roles.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAcceptableRole(String role, int level) {
        for (Map.Entry<String, Integer> entry : Roles.getRole().entrySet()) {
            if (entry.getValue() == level && entry.getKey().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }
}
