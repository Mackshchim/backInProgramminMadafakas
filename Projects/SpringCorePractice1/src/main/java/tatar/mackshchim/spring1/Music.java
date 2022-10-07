package tatar.mackshchim.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

public class Music {
    private List<String> authors;
    private String name;

    public Music(@Autowired List<String> authors, String name) {
        this.authors = authors;
        this.name = name;
    }

    @Override
    public String toString() {
        return authors.toString().substring(1,authors.toString().length()-1) + " - " + name;
    }
}
