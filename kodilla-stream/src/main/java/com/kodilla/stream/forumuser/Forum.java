package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Johny First", 'M', 3, 1997));
        theUserList.add(new ForumUser(2, "Monica Slave", 'F', 7, 1999));
        theUserList.add(new ForumUser(3, "Suzy Star", 'F', 4, 2002));
        theUserList.add(new ForumUser(4, "Adam Starski", 'M', 0, 1999));
        theUserList.add(new ForumUser(5, "Steven Bloom", 'M', 7, 2000));
        theUserList.add(new ForumUser(6, "Angelica Norton", 'F', 2, 1995));
        theUserList.add(new ForumUser(7, "Ian Zenecisk", 'M', 3, 1998));
        theUserList.add(new ForumUser(8, "Sam Getersby", 'M', 1, 2001));
        theUserList.add(new ForumUser(9, "Cloe Suu", 'F', 1, 1996));
        theUserList.add(new ForumUser(10, "Andrew Thomson", 'M', 5, 1999));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
