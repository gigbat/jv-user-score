package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            String[] split = records[i].split(":");
            if (split[0].equals(email)) {
                return Integer.parseInt(split[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
