import java.util.LinkedList;

/* This is the solution to Leetcode problem #2 which adding two linked lists.
 * where each linked list's nodes' values all together represents one whole number in reverse. 
 * ex: [2,4,3] in a linked list is integer 342
 * The resulting sum of the two linked list numbers will be placed in a linked list in reverse
 * order too.
 * There are 3 constraints to this problem:
 * -number of nodes in each linked list is in the range of 1-100
 * -0 <=Node.val <=9
 * -guaranteed that the list represents a number that does not have a leading zero
 */
public class SolutionTwoLeetcode{
   
    public static void main(String[] args){
        SolutionTwoLeetcode sol = new SolutionTwoLeetcode();
        //create LinkedList1 and add node with integer
        LinkedList<Integer> llist1= new LinkedList<>();
       /* test case 1
        llist1.add(2);
        llist1.add(4);
        llist1.add(3);
        */

        //test case 2
        //llist1.add(0);

        //test case 3
        llist1.add(9);
        llist1.add(9);
        llist1.add(9);
        llist1.add(9);
        llist1.add(9);
        llist1.add(9);
        llist1.add(9);


        //create LinkedList2 and add nodes with integer
        LinkedList<Integer> llist2 = new LinkedList<>();
        /* test case 1
        llist2.add(5);
        llist2.add(6);
        llist2.add(4);
        */
        
        //test case 2
        //llist2.add(0);

        //tet case 3 output is [8, 9, 9, 9, 0, 0, 0, 1]
        llist2.add(9);
        llist2.add(9);
        llist2.add(9);
        llist2.add(9);
    
        int ll1size = llist1.size(); //get size of LinkedList 1
        int ll2size = llist2.size(); //get size of LinkedList 2
        
        //get an integer from all the nodes in linked list 1
        int intLinkedL1 = sol.getNumber(llist1, ll1size);
        System.out.println("llist1 = "+intLinkedL1);
        
        //get an integer from all the values of each node in Linked List 2
        //each number of integer is added to LinkedList in reverse order
        int intLinkedL2 = sol.getNumber(llist2, ll2size);
        System.out.println("llist2 = "+ intLinkedL2); 

        //add the two integers from the linked list
        int resultingInt = intLinkedL1 + intLinkedL2;
        System.out.println("resultingInt="+resultingInt);  
        //take the sum of the integer from the 2 linkedlists and placed them in reverse order in a linkedlist
        sol.addIntToLinkedList(resultingInt);

    }

    /* getNumber method takes a linked list and its size and iterate through the linked list in
     * reverse order and each value of each node is appended to a string. Once all the values in 
     * the linked list is concatenated to the string, the string is converted into an integer. That
     * integer is returned.
     */
    public int getNumber(LinkedList llist, int llsize){
        int llnum=0;

        String tmpString ="";
        //retrieve each integer from linkedlist starting at the tail and adding it to a string
        for (int i=llsize-1; i>=0 ; i--){
            tmpString = tmpString+ llist.get(i).toString();
            //System.out.println(llist.get(i));

        }
        //convert string to an integer
        llnum = Integer.parseInt(tmpString);
        return llnum;
    }

    /* addIntToLinkedList method takes in an integer and converts it to a string in order
    * to look at each number in the integer individually.  It starts at the last char 
    * in the string then converts the char into an integer and placed it into a linked list.
    * Looking at the last char on the string and work it way backward is so that the final
    * linked list contains each number of final sum integer in reverse order.
    */
    public void addIntToLinkedList(int num){
        LinkedList<Integer> tmpll= new LinkedList<Integer>(); 
        String finString = Integer.toString(num);

        int llInt =0;  //temp integer to be added to LinkedList
        char tmpChar;

        //get the length of the string to loop through
        //start at the end of string and get each character in string and convert to integer and 
        //add to linkedlist 
        for(int i=(finString.length())-1; i>=0; i--){
            tmpChar = finString.charAt(i);
            llInt = Integer.parseInt(finString.valueOf(tmpChar));
            tmpll.add(llInt);
        }
        
        System.out.println("LinkedList of Sum of LinkedLists in reverse order is "+tmpll);
    }

    

}
