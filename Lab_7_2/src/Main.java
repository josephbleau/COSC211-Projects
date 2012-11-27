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
			System.out.println("3. Print the size of the list.");
			System.out.println("4. Print the contents of the list.");
			System.out.println("5. Clear the list. ");
			System.out.println("6. Exit. ");
			System.out.print("> ");
			
			try {
				String choice = input.readLine();
				if(choice.equals("1")) {
					System.out.print("Add a value to the list: ");
					String value = input.readLine();
					list.insert(new Node<String>(value, null));
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
				else if(choice.equals("3")){
					System.out.println("The size of the list: " + list.getCount());
				}
				else if(choice.equals("4")){
					if(list.getCount() == 0){
						System.out.println("The list is empty.");
					} else {
						System.out.println("The contents of the list: ");
						list.printContents();
					}
				}
				else if(choice.equals("5")){
					if(list.getCount() == 0){
						System.out.println("There was nothing to clear.");
					} else {
						list.clear();
						System.out.println("List cleared.");
					}
				}
				else if(choice.equals("6")){
					System.exit(0);
				} else{
					System.out.println("Unrecognized choice.");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
