import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //ArrayList<int> list = new ArrayList<int>();
        int[] list = { 72, 420, 230, 140, 350, 60, 12, 721, 311, 7};

        displayList(list); // write method to display list; this “call” will display unsorted

        selectionSort(list,list.length); // copy method from book

        displayList(list); // your method to display list; this “call” will display sorted

        System.out.println("Enter an integer to search for in the list ( 0 to 1000)");
        int searchItem = console.nextInt();


        if ( (binarySearch(list, list.length, searchItem)) == -1 ) // copy method from book
            System.out.println("Not Found in List");
        else
            System.out.println(searchItem + " found ! ");
    }

    public static void selectionSort(int[] list, int listLength)
    {
        int index;
        int smallestIndex;
        int minIndex;
        int temp;

        for (index = 0; index < listLength - 1; index++)
        {
            smallestIndex = index;

            for (minIndex = index + 1; minIndex < listLength;minIndex++)

                if(list[minIndex] < list[smallestIndex])
                    smallestIndex = minIndex;
            temp = list[smallestIndex];
            list[smallestIndex]= list[index];
            list[index]= temp;
        }
    }

    public static int binarySearch(int[]list, int listLength, int searchItem)
    {
        int first = 0;
        int last = listLength - 1;
        int mid = 0;
        boolean found =false;

        while(first <= last && !found)
        {
            mid = (first + last) / 2;

            if (list[mid]== searchItem)
                found = true;

            else if (list[mid]> searchItem)
                last = mid - 1;

            else
                first = mid + 1;
        }

            if (found)
                return mid;
            else
                return -1;
    }

        public static void displayList(int[]list)
        {
            System.out.print("Printing List: ");
            System.out.println(Arrays.toString(list));
        }
}
