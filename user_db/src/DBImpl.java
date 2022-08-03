import java.util.ArrayList;
import java.util.List;

public class DBImpl implements DB {
    private List<User> users = new ArrayList<>();
    private int counter = 1;

    @Override
    public User addUser(User user) {
        user.setId(counter++);
        users.add(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        User user = findById(id);
        if(user==null){
            return;
        }
        users.remove(id);
    }

    @Override
    public User findById(int id) {
        for(User user : users){
            if(user.getId() == id ){
                return user;
            }
        }
       return null;
    }

    @Override
    public User updateUser(User usertoUpdate) {
        User user = findById(usertoUpdate.getId());
        if(user==null){
            return null;
        }
        user.setName(usertoUpdate.getName());
        user.setPassword(usertoUpdate.getPassword());
        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    public int getSize(){
        return users.size();
    }
}
