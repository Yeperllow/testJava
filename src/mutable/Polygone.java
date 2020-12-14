/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable;

/**
 *
 * @author cyril.bouyer
 */
public class Polygone {
    
    private Point[] tableauPoints; //tableau de points
    
    public Polygone (Point p1, Point p2, Point p3, Point...Pinf)
    {
        tableauPoints = new Point[Pinf.length+3];
        tableauPoints[0] = new Point (p1.getx(),p1.gety()); //ou P1
        tableauPoints[1] = new Point (p2.getx(),p2.gety());
        tableauPoints[2] = new Point (p3.getx(),p3.gety());
        
        for (int i=0;i<Pinf.length;++i)
        {
            tableauPoints[i+3]= new Point(Pinf[i].getx(),Pinf[i].gety());
        }
      }

    public Point[] getTableauPoints() {
        return tableauPoints;
    }

    public void setTableauPoints(Point[] tableauPoints) {
        this.tableauPoints = tableauPoints;
    }
    
    public void translation (double px, double py)
    {
        for (int i=0;i<tableauPoints.length;++i)
        {
            tableauPoints[i].translation(px, py);
        }
    }
    
    public void rotation (double ry)
    {
        for (int i=0; i<tableauPoints.length;++i)
        {
            tableauPoints[i].rotationOrig(ry);
        }
    }
    
    public void affichageStand()
    {
        for (int i=0;i<tableauPoints.length;++i)
        {
            tableauPoints[i].afficheStand();
        }
    }    
}
