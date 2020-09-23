package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    @Test public void testNewShop() {
        Shop testShop = new Shop("Apple Shoppe", 1, "A store for delicious apples.");
        assertEquals("the description field should be set by constructor", "A store for delicious apples.", testShop.getDescription());
    }

    @Test public void testToString() {
        Shop testShop = new Shop("Apple Shoppe", 1, "A store for delicious apples.");
        assertEquals("should pretty print", "Shop{name='Apple Shoppe', description='A store for delicious apples.', priceCategory=$}", testShop.toString());
    }
}
