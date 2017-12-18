package guiPlayer;

import java.util.ArrayList;

public class CatalogMaker {

	private ArrayList<Monkey> list;

	public CatalogMaker() {

		list = new ArrayList<Monkey>();
		list.add(new Monkey("Blue-Eyes", "Monster", 8, 10));
		list.add(new Monkey("Neos", "Monster", 7, 8));
		list.add(new Monkey("Dark Magician", "Monster", 7, 9));
		list.add(new Monkey("Red-Eyes", "Monster", 7, 6));

	}

	public static void main(String[] args) {
		CatalogMaker test = new CatalogMaker();
		System.out.print(test.getContent());
	}

	public String getContent() {
		String data = "Name,Type,Level,Price\n";

		for (Monkey i : list) {
			data += i + "\n";
		}
		return data;
	}

	public void addNewItem(String name, String type, int level, int price) {
		list.add(new Monkey(name, type, level, price));
		System.out.println("Item added Sucessfully");
	}

	public void addItem(String input) {

	}

}
