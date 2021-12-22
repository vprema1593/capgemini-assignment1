abstract class Shape
{
abstract void draw();
}
class Line extends Shape
{
public void draw() {
System.out.println("this is a line");
}
}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("this is a rectangle");
}
}
class Cube extends Shape
{
public void draw()
{
System.out.println("this is a cube");
}
}
package shapes;
public class AbstractDemo
{
public static void main(String[] args)
{
Line l= new Line();
l.draw();
Rectangle r = new Rectangle();
r.draw();
Cube c = new Cube();
c.draw();
}
}

