package headfirst.iterator.dinermergers;

public class MenuTestDrive {

  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    VesuvioMenu vMenu = new VesuvioMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, vMenu);
    waitress.printMenu();
  }

}
