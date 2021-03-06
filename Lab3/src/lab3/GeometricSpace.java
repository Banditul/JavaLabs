package lab3;

import java.util.LinkedList;

public class GeometricSpace extends GeometricPlane {
	GeometricSpace(LinkedList<Point> v1) {
		super(v1);
	}

	//members
	public static Point3D[] points3d;
	
	//public functions
	public static Point3D GetCenter()
	{
		if(points3d == null)
			return null;
		if(points3d.length == 0)
			return null;
		
		Point3D p = new Point3D(0,0,0);
		for(int i=0;i<points3d.length;i++)
		{
			p.setX( points3d[i].getX() + p.getX() );
			p.setY( points3d[i].getY() + p.getY() );
			p.setZ( points3d[i].getZ() + p.getZ() );
		}
		p.setX( p.getX() / points3d.length );
		p.setY( p.getY() / points3d.length );
		p.setZ( p.getZ() / points3d.length );
		
		return p;
	}
}
