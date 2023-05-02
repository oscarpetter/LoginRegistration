package com.loginregistration.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    private static Pattern regex = Pattern.compile("[-@._a-zA-Z0-9]{4,}");
    @Override
    public boolean test(String s) {
        //TODO: validate with regex

        return regex.matcher(s).matches();
    }
}
