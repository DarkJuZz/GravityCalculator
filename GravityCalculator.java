public class GravityCalculator {

        public static void main(String[] arguments) {
            double gravity = -9.81; // Earth's gravity in m/s^2
            double initialVelocity = 0.0;
            double fallingTime = 10.0;
            double initialPosition = 0.0;
            double finalPosition = 0.0;
            System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");

            //The object's position after 10.0 seconds is 0.0 m.
            //Process finished with exit code 0

            //SOLUTION:
            //In this sample we will need to use an equation to determine the final position of the object:
            //x(t) = 0.5 × a × t2 + vi × t + xi,

            //where
            //a – gravity = acceleration
            //t – time
            //vi – initial velocity
            //xi – initial position

            //With our variables:
            //Variables
            // double gravity = -9.81; // Earth's gravity in m/s^2
            //double initialVelocity = 0.0;
            //double fallingTime = 10.0;
            //double initialPosition = 0.0;
            //double finalPosition = 0.0;
            //System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");

            //Given these variables, our equation will look as following:
            //finalPosition = 0.5*gravity*fallingTime*fallingTime
            //                     +initialVelocity*fallingTime + initialPosition;


    }

}

