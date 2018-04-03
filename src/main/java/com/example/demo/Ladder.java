package com.example.demo;

import java.util.Vector;

public class Ladder {
    private String begin;
    private String end;
    private Vector<String> ladder;

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Vector<String> getLadder() {
        return ladder;
    }

    public void setLadder(Vector<String> ladder) {
        this.ladder = ladder;
    }
}