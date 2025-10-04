import java.util.*;
import java.util.Random;

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
    Random rand = new Random(System.currentTimeMillis());
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB and typeC Thing.
      if( count % N == 0 ) {
        list.addThing(new TypeA(45, 50, 'r'));
        list.addThing(new TypeB(55, 50, 'b'));
        list.addThing(new TypeC(50, 60, 'y'));
      }

      // Print out each thing.
      list.printAll();

      // Move each thing.
      list.moveAll(rand);
      count++;
    }
  }
}
