/**
 * This Main file implements a program where it is determined at which time a laser can hit a  missile
 * and at which position in degree coordinates x and y,
 * given certain conditions 
 */

public class Main
{
    public static void main(String []args) 
    { 
        final int CHARGE_TIME = 65; // the number of seconds required by the laser to charge before it may fire again
        final double MISSILE_INTERVAL = 43.635; // time taken by the missile to move 1 degree
        final double LASER_INTERVAL = 35; // time taken by the laser to move 1 degree
        int laserPosition = 90; // laser's position, at first the laser is positioned straight up and so initialised to 90 degrees
        int missilePosition = 0; // missile's position, the missile takes off from the ground so initialised to 0 degrees
        boolean isFired = false; // boolean value to see if the laser has fired in previous degree or not
        
        FiringSolution solution = new FiringSolution(); // a new FiringSolution object for basically displaying a firing solution
        
        // this iteration on the basis of degree is for calculating if the laser can reach a degree position before the missile and bring it down 
        for(int degree = 1; degree <= 179; degree++) 
        {
            Time launchTime = new Time (12,30); // a new Time object, for storing the launch time of the missile
            int reqLaserMove = Math.abs(laserPosition - degree); // movement required by the laser to point at a particular degree 
            int reqMissileMove = Math.abs(missilePosition - degree);// movement required by the laser to point at a particular degree 
            double radian = Math.toRadians(degree); // variable to store the converted value of degree to radian
            double horizontalMove = 5000*Math.cos(radian); // position in respect of x axis
            double verticalMove = 50*Math.sin(radian); // position in respect of y axis
            
            // setting the coordinates and degree in FiringSolution object
            solution.setX((horizontalMove));
            solution.setY(verticalMove);
            solution.setDegree(degree);
            
            if (isFired == false) // if the laser is not fired the previous time then the time is calculated and shown as solution
            {
                if((LASER_INTERVAL*reqLaserMove) < (MISSILE_INTERVAL*reqMissileMove)) 
                {
                    // setting up the current degree position as the initial degree position for the next calculation
                    laserPosition = degree;
                    missilePosition= degree;
                    isFired = true;
                    
                    launchTime.addSeconds(MISSILE_INTERVAL*degree);
                    solution.setTime(launchTime);
                    System.out.println(solution.toString());
                }
            }
            // if the laser was fired in previous degree position and the laser needs more time to charge, then just the coordinates are updated
            else if(CHARGE_TIME > (reqMissileMove*MISSILE_INTERVAL) && isFired == true) 
            {
                laserPosition = degree;
                missilePosition = degree;
                isFired = false;
            }
        }
    }
}


    
