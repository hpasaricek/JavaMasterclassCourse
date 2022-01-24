package com.hrvojepasaricek.packagechallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String regex = "I want a bike.";
        System.out.println(challenge1.matches(regex));

        System.out.println("-------------------------");

        String challenge2 = "I want a ball.";
        String regExp = "I want a \\w+.";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        System.out.println("---------------------");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        System.out.println("---------------------");

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-z]*"));

        System.out.println("---------------------");

        String challenge5regex = "^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.matches(challenge5regex));

        System.out.println("---------------------");

        String challenge7regex = "(^(?i)[a-z]+\\.[0-9]+)";
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches(challenge7regex));

        System.out.println("---------------------");

//        String challenge8 = "abcd.135uvqz.7tzik.999";
        String challenge8 = "abcd.135\tuvqz.7\ttzik.999\n";
        String challenge8regex = "(\\d+)";
        Pattern challenge8pattern = Pattern.compile(challenge8regex);
        Matcher challenge8matcher = challenge8pattern.matcher(challenge8);

        while (challenge8matcher.find()) {
            System.out.println("Occurrence: " + challenge8matcher.group(1));
        }

        System.out.println("---------------------");

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String challenge10regex = "(\\d+)";
        Pattern challenge10pattern = Pattern.compile(challenge10regex);
        Matcher challenge10matcher = challenge10pattern.matcher(challenge10);

        while (challenge10matcher.find()) {
            System.out.println("Occurrence: " + challenge10matcher.start(1) + " : " + (challenge10matcher.end(1) - 1));
        }

        System.out.println("---------------------");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String challenge11regex = "\\{(\\d+,\\s{1}\\d+)\\}";
        Pattern challenge11Pattern = Pattern.compile(challenge11regex);
        Matcher challenge11Matcher = challenge11Pattern.matcher(challenge11);

        while (challenge11Matcher.find()) {
            System.out.println("Occurrence: " + challenge11Matcher.group(1));
        }

        System.out.println("---------------------");

        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String challenge11aregex = "\\{(\\d+),\\s{1}(\\d+)\\}";
        Pattern challenge11aPattern = Pattern.compile(challenge11aregex);
        Matcher challenge11aMatcher = challenge11aPattern.matcher(challenge11a);

        while (challenge11aMatcher.find()) {
            System.out.println("Occurrence: " + challenge11aMatcher.group(1) + challenge11aMatcher.group(2));
        }

        System.out.println("---------------------");

        String challenge12 = "11111";
        String challenge12regex = "^\\d{5}$";

        System.out.println(challenge12.matches(challenge12regex));

        System.out.println("---------------------");

        String challenge13 = "11111-1111";
        String challenge13regex = "^\\d{5}-\\d{4}$";

        System.out.println(challenge13.matches(challenge13regex));

        System.out.println("---------------------");

        String challenge14 = "11111";
        String challenge14regex = "^\\d{5}$|^\\d{5}-\\d{4}$";

        System.out.println(challenge14.matches(challenge14regex));

    }
}
