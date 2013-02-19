package ru.patterns.abstractfactory.simple;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        26.08.11, 0:52 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class PizzaStore {
   SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){

        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();

        return pizza;
    }
}
