import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("1. Insert a value into the beginning of the list.");
			System.out.println("2. Remove a value from the beginning of the list.");
			System.out.println("3. Insert a value at a specific index in the list.");
			System.out.println("4. Remove a value from a specific index in the list.");
			System.out.println("5. Print the size of the list.");
			System.out.println("6. Print the contents of the list.");
			System.out.println("7. Clear the list. ");
			System.out.println("8. Exit. ");
			System.out.print("> ");
			
			try {
				String choice = input.readLine();
				if(choice.equals("1")) {
					System.out.print("Add a value to the list: ");
					String value = input.readLine();
					list.insert(new Node<String>(value, null, null));
					System.out.println("Item added.");
				}
				else if(choice.equals("2")){
					if(list.getCount() == 0){
						System.out.println("No items to remove.");
					} else {
						list.pop();
						System.out.println("Item removed.");
					}
				}
				else if(choice.equals("3")) {
					while(true) {
						System.out.println("Insert where? ");
						String index = input.readLine();
						int i = Integer.parseInt(index);
						if(i < 0 || i > list.getCount()) {
							System.out.println("That's not a valid index, your value must fall within 0 and " + list.getCount() + ".");
							break;
						} else {
							System.out.println("Great, good index, what are we inserting?");
							String value = input.readLine();
							list.insertAt(new Node<String>(value, null, null), i);
							System.out.println("Item added.");
							break;
						}
					}
				}
				else if(choice.equals("4")) {
					if(list.getCount() == 0) {
						System.out.println("There's nothing to remove, the list is already empty.");
						continue;
					}
					
					while(true) {
						System.out.println("Remove where? ");
						String index = input.readLine();
						int i = Integer.parseInt(index);
						if(i < 0 || i > list.getCount()) {
							System.out.println("That's not a valid index, your value must fall within 0 and " + (list.getCount()-1) + ".");
							break;
						} else {
							list.removeAt(i);
							System.out.println("Item removed.");
							break;
						}
					}
				}
				else if(choice.equals("5")){
					System.out.println("The size of the list: " + list.getCount());
				}
				else if(choice.equals("6")){
					if(list.getCount() == 0){
						System.out.println("The list is empty.");
					} else {
						System.out.println("The contents of the list: ");
						list.printContents();
					}
				}
				else if(choice.equals("7")){
					if(list.getCount() == 0){
						System.out.println("There was nothing to clear.");
					} else {
						list.clear();
						System.out.println("List cleared.");
					}
				}
				else if(choice.equals("8")){
					System.exit(0);
				} else{
					System.out.println("Unrecognized choice.");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("We asked for an index, you provided a non-numeric value.");
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
