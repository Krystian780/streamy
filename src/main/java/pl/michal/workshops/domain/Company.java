package pl.michal.workshops.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Company {
    private final String name;
    private final List<User> users;

    public String getName(){
        return name;
    }

}
