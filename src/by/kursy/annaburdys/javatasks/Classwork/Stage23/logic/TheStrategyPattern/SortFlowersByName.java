package by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.FlowerSorter;

public class SortFlowersByName implements FlowersComparable {
    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getName().compareTo(flower2.getName()) > 0;
    }
}
