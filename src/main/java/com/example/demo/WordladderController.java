package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordladderController {
    @RequestMapping("/")
    public Ladder greeting(@RequestParam(value = "begin", defaultValue = "hello") String begin,
                           @RequestParam(value = "end", defaultValue = "world") String end) {
        Wordladder question = new Wordladder(begin, end);
        Ladder ladder = new Ladder();
        ladder.setBegin(begin);
        ladder.setEnd(end);
        ladder.setLadder(question.findPath());
        return ladder;
    }
}



