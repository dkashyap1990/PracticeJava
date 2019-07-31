package com.xenon.practice.java.problems;

import java.util.*;


// find anagrams word in list and remove the duplicates

public class AnagramSolver {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();

        wordList.add("apple");
        wordList.add("mango");
        wordList.add("pine");
        wordList.add("fango");
        wordList.add("graps");
        wordList.add("lemon");
        wordList.add("plam");
        wordList.add("pplae");
        wordList.add("ngoma");
        wordList.add("spgra");
        wordList.add("graps");
        wordList.add("eipn");
        wordList.add("melon");

        System.out.println(wordList);
        Map<String, String> map = getWordMap(wordList);

        Set<String> set = map.keySet();
        System.out.println(set);
    }

    static Map<String, String> getWordMap(List<String> list) {
        Map<String, String> mapOfWords = new LinkedHashMap<>();

        for (String str : list) {
            String value = wordSorter(str);
            String key = str;

            if (!mapOfWords.containsValue(value)) mapOfWords.put(key, value);
        }
        return mapOfWords;
    }

    static String wordSorter(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

}
