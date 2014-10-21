package headfirst.iterator.dinermergers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Waitress {

  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;
  private VesuvioMenu vMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,VesuvioMenu vMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.vMenu = vMenu;
  }

  public void printMenu() {
    ArrayList<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
    MenuItem[] menuItemsAs = dinerMenu.getMenuItems();
    LinkedList<MenuItem> vMenuItem = vMenu.getMenuItems();
    

    System.out.println("MENU\n----\nBREAKFAST");
    for (int i = 0; i < menuItems.size(); i++) {
      MenuItem menuItem = menuItems.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nLUNCH");
    for (int i = 0; i < menuItemsAs.length; i++) {
      MenuItem menuItem = menuItemsAs[i];
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    
    System.out.println("MENU\n----\nVesuvio");
    for (int i = 0; i < vMenuItem.size(); i++) {
      MenuItem menuItem = vMenuItem.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }

}
