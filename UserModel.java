import java.util.ArrayList;
import java.util.List;

class UserModel {
 
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public User getUser(int index){
        if(index >= 0 && index < users.size()){
            return users.get(index);
        }
        return null;
    }
    
}