package wizytor.activity;

import wizytor.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
