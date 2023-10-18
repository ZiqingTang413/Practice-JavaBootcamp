import java.util.Arrays;
public class UpdatingArrays {
  public static void main(String[] args) {
    String[] menu = {"Espresso", "Iced coffee", "Macchiato"};
    String menuString = Arrays.toString(menu); // cast String[] into string
    System.out.println(menuString);

    menu[2] = "Latte"; // update array
    System.out.println(Arrays.toString(menu));

    // cannot change the length of array
    String[] newMenu = new String[5];

    for (int i = 0; i < menu.length; i++) {
      // copy the element in the old menu to the same index in the new menu
      newMenu[i] = menu[i];

    }
    newMenu[3] = "House Blend";
    newMenu[4] = "Dark Roast";
    System.out.println(Arrays.toString(newMenu));


  }
}
