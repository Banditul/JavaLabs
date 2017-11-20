package lab3;
import java.util.*;
public class GeometricPlane {
	
	//members
	public Point[] points;
	
	//public functions
	GeometricPlane(Vector<Point> v1){
		System.arraycopy(v1, 0, points, 0, v1.size());
	}
	public Point GetCenter()
	{
		if (points == null)
			return null;
		if (points.length == 0)
			return null;
		
		Point p = new Point(0,0);
		for(int i=0;i<points.length;i++)
		{
			p.setX( points[i].getX() + p.getX() );
			p.setY( points[i].getY() + p.getY() );
		}
		p.setX( p.getX() / points.length );
		p.setY( p.getY() / points.length );
		
		return p;
	}	
	
	public Point Rotate(Point p1, double angle) {
		p1.setX((int)(GetCenter().getX() + (p1.getX() * Math.cos(angle) - p1.getY() * Math.sin(angle))));
		p1.setY((int)(GetCenter().getX() + (p1.getX() * Math.sin(angle) + p1.getY() * Math.cos(angle))));
		return p1;
		
	}
	public Point Shift(Point p1,int dx, int dy) {
		
		p1.setX(p1.getX() + dx);
		p1.setY(p1.getY() + dy);
		
		return p1;
	}
	//etc
}