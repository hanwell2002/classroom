package com.newhope.bigdata.application.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidator {
    public static void main(String[] args) {
        emailValidator();
    }

    public static void emailValidator() {
        List<String> emails = new ArrayList<>();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        //无效的 emails 地址
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for ( String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }

    /*public void testUsingSimpleRegex() {
      String  emailAddress = "username@domain.com";
        String  regexPattern = "^(.+)@(\\S+)$";
        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
    }

    public void testUsingUnicodeRegex() {
        emailAddress = "用户名@领域.电脑";
        regexPattern = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"
                + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
    }*/
}