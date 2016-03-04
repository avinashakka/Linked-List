import java.util.Scanner;


public class LinkedList 
{
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		LinkedL list = new LinkedL();
		int input = 1;
		while(input > 0)
		{
			System.out.println(" Menu: 1:insert  2:delete  3: search  4:display  5:size  6:sort 0:exit");
			input = S.nextInt();
			switch(input)
			{
			case 1:System.out.println("Enter a number to insert:");
					int x = S.nextInt();
					list.add(x);
					break;
			
			case 2: System.out.println("Enter a integer that you want to delete: ");
			 		int y = S.nextInt();
			 		list.deleteFirstOccurance(y);
			 		break;
			 		
			case 3: System.out.println("Enter the element to search: ");
			        int z = S.nextInt();
			        System.out.println("The search for the element returned: "+ list.search(z));
			        break;
			        
			case 4: list.displayList();
					break;
			
			case 5: System.out.println("Current size of the list: "+list.size());
					break;
			
			case 6: list.sort();
					list.displayList();
					break;
					
			case 0:System.exit(0);
					break;
			
			default: list.displayList();
						break;
			}
			
		}
	}

}
