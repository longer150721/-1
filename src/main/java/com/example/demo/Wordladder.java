package com.example.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Vector;

public class Wordladder {

    private String start;
    private String end;
    private HashSet dict;

    public Wordladder(String start, String end) {
        this.start = start;
        this.end = end;
        try{
            HashSet dictSet = new HashSet();
            Resource resource = new ClassPathResource("dictionary.txt");
            File file = resource.getFile();
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                dictSet.add(str);
            }
            this.dict = dictSet;
            inputStream.close();
            bufferedReader.close();

        }
        catch(Exception e){
            System.out.println("Can't find this file!");
        }
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setDict(HashSet dict) {
        this.dict = dict;
    }

    public Vector<String> findPath() {
        start.toLowerCase();
        end.toLowerCase();
        Vector<String> first = new Vector<String>();
        first.add(start);
        ArrayDeque<Vector<String>> ladderqueue = new ArrayDeque<Vector<String>>();
        ladderqueue.add(first);
        while (!ladderqueue.isEmpty()) {
            Vector<String> tempstack = ladderqueue.poll();
            String word = tempstack.lastElement();
            //   System.out.println(currentWord+" "+end);
            if (end.equals(word)) {
                return tempstack;
            }
            for (int i = 0; i < word.length(); ++i) {
                char oldchar = word.charAt(i);
                for (char c = 'a'; c <= 'z'; ++c) {
                    if (c == oldchar) {
                        continue;
                    }
                    String word_replace = word.substring(0, i) + c + word.substring(i + 1, word.length());
                    if (dict.contains(word_replace)) {
                        dict.remove(word_replace);
                        Vector<String> next = new Vector<String>(tempstack);
                        next.add(word_replace);
                        ladderqueue.add(next);
                    }
                }
            }
        }
        return null;
    }

}
