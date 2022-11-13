package pl.michal.workshops.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class Company {
    private final String name;
    private final List<User> users;

    public long getUsers2(){
        return users.stream().count();
    }

    public String getName(){
        return name;
    }

}
