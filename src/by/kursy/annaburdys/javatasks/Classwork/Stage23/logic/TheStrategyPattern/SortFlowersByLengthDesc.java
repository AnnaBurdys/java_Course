package by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class SortFlowersByLengthDesc implements FlowersComparable {

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getLength() < flower2.getLength();
    }

}