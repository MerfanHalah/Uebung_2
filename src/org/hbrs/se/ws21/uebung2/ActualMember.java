package org.hbrs.se.ws21.uebung2;

public class ActualMember implements Member{

    private Integer id;

    public ActualMember(Integer id){
        this.id = id;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String toString(){
        return "Member (ID = "+ id + ")";
    }
}
