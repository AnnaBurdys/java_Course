package by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class SortFlowersByPriceDesc implements FlowersComparable {

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getPrice() < flower2.getPrice();
    }


}
