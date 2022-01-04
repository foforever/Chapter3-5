
public class E5_26 {

	public static void main(String[] args) {
		double e = 1.0, item = 1.0;
		for(int i = 1;i <= 100000;i++)
        {
            item /= i;
            e += item;
            if(i % 10000 == 0)
                System.out.println("µ± i = " + i + "£¬e= " + e);

        }

	}

}
