package org.kaleval.springAppWithHibernate.util;

import org.kaleval.springAppWithHibernate.dao.PersonDAO;
import org.kaleval.springAppWithHibernate.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
//
//@Component
//public class PersonValidator implements Validator {
//
//private final PersonDAO personDAO;
//
//    @Autowired
//    public PersonValidator(PersonDAO personDAO) {
//        this.personDAO = personDAO;
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return Person.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        Person person = (Person) o;
//
//        if (personDAO.show(person.getEmail()).isPresent()) {
//            // поле, код ошибки, сообщение ошибки
//            errors.rejectValue("email", "", "This email is already in use");
//        }
//
//        // Проверяем, что у человека имя начинается с заглавной буквы
//        // Если имя не начинается с заглавной буквы - выдаем ошибку
//        if (!Character.isUpperCase(person.getName().codePointAt(0)))
//            errors.rejectValue("name", "", "Name should start with a capital letter");
//    }
//}
