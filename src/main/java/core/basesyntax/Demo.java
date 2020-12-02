package core.basesyntax;

public class Demo {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String[] records = new String[]{"testEmail@gmail.com:100",
                "user@yahoo.com:1",
                "second-user@gmail.com:20"};
        String email = "testEmail@gmail.com";

        System.out.println(userService.getUserScore(records, email));
    }
}
