public class App {
    public static void main(String[] args) {
        
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.addUser("Alice", 28);
        controller.addUser("Bob", 34);

        controller.displayAllUsers();

        controller.displayUser(0);
    }
}