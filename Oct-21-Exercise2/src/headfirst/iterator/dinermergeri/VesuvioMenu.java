package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.LinkedList;

public class VesuvioMenu implements Menu {
	LinkedList<MenuItem> menuItems;
	MenuItem BakedZiti;
	MenuItem HomemadeLasagna;
	MenuItem Manicotti;

	public VesuvioMenu() {
		menuItems = new LinkedList<MenuItem>();
		addItem("BakedZiti", "it's ziti!", true, 2.99);
		addItem("HomemadeLasagna", "it's lasagna!", true, 2.99);
		addItem("Manicotti", "it's idk what!", true, 2.99);
	}

	public MenuItem[] getMenuItems() {
		MenuItem[] array = menuItems.toArray(new MenuItem[menuItems.size()]);
		return array;
	}
	
	public void addItem(String name, String description, boolean vegetarian,
            double price) {
MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
menuItems.add(menuItem);
}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(getMenuItems());
	}
	
	
	
}
