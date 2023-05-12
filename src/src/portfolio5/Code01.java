package portfolio5;
import java.util.Arrays;
import java.util.List;


public class Code01 {
	  public static void main(String[] args) {
	    List<Football> table = Arrays.asList(
	        new Football(1, "Manchester City FC", 22, 16, 1, 5, 621, 400, 221, 75, 41,
	            8, 2, 76),
	        new Football(2, "Barcelona FC", 22, 16, 0, 6, 625, 414, 211, 72, 43, 9, 2, 75),
	        new Football(3, "Juventus FC", 22, 15, 1, 6, 453, 421, 32, 37, 39, 4,
	            2, 68),
	        new Football(4, "Bayern Munich FC", 22, 14, 1, 7, 664, 418, 246, 70, 40, 5, 5, 68),
	        new Football(5, "Tottenham Hotspurs FC", 22, 14, 0, 8, 663, 437, 226, 70, 46, 5, 7,
	            68),
	        new Football(6, "Lyon FC", 22, 11, 2, 9, 672, 527, 145, 77, 54, 9, 4, 61),
	        new Football(7, "Porto FC", 22, 11, 0, 11, 497, 482, 15, 62, 54, 6, 4,
	            54),
	        new Football(8, "Liverpool FC", 22, 10, 0, 12, 444, 514, -70, 45, 50, 4, 5,
	            49),
	        new Football(9, "Inter Milan FC", 22, 9, 1, 12, 553, 575, -22, 53, 61, 4, 6,
	            48),
	        new Football(10, "Chelsea FC", 22, 7, 1, 14, 442, 578, -136, 46, 57, 4, 6,
	            40),
	        new Football(11, "PSG FC", 22, 5, 1, 16, 475, 545, -70, 57, 61,
	            4, 8, 34),
	        new Football(12, "Real Madrid FC", 22, 0, 0, 22, 223, 1021, -798, 29, 147, 1,
	            0, 1));

	     table.forEach(x -> System.out.println(x));
	  }

	}

