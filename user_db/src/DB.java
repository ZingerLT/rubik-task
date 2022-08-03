import java.util.List;

public interface DB {

    public  User addUser(User user);

    public void deleteUser(int id);

    public User findById(int id);

    public User updateUser(User user);

    public List<User> getAll();

    public int getSize();


}
