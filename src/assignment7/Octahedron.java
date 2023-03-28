package assignment7;

import javax.media.j3d.GeometryArray;
import javax.media.j3d.IndexedTriangleArray;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

public class Octahedron extends IndexedTriangleArray {

    public Octahedron() {
        super(6, GeometryArray.COORDINATES, 24); // 6 vertices, 3*8 indice

        //Add the six coordinates
        setCoordinate(0,new Point3f(0,0,1));  
        setCoordinate(1,new Point3f(-1,0,0)); 
        setCoordinate(2,new Point3f(0,-1,0)); 
        setCoordinate(3,new Point3f(1,0,0));  
        setCoordinate(4,new Point3f(0,1,0));  
        setCoordinate(5,new Point3f(0,0,-1)); 
        
        //path to connect coordinates
        //Each 3-pair is one face of the octahedron
        int[] coords= {0,1,2, //Point 0 connects to Points 1 and 2 to make a triangle
        			   0,1,4,
        			   0,2,3,
        			   0,3,4,
        			   5,1,2,
        			   5,1,4,
        			   5,2,3,
        			   5,3,4};
        
        setCoordinateIndices(0,coords);
    
    }
}
