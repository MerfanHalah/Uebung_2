package org.hbrs.se.ws21.uebung2;

import java.util.*;

public class Container {
    private List<Member> content;

    public Container() {
        content = new ArrayList<Member>();
    }

    public void addMember(Member member) throws ContainerException {
        Integer m = member.getID();

        for (int i = 0; i < content.size(); i++) {
            Integer c = content.get(i).getID();
            if (c == m) {
                throw new ContainerException("Das Member-Objekt mit der ID " + c +
                        " ist bereits vorhanden!");
            }

        }
        content.add(member);
    }

    public String deleteMember(int id) {
        for (int i = 0; i < content.size(); i++) {
            Integer c = content.get(i).getID();
            if (c == id) {
                content.remove(i);
                return "Das Member-Objekt mit der ID " + id + " wurde gelöscht";
            }
        }
        return "Das Member-Objekt mit der ID " + id + " ist nicht verfuegbar";

    }


    public void dump() {
        for (int i = 0; i < content.size(); i++) {
          System.out.println(content.get(i).toString());
        }
    }


    public int size() {
        return content.size();
    }

}
