class UserController {
 
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void addUser(String name, int age) {
        User user = new User(name, age);
        model.addUser(user);
        System.out.println("User added: " + name);
    }

    public void displayUser(int index) {
        User user = model.getUser(index);
        if (user != null) {
            view.displayUserDetails(user);
        } else {
            System.out.println("User not found at index " + index);
        }
    }

    public void displayAllUsers() {
        view.displayUserList(model.getUsers());
    }
    
}