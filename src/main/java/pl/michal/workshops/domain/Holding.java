package pl.michal.workshops.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
@Builder
public class Holding implements Comparable<Holding> {
    private final String name;
    private final List<Company> companies;

    public boolean isEmpty(){
        return !companies.isEmpty();
    }

    public String toLowerCase(){
        return name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return companies.size();
    }

    public long getAllUsers(){
        return companies.stream().map(Company::getUsers2).mapToLong(i -> i).sum();
    }

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

    public long getAllAccountsInACompany(){
        return companies.stream().map(Company::getAccounts).collect(Collectors.summingInt(Long::intValue));
    }

    @Override
    public int compareTo(Holding o) {
        return 0;
    }
}
