
public class DistanceAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        
        double disAB = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println(disAB);
	}

}
