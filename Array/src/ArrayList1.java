import java.util.*;
public class ArrayList1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		System.out.println("Lines");
		int lines=sc.nextInt();
		for (int i=1;i<=lines ;i++ )
		{
		    int arr=sc.nextInt();
		    ArrayList<Integer> a=new ArrayList<Integer>();
		    for (int j=0;j<arr ;j++ )
		    {
		        int k=sc.nextInt();
		        a.add(k);
		    }
		    lists.add(a);
		}
		System.out.println("Enter");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Integer> a = lists.get(x-1);
            if (y <= a.size()) {
                System.out.println(a.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
	}
}
