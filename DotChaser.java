import java.util.*;

public class DotChaser {  
  /*
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // Linked List of Things
    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB and typeC Thing.
      if( count % N == 0 ) {
        list.add(new TypeA(45, 50, 'r'));
        list.add(new TypeB(55, 50, 'b'));
        list.add(new TypeC(50, 60, 'y'));
      }

      // Print out each thing.
      list.forAll(t -> System.out.println(t));
      System.out.println("done");
      System.out.flush();

      // Move each thing.
      list.forAll (t -> {
        t.maybeTurn();
        t.step();
      });
      count++;
    }
  }
}
