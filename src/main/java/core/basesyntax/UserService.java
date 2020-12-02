package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        for (int i = 0; i < records.length; i++) {
            if (records[i].substring(0, records[i].indexOf(":")).equals(email)) {
                return Integer.parseInt(records[i].substring(records[i].indexOf(":") + 1));
            }
        }

        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
