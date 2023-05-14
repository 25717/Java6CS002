package portfolio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * The code then filters the Football objects in the stream to keep only those with total points greater than or equal to 60 using the filter method
 * 
 * */

public class Code06 {

  public static void main(String[] args) {
    List<Football> footballList = new ArrayList<>();
    footballList.add(new Football(1, "Manchester City", 38, 27, 5, 6, 86, 83, 32, 51));
    footballList.add(new Football(2, "Manchester United", 38, 21, 11, 6, 74, 73, 44, 29));
    footballList.add(new Football(3, "Liverpool", 38, 20, 9, 9, 69, 68, 42, 26));
    footballList.add(new Football(4, "Chelsea", 38, 19, 10, 9, 67, 58, 36, 22));
    footballList.add(new Football(5, "Leicester", 38, 20, 6, 12, 66, 68, 50, 18));
    footballList.add(new Football(6, "West Ham", 38, 19, 8, 11, 65, 62, 47, 15));
    footballList.add(new Football(7, "Tottenham", 38, 18, 8, 12, 62, 68, 45, 23));
    footballList.add(new Football(8, "Arsenal", 38, 18, 7, 13, 61, 55, 39, 16));
    footballList.add(new Football(9, "Leeds", 38, 18, 5, 15, 59, 62, 54, 8));
    footballList.add(new Football(10, "Everton", 38, 17, 8, 13, 59, 47, 48, -1));
    
    // Using sequential stream
    System.out.println("Using Sequential Stream");
    Stream<Football> sequentialStream = footballList.stream();
    sequentialStream.filter(f -> f.getTotalPoints() >= 60).sorted((f1, f2) -> f2.getGoalsForward() - f1.getGoalsForward()).forEach(System.out::println);
    
  }
  
}