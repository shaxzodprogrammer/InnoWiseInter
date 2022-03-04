package test.innowise.enums;

import java.util.HashMap;

public enum Roles {
    USER(1),
    CUSTOMER(1),
    ADMIN(2),
    PROVIDER(2),
    SUPER_ADMIN(3);

    private final int roleLevel;

    Roles(int roleLevel){
        this.roleLevel = roleLevel;
    }

    public static HashMap<String, Integer> getRole() {
        HashMap<String, Integer> role = new HashMap<>();
        Roles[] roleArray = Roles.values();
        for (Roles roles : roleArray) {
            role.put(roles.toString(), roles.roleLevel);
        }
        return role;
    }

    public static void  printRole(){
        Roles[] roleArray = Roles.values();
        for (Roles role: roleArray) {
            System.out.println(role.toString() + ", access level " + role.roleLevel);
        }
    }
}
