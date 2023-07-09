/* There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity
 of x, y, and z respectively. A single lab needs to be allocated to a class of ‘n’ students.
 The labs need to be utilized to the maximum i.e the number of systems used should not be minimal.
 Which lab needs to be allocated to this class?
        Input consists of 4 integers
        The first input denotes ‘x’, The second input denotes ‘y’, The third input denotes ‘z’,
        The fourth input denotes ‘n’
        Output format: Print the lab which is suitable for ‘n’ number of students.
 */
import java.util.Scanner;
class LabAllocation{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        int n=scanner.nextInt();

        while(true){
            n=n+1;
            if (n==x){
                System.out.println("L1");
                break;
            }
            if(n==y){
                System.out.println("L2");
                break;
            }
            if(n==z){
                System.out.println("L3");
                break;
            }
        }
    }
}