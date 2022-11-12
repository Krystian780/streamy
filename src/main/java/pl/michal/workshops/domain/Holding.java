package pl.michal.workshops.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

    public LinkedList<String> getAllCompanyNames2(){
        List<List<String>> companyNames = new ArrayList<>();
        companyNames.add(companies.stream().map(Company::getName).collect(Collectors.toList()));
        return companyNames.stream().flatMap(List::stream).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public int compareTo(Holding o) {
        return 0;
    }
}
