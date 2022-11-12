package pl.michal.workshops.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
@Builder
public class Company {
    private final String name;
    private final List<User> users;


}
