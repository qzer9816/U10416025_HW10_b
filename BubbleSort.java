//main method
  public static void main(String[] args) {
	//new Scanner
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter the number of Items:");
	int n = input.nextInt();
	//creating array variable
	int [] list = new int[n];
	
	System.out.print("Enter the numbers:");
	for(int i = 0;i < n;i++){
		list[i] = input.nextInt();
	}
	//sort
    bubbleSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
