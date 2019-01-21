/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;
import java.lang.Math.*;
import static java.lang.Math.PI;
/**
 *
 * @author Kareem.Kamel
 */
public interface shape{
  public double areaclc();
}
 
public class rec implements shape{
  double length;
  double width;
  public double areaclc(){
    return length * width;
  }
}
 
public class circle implements shape{
  public double radius;
  public double areaclc(){
    return PI*radius*radius;
  }
}