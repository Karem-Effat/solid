/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Kareem.Kamel
 */
public interface shape{
  public double calculateArea();

    double areaclc();
}
 
public class rec implements shape{
  double length;
  double width;
  public double calculateArea(){
    return length * width;
  }
}
 
public class circle implements shape{
  public double radius;
  public double calculateArea(){
    return pi*radius*radius;
  }
}