package entities;

import lombok.*;

import javax.swing.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    public String username;
    public String  userEmail ;
    public String userCurrentAddress;
    public String userPermanentAddress;
}
