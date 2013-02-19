package ru.patterns.abstractfactory.simple;

import ru.patterns.abstractfactory.simple.menu.CheesePizza;
import ru.patterns.abstractfactory.simple.menu.PeperoniPizza;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        26.08.11, 0:32 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("chesee")) {
            return new CheesePizza();
        } else {
            return new PeperoniPizza();
        }
    }

}
