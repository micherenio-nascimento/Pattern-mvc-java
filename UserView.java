import java.util.List;

class UserView {

    void displayUserDetails(User user){
        System.out.println("User name: "+ user.getNome());
        System.out.println("User age: "+ user.getIdade());
    }

    void displayUserList(List<User> users){
        System.out.println("\nUser List: ");
        for(User user: users){
            System.out.println("- "+ user.getNome() + " ( Age " + user.getIdade() + ")");
        }
    }
    
}