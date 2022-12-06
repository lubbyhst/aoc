package com.github.lubbyhst.aoc.y2022.d5;

public class Data {
    public static final String rawExampleStacks = "    [D]    \n" +
            "[N] [C]    \n" +
            "[Z] [M] [P]";
    public static final String rawExampleMovements = "move 1 from 2 to 1\n" +
            "move 3 from 1 to 3\n" +
            "move 2 from 2 to 1\n" +
            "move 1 from 1 to 2";
    public static final String rawStacks = "[G]                 [D] [R]        \n" +
            "[W]         [V]     [C] [T] [M]    \n" +
            "[L]         [P] [Z] [Q] [F] [V]    \n" +
            "[J]         [S] [D] [J] [M] [T] [V]\n" +
            "[B]     [M] [H] [L] [Z] [J] [B] [S]\n" +
            "[R] [C] [T] [C] [T] [R] [D] [R] [D]\n" +
            "[T] [W] [Z] [T] [P] [B] [B] [H] [P]\n" +
            "[D] [S] [R] [D] [G] [F] [S] [L] [Q]";
    public static final String rawMovements = "move 1 from 3 to 5\n" +
            "move 5 from 5 to 4\n" +
            "move 6 from 7 to 3\n" +
            "move 6 from 1 to 3\n" +
            "move 1 from 1 to 9\n" +
            "move 1 from 1 to 4\n" +
            "move 3 from 6 to 9\n" +
            "move 2 from 7 to 5\n" +
            "move 1 from 5 to 7\n" +
            "move 1 from 7 to 2\n" +
            "move 2 from 2 to 5\n" +
            "move 2 from 6 to 3\n" +
            "move 6 from 8 to 9\n" +
            "move 7 from 3 to 9\n" +
            "move 1 from 8 to 7\n" +
            "move 8 from 9 to 7\n" +
            "move 5 from 4 to 8\n" +
            "move 1 from 6 to 2\n" +
            "move 2 from 8 to 4\n" +
            "move 9 from 9 to 1\n" +
            "move 2 from 8 to 5\n" +
            "move 1 from 8 to 5\n" +
            "move 5 from 9 to 2\n" +
            "move 1 from 6 to 8\n" +
            "move 5 from 1 to 7\n" +
            "move 1 from 8 to 2\n" +
            "move 2 from 1 to 7\n" +
            "move 1 from 2 to 6\n" +
            "move 4 from 5 to 4\n" +
            "move 2 from 1 to 4\n" +
            "move 13 from 7 to 8\n" +
            "move 3 from 8 to 6\n" +
            "move 2 from 6 to 8\n" +
            "move 10 from 3 to 5\n" +
            "move 2 from 7 to 6\n" +
            "move 3 from 5 to 6\n" +
            "move 10 from 8 to 1\n" +
            "move 1 from 8 to 6\n" +
            "move 6 from 2 to 4\n" +
            "move 1 from 5 to 8\n" +
            "move 5 from 6 to 3\n" +
            "move 2 from 8 to 6\n" +
            "move 1 from 7 to 9\n" +
            "move 2 from 2 to 7\n" +
            "move 3 from 5 to 1\n" +
            "move 2 from 7 to 2\n" +
            "move 6 from 6 to 3\n" +
            "move 7 from 5 to 6\n" +
            "move 5 from 3 to 2\n" +
            "move 10 from 1 to 8\n" +
            "move 2 from 1 to 3\n" +
            "move 8 from 3 to 7\n" +
            "move 9 from 4 to 8\n" +
            "move 1 from 9 to 2\n" +
            "move 2 from 7 to 8\n" +
            "move 4 from 6 to 9\n" +
            "move 1 from 4 to 9\n" +
            "move 5 from 7 to 4\n" +
            "move 3 from 6 to 5\n" +
            "move 1 from 1 to 5\n" +
            "move 14 from 4 to 8\n" +
            "move 3 from 9 to 7\n" +
            "move 4 from 5 to 9\n" +
            "move 2 from 4 to 1\n" +
            "move 27 from 8 to 6\n" +
            "move 2 from 7 to 2\n" +
            "move 2 from 7 to 4\n" +
            "move 4 from 2 to 9\n" +
            "move 7 from 8 to 4\n" +
            "move 10 from 4 to 1\n" +
            "move 18 from 6 to 5\n" +
            "move 6 from 9 to 2\n" +
            "move 1 from 9 to 5\n" +
            "move 11 from 2 to 6\n" +
            "move 2 from 5 to 4\n" +
            "move 1 from 2 to 8\n" +
            "move 2 from 4 to 9\n" +
            "move 2 from 8 to 3\n" +
            "move 1 from 6 to 8\n" +
            "move 4 from 9 to 7\n" +
            "move 4 from 7 to 8\n" +
            "move 7 from 5 to 1\n" +
            "move 4 from 6 to 3\n" +
            "move 2 from 3 to 7\n" +
            "move 6 from 5 to 3\n" +
            "move 2 from 8 to 2\n" +
            "move 14 from 6 to 2\n" +
            "move 3 from 8 to 1\n" +
            "move 15 from 2 to 3\n" +
            "move 1 from 6 to 1\n" +
            "move 14 from 3 to 2\n" +
            "move 2 from 2 to 5\n" +
            "move 1 from 9 to 3\n" +
            "move 13 from 1 to 3\n" +
            "move 4 from 2 to 6\n" +
            "move 10 from 1 to 3\n" +
            "move 2 from 6 to 9\n" +
            "move 6 from 2 to 9\n" +
            "move 6 from 5 to 2\n" +
            "move 2 from 6 to 8\n" +
            "move 7 from 9 to 5\n" +
            "move 1 from 5 to 8\n" +
            "move 2 from 7 to 6\n" +
            "move 34 from 3 to 6\n" +
            "move 19 from 6 to 2\n" +
            "move 12 from 6 to 9\n" +
            "move 3 from 6 to 3\n" +
            "move 2 from 3 to 2\n" +
            "move 1 from 6 to 5\n" +
            "move 17 from 2 to 8\n" +
            "move 2 from 3 to 2\n" +
            "move 8 from 9 to 4\n" +
            "move 7 from 5 to 2\n" +
            "move 5 from 4 to 1\n" +
            "move 4 from 1 to 6\n" +
            "move 1 from 1 to 6\n" +
            "move 6 from 6 to 8\n" +
            "move 2 from 8 to 4\n" +
            "move 17 from 8 to 6\n" +
            "move 2 from 4 to 5\n" +
            "move 17 from 6 to 9\n" +
            "move 22 from 9 to 7\n" +
            "move 1 from 5 to 2\n" +
            "move 20 from 2 to 7\n" +
            "move 29 from 7 to 9\n" +
            "move 1 from 4 to 7\n" +
            "move 3 from 8 to 3\n" +
            "move 1 from 8 to 5\n" +
            "move 3 from 8 to 2\n" +
            "move 2 from 2 to 4\n" +
            "move 27 from 9 to 7\n" +
            "move 2 from 3 to 2\n" +
            "move 1 from 5 to 2\n" +
            "move 18 from 7 to 5\n" +
            "move 1 from 3 to 2\n" +
            "move 1 from 5 to 6\n" +
            "move 18 from 5 to 3\n" +
            "move 1 from 6 to 3\n" +
            "move 2 from 9 to 5\n" +
            "move 10 from 3 to 5\n" +
            "move 4 from 3 to 6\n" +
            "move 1 from 7 to 1\n" +
            "move 1 from 5 to 1\n" +
            "move 6 from 7 to 6\n" +
            "move 1 from 6 to 2\n" +
            "move 4 from 4 to 8\n" +
            "move 5 from 5 to 4\n" +
            "move 1 from 3 to 8\n" +
            "move 2 from 1 to 8\n" +
            "move 2 from 2 to 5\n" +
            "move 3 from 3 to 8\n" +
            "move 6 from 8 to 2\n" +
            "move 1 from 3 to 9\n" +
            "move 1 from 6 to 3\n" +
            "move 6 from 2 to 8\n" +
            "move 7 from 8 to 4\n" +
            "move 8 from 5 to 2\n" +
            "move 5 from 4 to 6\n" +
            "move 2 from 8 to 3\n" +
            "move 2 from 3 to 9\n" +
            "move 1 from 3 to 9\n" +
            "move 2 from 7 to 1\n" +
            "move 2 from 1 to 2\n" +
            "move 12 from 2 to 4\n" +
            "move 1 from 9 to 7\n" +
            "move 1 from 6 to 2\n" +
            "move 9 from 7 to 9\n" +
            "move 1 from 8 to 2\n" +
            "move 9 from 9 to 8\n" +
            "move 6 from 7 to 8\n" +
            "move 4 from 4 to 1\n" +
            "move 6 from 2 to 5\n" +
            "move 1 from 4 to 9\n" +
            "move 3 from 1 to 9\n" +
            "move 6 from 4 to 5\n" +
            "move 5 from 8 to 9\n" +
            "move 8 from 4 to 6\n" +
            "move 3 from 9 to 8\n" +
            "move 1 from 9 to 3\n" +
            "move 3 from 8 to 3\n" +
            "move 5 from 9 to 2\n" +
            "move 3 from 2 to 6\n" +
            "move 3 from 6 to 9\n" +
            "move 3 from 6 to 2\n" +
            "move 4 from 2 to 6\n" +
            "move 6 from 9 to 7\n" +
            "move 1 from 1 to 8\n" +
            "move 8 from 8 to 5\n" +
            "move 20 from 5 to 3\n" +
            "move 2 from 2 to 8\n" +
            "move 6 from 7 to 1\n" +
            "move 10 from 6 to 3\n" +
            "move 4 from 6 to 7\n" +
            "move 4 from 1 to 9\n" +
            "move 2 from 1 to 2\n" +
            "move 3 from 6 to 9\n" +
            "move 5 from 8 to 3\n" +
            "move 3 from 7 to 9\n" +
            "move 17 from 3 to 2\n" +
            "move 1 from 6 to 2\n" +
            "move 2 from 6 to 9\n" +
            "move 1 from 6 to 4\n" +
            "move 12 from 9 to 2\n" +
            "move 1 from 4 to 7\n" +
            "move 8 from 3 to 8\n" +
            "move 8 from 8 to 9\n" +
            "move 7 from 9 to 2\n" +
            "move 1 from 9 to 7\n" +
            "move 18 from 2 to 9\n" +
            "move 1 from 7 to 2\n" +
            "move 2 from 7 to 1\n" +
            "move 1 from 1 to 2\n" +
            "move 4 from 2 to 7\n" +
            "move 15 from 9 to 3\n" +
            "move 1 from 9 to 1\n" +
            "move 2 from 1 to 8\n" +
            "move 6 from 2 to 4\n" +
            "move 8 from 2 to 1\n" +
            "move 2 from 8 to 5\n" +
            "move 2 from 9 to 3\n" +
            "move 4 from 4 to 1\n" +
            "move 2 from 5 to 8\n" +
            "move 2 from 8 to 9\n" +
            "move 14 from 3 to 1\n" +
            "move 2 from 9 to 7\n" +
            "move 2 from 4 to 3\n" +
            "move 1 from 2 to 9\n" +
            "move 5 from 7 to 9\n" +
            "move 21 from 1 to 9\n" +
            "move 2 from 1 to 6\n" +
            "move 3 from 2 to 4\n" +
            "move 1 from 7 to 3\n" +
            "move 19 from 9 to 5\n" +
            "move 1 from 2 to 7\n" +
            "move 1 from 7 to 2\n" +
            "move 3 from 4 to 2\n" +
            "move 19 from 5 to 7\n" +
            "move 2 from 2 to 5\n" +
            "move 1 from 5 to 3\n" +
            "move 1 from 3 to 4\n" +
            "move 8 from 9 to 4\n" +
            "move 1 from 6 to 3\n" +
            "move 1 from 2 to 6\n" +
            "move 1 from 2 to 1\n" +
            "move 8 from 7 to 3\n" +
            "move 5 from 4 to 7\n" +
            "move 2 from 6 to 4\n" +
            "move 1 from 5 to 9\n" +
            "move 1 from 1 to 6\n" +
            "move 1 from 1 to 2\n" +
            "move 2 from 4 to 7\n" +
            "move 1 from 4 to 2\n" +
            "move 2 from 4 to 9\n" +
            "move 1 from 6 to 8\n" +
            "move 1 from 1 to 5\n" +
            "move 1 from 8 to 6\n" +
            "move 1 from 1 to 4\n" +
            "move 25 from 3 to 1\n" +
            "move 1 from 4 to 2\n" +
            "move 2 from 3 to 6\n" +
            "move 3 from 1 to 9\n" +
            "move 6 from 9 to 8\n" +
            "move 1 from 6 to 3\n" +
            "move 1 from 2 to 9\n" +
            "move 15 from 7 to 6\n" +
            "move 2 from 2 to 6\n" +
            "move 1 from 3 to 8\n" +
            "move 1 from 1 to 4\n" +
            "move 6 from 8 to 4\n" +
            "move 1 from 3 to 8\n" +
            "move 1 from 8 to 5\n" +
            "move 2 from 5 to 2\n" +
            "move 8 from 6 to 7\n" +
            "move 1 from 8 to 7\n" +
            "move 1 from 9 to 4\n" +
            "move 9 from 4 to 5\n" +
            "move 19 from 1 to 3\n" +
            "move 9 from 3 to 5\n" +
            "move 6 from 7 to 2\n" +
            "move 2 from 1 to 7\n" +
            "move 7 from 2 to 4\n" +
            "move 7 from 5 to 6\n" +
            "move 5 from 4 to 3\n" +
            "move 3 from 5 to 8\n" +
            "move 1 from 2 to 4\n" +
            "move 2 from 4 to 8\n" +
            "move 14 from 6 to 1\n" +
            "move 6 from 5 to 6\n" +
            "move 1 from 5 to 2\n" +
            "move 7 from 1 to 6\n" +
            "move 1 from 2 to 4\n" +
            "move 4 from 6 to 4\n" +
            "move 1 from 5 to 4\n" +
            "move 2 from 1 to 9\n" +
            "move 2 from 9 to 4\n" +
            "move 2 from 1 to 8\n" +
            "move 9 from 3 to 6\n" +
            "move 3 from 7 to 4\n" +
            "move 4 from 8 to 6\n" +
            "move 3 from 7 to 6\n" +
            "move 1 from 7 to 2\n" +
            "move 1 from 7 to 5\n" +
            "move 3 from 8 to 4\n" +
            "move 26 from 6 to 1\n" +
            "move 8 from 1 to 2\n" +
            "move 1 from 6 to 4\n" +
            "move 5 from 2 to 7\n" +
            "move 2 from 2 to 4\n" +
            "move 10 from 4 to 7\n" +
            "move 1 from 6 to 1\n" +
            "move 22 from 1 to 2\n" +
            "move 1 from 6 to 1\n" +
            "move 6 from 4 to 7\n" +
            "move 1 from 5 to 1\n" +
            "move 1 from 1 to 2\n" +
            "move 21 from 7 to 2\n" +
            "move 38 from 2 to 3\n" +
            "move 8 from 2 to 6\n" +
            "move 2 from 4 to 8\n" +
            "move 2 from 8 to 2\n" +
            "move 1 from 1 to 3\n" +
            "move 1 from 2 to 8\n" +
            "move 1 from 2 to 5\n" +
            "move 6 from 6 to 4\n" +
            "move 2 from 4 to 2\n" +
            "move 2 from 2 to 6\n" +
            "move 1 from 8 to 2\n" +
            "move 28 from 3 to 1\n" +
            "move 11 from 1 to 2\n" +
            "move 8 from 1 to 7\n" +
            "move 4 from 6 to 4\n" +
            "move 8 from 3 to 1\n" +
            "move 8 from 2 to 5\n" +
            "move 6 from 5 to 4\n" +
            "move 2 from 5 to 4\n" +
            "move 8 from 3 to 4\n" +
            "move 22 from 4 to 1\n" +
            "move 2 from 3 to 5\n" +
            "move 33 from 1 to 5\n" +
            "move 26 from 5 to 6\n" +
            "move 4 from 5 to 7\n" +
            "move 2 from 2 to 7\n" +
            "move 2 from 7 to 2\n" +
            "move 2 from 7 to 8\n" +
            "move 2 from 8 to 3\n" +
            "move 6 from 1 to 3\n" +
            "move 5 from 5 to 1\n" +
            "move 1 from 5 to 7\n" +
            "move 7 from 7 to 5\n" +
            "move 4 from 5 to 6\n" +
            "move 5 from 1 to 8\n" +
            "move 4 from 2 to 4\n" +
            "move 2 from 7 to 4\n" +
            "move 2 from 7 to 3\n" +
            "move 5 from 4 to 6\n" +
            "move 1 from 8 to 2\n" +
            "move 1 from 2 to 4\n" +
            "move 10 from 3 to 6\n" +
            "move 44 from 6 to 9\n" +
            "move 2 from 5 to 7\n" +
            "move 1 from 5 to 8\n" +
            "move 41 from 9 to 1\n" +
            "move 1 from 6 to 4\n" +
            "move 2 from 8 to 1\n" +
            "move 1 from 7 to 3\n" +
            "move 1 from 3 to 8\n" +
            "move 2 from 9 to 8\n" +
            "move 29 from 1 to 9\n" +
            "move 2 from 1 to 5\n" +
            "move 2 from 8 to 3\n" +
            "move 1 from 3 to 5\n" +
            "move 2 from 5 to 9\n" +
            "move 1 from 5 to 7\n" +
            "move 25 from 9 to 2\n" +
            "move 10 from 2 to 1\n" +
            "move 1 from 7 to 8\n" +
            "move 2 from 4 to 1\n" +
            "move 2 from 8 to 9\n" +
            "move 1 from 8 to 6\n" +
            "move 4 from 2 to 4\n" +
            "move 4 from 2 to 5\n" +
            "move 1 from 6 to 5\n" +
            "move 1 from 2 to 7\n" +
            "move 2 from 4 to 1\n" +
            "move 18 from 1 to 3\n" +
            "move 8 from 9 to 4\n" +
            "move 15 from 3 to 9\n" +
            "move 3 from 4 to 8\n" +
            "move 4 from 5 to 8\n" +
            "move 4 from 2 to 4\n" +
            "move 10 from 9 to 4\n" +
            "move 4 from 8 to 5\n" +
            "move 2 from 7 to 2\n" +
            "move 11 from 4 to 9\n" +
            "move 12 from 4 to 9\n" +
            "move 2 from 5 to 7\n" +
            "move 4 from 2 to 4\n" +
            "move 5 from 8 to 1\n" +
            "move 1 from 5 to 6\n" +
            "move 1 from 4 to 6\n" +
            "move 1 from 3 to 9\n" +
            "move 1 from 5 to 7\n" +
            "move 4 from 1 to 6\n" +
            "move 6 from 1 to 5\n" +
            "move 6 from 5 to 9\n" +
            "move 3 from 7 to 6\n" +
            "move 9 from 6 to 5\n" +
            "move 8 from 5 to 2\n" +
            "move 7 from 2 to 3\n" +
            "move 1 from 3 to 1\n" +
            "move 7 from 3 to 5\n" +
            "move 2 from 4 to 1\n" +
            "move 1 from 2 to 6\n" +
            "move 2 from 1 to 3\n" +
            "move 8 from 5 to 9\n" +
            "move 3 from 1 to 3\n" +
            "move 1 from 6 to 1\n" +
            "move 2 from 4 to 1\n" +
            "move 1 from 5 to 2\n" +
            "move 2 from 1 to 6\n" +
            "move 2 from 6 to 3\n" +
            "move 2 from 3 to 2\n" +
            "move 2 from 2 to 4\n" +
            "move 1 from 2 to 6\n" +
            "move 3 from 3 to 9\n" +
            "move 2 from 4 to 8\n" +
            "move 3 from 3 to 1\n" +
            "move 4 from 1 to 7\n" +
            "move 2 from 8 to 4\n" +
            "move 7 from 9 to 6\n" +
            "move 1 from 1 to 4\n" +
            "move 11 from 9 to 7\n" +
            "move 3 from 9 to 3\n" +
            "move 14 from 9 to 5\n" +
            "move 6 from 6 to 5\n" +
            "move 4 from 5 to 9\n" +
            "move 10 from 7 to 6\n" +
            "move 1 from 3 to 7\n" +
            "move 2 from 4 to 1\n" +
            "move 4 from 7 to 9\n" +
            "move 9 from 6 to 1\n" +
            "move 3 from 6 to 5\n" +
            "move 15 from 9 to 1\n" +
            "move 1 from 4 to 7\n" +
            "move 4 from 9 to 7\n" +
            "move 12 from 5 to 1\n" +
            "move 3 from 7 to 3\n" +
            "move 4 from 7 to 2\n" +
            "move 1 from 9 to 3\n" +
            "move 22 from 1 to 2\n" +
            "move 21 from 2 to 6\n" +
            "move 3 from 1 to 9\n" +
            "move 1 from 3 to 7\n" +
            "move 1 from 7 to 3\n" +
            "move 1 from 3 to 2\n" +
            "move 8 from 1 to 4\n" +
            "move 1 from 9 to 2\n" +
            "move 7 from 4 to 8\n" +
            "move 3 from 3 to 9\n" +
            "move 3 from 3 to 5\n" +
            "move 4 from 2 to 3\n" +
            "move 1 from 1 to 3\n" +
            "move 4 from 8 to 5\n" +
            "move 2 from 8 to 3\n" +
            "move 5 from 3 to 2\n" +
            "move 6 from 5 to 3\n" +
            "move 2 from 5 to 8\n" +
            "move 2 from 1 to 7\n" +
            "move 2 from 7 to 4\n" +
            "move 15 from 6 to 9\n" +
            "move 8 from 3 to 1\n" +
            "move 3 from 5 to 9\n" +
            "move 2 from 4 to 9\n" +
            "move 8 from 1 to 3\n" +
            "move 8 from 9 to 8\n" +
            "move 1 from 1 to 4\n" +
            "move 3 from 5 to 9\n" +
            "move 4 from 8 to 1\n" +
            "move 1 from 3 to 9\n" +
            "move 2 from 4 to 3\n" +
            "move 2 from 8 to 6\n" +
            "move 3 from 8 to 7\n" +
            "move 8 from 2 to 5\n" +
            "move 3 from 5 to 2\n" +
            "move 4 from 3 to 4\n" +
            "move 3 from 6 to 1\n" +
            "move 2 from 5 to 9\n" +
            "move 4 from 4 to 1\n" +
            "move 2 from 5 to 6\n" +
            "move 1 from 5 to 4\n" +
            "move 2 from 2 to 1\n" +
            "move 4 from 3 to 9\n" +
            "move 1 from 7 to 3\n" +
            "move 2 from 7 to 4\n" +
            "move 2 from 4 to 7\n" +
            "move 1 from 6 to 7\n" +
            "move 1 from 2 to 8\n" +
            "move 2 from 3 to 9\n" +
            "move 14 from 1 to 8\n" +
            "move 1 from 6 to 2\n" +
            "move 2 from 7 to 1\n" +
            "move 3 from 8 to 3\n" +
            "move 6 from 8 to 5";
}
