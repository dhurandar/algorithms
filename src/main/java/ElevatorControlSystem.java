import java.util.*;

/**
 *
 * Design and implement an elevator control system. What data structures, interfaces and algorithms will you need?
 * Your elevator control system should be able to handle a few elevators — up to 16.

 You can use the language of your choice to implement an elevator control system.
 In the end, your control system should provide an interface for:

 Querying the state of the elevators (what floor are they on and where they are going),
 receiving an update about the status of an elevator,
 receiving a pickup request,
 time-stepping the simulation.
 For example, we could imagine in Scala an interface like this:

 trait ElevatorControlSystem {
 def status(): Seq[(Int, Int, Int)]
 def update(Int, Int, Int)
 def pickup(Int, Int)
 def step()
 }
 Here we have chosen to represent elevator state as 3 integers:

 Elevator ID, Floor Number, Goal Floor Number

 A pickup request is two integers:

 Pickup Floor, Direction (negative for down, positive for up)

 This is not a particularly nice interface, and leaves some questions open.
 For example, the elevator state only has one goal floor; but it is conceivable
 that an elevator holds more than one person, and each person wants to go to a
 different floor, so there could be a few goal floors queued up.
 Please feel free to improve upon this interface!

 The most interesting part of this challenge is the scheduling problem.
 The simplest implementation would be to serve requests in FCFS (first-come, first-served) order.
 This is clearly bad; imagine riding such an elevator!
 Please discuss how your algorithm improves on FCFS in your write-up.

 Please provide a source tarball containing code in the language of your choice,
 as well as a README discussing your solution (and providing build instructions).
 The accompanying documentation is an important part of your submission. It counts to show your work.

 Good luck!

 * Created by rsingh13.
 *
 */
public class ElevatorControlSystem {



    private final int maxElevators=16;

    private final int maxfloors = 50;

    private Map<Integer,Elevator> elevators = new HashMap<Integer,Elevator>(  );

   /**
    * No of people who wants to go up from the current floor , for a given floor
    */
   private int[] up = new int[maxfloors];

   /**
    * No of people who wants to go up from the current floor , for a given floor
    */
   private int[] down = new int[maxfloors];


   private enum Direction{UP,DOWN};

    class Status{
        int elevatorID=-1;
        int floor=-1;
        int goalfloor=-1;
    }

    class Elevator {
        private int occupants;
        private int[] occupantsPerFloor;
        private Status status = new Status();
        private int ID ;

        Elevator() {
            occupantsPerFloor = new int[maxfloors];
        }

        private boolean addOccupantsForFloor(int floor, int noOfOccupants) {
            occupantsPerFloor[floor] = noOfOccupants;
            return false;
        }

        private boolean updateStatus(int goal) {
            //TODO validate the floors and check for current max and set the goal as the max
            if(status.goalfloor < goal) {
                status.goalfloor = goal;
                return true;
            }
            return false;
        }
    }

   public Status status(int elevatorID) {
        return elevators.get( elevatorID ).status;

   }

   public int update(Status status) {

        return 0;
   }

   public void pickup(Direction direction, int floor){

   }

   public void step() {

   }

   public static void main(String[] args) {

   }


}
