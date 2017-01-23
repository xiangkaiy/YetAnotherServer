package duncan.server.service;

import java.util.List;

import duncan.server.model.Person;

public interface IPersonService {

    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}