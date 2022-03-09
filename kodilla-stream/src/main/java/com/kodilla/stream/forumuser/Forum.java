package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {

        theForumUser.add(new ForumUser(0001, "Jurek Killer", 'M', 1975, 11, 11, 3));
        theForumUser.add(new ForumUser(0002, "Andrzej Nowak ", 'M', 1995, 2, 27, 0));
        theForumUser.add(new ForumUser(0003, "Maria Kowal", 'F', 1961, 7, 01, 45));
        theForumUser.add(new ForumUser(0004, "Anna Zielinska", 'F', 1999, 1, 10, 1));
        theForumUser.add(new ForumUser(0005, "Tadeusz Polak", 'M', 2010, 5, 14, 66));
        theForumUser.add(new ForumUser(0006, "Hanna Małek", 'F', 2001, 8, 3, 199));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUser);
        }
}
