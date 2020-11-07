/**
 * Class for Firing Solution
 * ADT Implmentation
 * Implementation for Firing Solution
 */

import java.text.DecimalFormat;

public class FiringSolution implements FiringSolutionInterface
{
 private static final DecimalFormat FMT=new DecimalFormat("###0.000");

 private Time time;
 private int degree;
 private double x;
 private double y;

 public void setTime(Time t) 
 {
  this.time = t;
 }

 public Time getTime() 
 {
  return this.time;
 }

 public void setDegree(int d) 
 {
  this.degree = d;
 }

 public int getDegree() 
 {
  return this.degree;
 }

 public void setX(double x) 
 {
  this.x = x;
 }

 public double getX() 
 {
  return this.x;
 }

 public void setY(double y) 
 {
  this.y = y;
 }

 public double getY() 
 {
  return this.y;
 }

 /**
  * Prints time and degree coordinates upto three decimal digits
  */
 public String toString() {
  return "At time " + time + ", fire at " + degree + 
    " degrees to impact missile at (" + FMT.format(x) + ", " + FMT.format(y) + ")";
 }  
}