package Collections;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		QueueImplementationUsingArrayList ob1 = new QueueImplementationUsingArrayList();
		Scanner sn = new Scanner(System.in);
		String option;
		do {
			System.out.println("\n------------------------");
			System.out.println("1) To insert an element");
			System.out.println("2) To delete an element");
			System.out.println("3) To display front of the queue");
			System.out.println("4) To display all elements");
			System.out.println("5) To check whether the Queue is empty");
			System.out.println("6) To search an item");
			System.out.println("7) Frequency of an element");
			System.out.println("8) Size of the Queue");
			System.out.println("9) Exit");
			System.out.println("------------------------");
			System.out.println("Enter an option..");
			option = sn.nextLine();
			switch (option) {
			case "1":
				System.out.print("-> Enter the element : ");
				ob1.addElement(sn.nextLine());
				break;
			case "2":
				Object result = ob1.removeElement();
				if (result != null)
					System.out.print("-> Removed element : " + result);
				else
					System.out.print("-> Queue is empty");
				break;
			case "3":
				System.out.print(ob1.display(0));
				break;
			case "4":
				for (int i = 0; i < ob1.size(); i++)
					System.out.print(ob1.display(i) + " ");
				break;
			case "5":
				System.out.print("-> Queue is " + ob1.empty());
				break;
			case "6":
				System.out.println("-> Enter the element : ");
				int position = ob1.search(sn.nextLine());
				if (position >= 0)
					System.out.print(position);
				else
					System.out.print("~~ No such element ~~");
				break;
			case "7":
				System.out.print("-> Enter the element : ");
				Object ele = sn.nextLine();
				System.out.print("Frequency : " + ob1.frequency(ele));
				break;
			case "8":
				System.out.print(ob1.size());
				break;
			case "9":
				System.out.print("~~ Thank you ~~");
				break;
			default:
				System.out.print("~~ Invalid choice !! ~~");
			}

		} while (!option.equals("9"));
		sn.close();
	}

}
