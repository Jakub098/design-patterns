package wizytor.visitor;

import wizytor.activity.Squash;
import wizytor.activity.Treadmill;
import wizytor.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
