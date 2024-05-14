package entities;

import static mock.MockData.*;

public class EntityManager {
    public static User generateUser() {
        return User.builder()
                .username(generateName())
                .userEmail(generateEmail())
                .userCurrentAddress(generateCurrentAddress())
                .userPermanentAddress(generatePermanentAddress())
                .build();
    }
}
