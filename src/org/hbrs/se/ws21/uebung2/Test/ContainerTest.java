package org.hbrs.se.ws21.uebung2.Test;

import org.hbrs.se.ws21.uebung2.ActualMember;
import org.hbrs.se.ws21.uebung2.Container;
import org.hbrs.se.ws21.uebung2.ContainerException;
import org.hbrs.se.ws21.uebung2.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Container co = new Container();
    Member a = new ActualMember(10);
    Member b = new ActualMember(20);
    Member c = new ActualMember(30);
    Member d = new ActualMember(10);


    @org.junit.jupiter.api.Test
    @BeforeEach
    void addMember() {
        try {
            co.addMember(a);
            co.addMember(b);
            co.addMember(c);
            co.addMember(d);
            co.addMember(null);
        } catch (ContainerException e){
            Assertions.assertEquals("Das Member-Objekt mit der ID 10 ist bereits vorhanden!",e.getMessage());
        }
        assertEquals(3,co.size());

    }

    @org.junit.jupiter.api.Test
    void deleteMember() {

        assertEquals("Das Member-Objekt mit der ID 10 wurde gelöscht", co.deleteMember(10));
        assertEquals("Das Member-Objekt mit der ID 50 ist nicht verfuegbar", co.deleteMember(50));
        assertEquals(2,co.size());

    }

    @org.junit.jupiter.api.Test
    void dump() {
        co.dump();
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3,co.size());
    }
}
