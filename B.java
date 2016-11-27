import java.util.Scanner;

public class B
{
public int n,search,arr[];
Scanner input = new Scanner(System.in);
public void arrLength()
{
System.out.print("\nEnter the length of array: ");
n = input.nextInt(); 
}

public void array()
{
System.out.print("\nEnter the element of array: ");
arr = new int[n];
for(int i = 0;i<arr.length;i++)
arr[i] = input.nextInt();
}

public void bSearch()
{
int start=0;
int end = n-1;
int mid = (start + end)/2;

//this.arr[];
System.out.print("\nEnter the searching element: ");
search = input.nextInt();

while(start <= end)
{
if(arr[mid]<search)
start = mid + 1;
else if(arr[mid]==search)
{
System.out.println("Searching elemnt "+search+" is found at index "+mid);
break;
}
else
end = mid - 1;

mid=(start + end)/2;
}
if(start > end)
System.out.println("Searching element "+search+" not found");
}
}
