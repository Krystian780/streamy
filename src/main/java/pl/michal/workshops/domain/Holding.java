package pl.michal.workshops.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Data
@Builder
public class Holding implements Comparable<Holding> {
    private final String name;
    private final List<Company> companies;

    public List<String> getAllCompanyNames(){
        List<List<String>> companyNames = new ArrayList<>();
        companyNames.add(companies.stream().map(Company::getName).collect(Collectors.toList()));
        return companyNames.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    @Override
    public int compareTo(Holding o) {
        return 0;
    }

    public Stream<User> getUsers(){
        return companies.stream()
                .map(Company::getUsers)
                .flatMap(List::stream);
    }

}
