package test.innowise.repository;

import test.innowise.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Map<Integer, User> sUsers = new HashMap<>();

    public void setUsers(Map<Integer, User> users) {
        UserRepository.sUsers = users;
    }

    public Map<Integer, User> getUsers() {
        return sUsers;
    }

    public void addUser(User user) {
        int firstFreePosition = sUsers.size();
        sUsers.put(firstFreePosition, user);
    }

    public void setUser(Integer position, User user) {
        sUsers.replace(position, user);
    }

    public void removeUser(Integer position) {
        if (position < sUsers.size() - 1) {
            for (int i = position; i < sUsers.size() - 1; i++) {
                sUsers.replace(position, sUsers.get(position + 1));
            }
        }
        sUsers.remove(sUsers.size() - 1);
    }

    public void saveRepository(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(sUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadRepository(String filepath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))) {
            setUsers((Map<Integer, User>) ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
