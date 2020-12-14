/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable;

/**
 *
 * @author cyril.bouyer
 */
public class Point {
    
    private double x;
    private double y;
    private double rho;
    private double teta;
    
    private void Cartesienpolaire() { // Méthode privée
        rho = Math.sqrt(x*x+y*y) ; 
        teta = Math.atan2(y,x) ;
    }
    
     private void Polairecartesien() { // Méthode privée
        x= rho*Math.cos(teta); 
        y=rho*Math.sin(teta) ;
    }
    
    
    
    
    
    public Point() {   //construction par déaut
        x=0.0;
        y=0.0;
        rho=0;
        teta=0;
        }
    
    public Point(double cx, double cy) {    //Avec coordonnees cartesiennes
        cx=x;
        cy=y;
        Cartesienpolaire();
        //this(x,y,false); EN EXAMEEEEN !!!!!!!
    }
    
    public Point (double r, double t, boolean test) {    //PB : 2 construct, 2 param pareils
        rho=r;
        teta=t;
        Polairecartesien();
    }
    
    public double getx()
    {
        return x;
    }
    
    public double gety()
    {
        return y;
      
    }
    
    public double getrho()
    {
        return rho;
    }
    
    public double getteta()
    {
        return teta;
    }
    
   
    public void setx(double x)  //les setter ne renvoient rien !
    {
        this.x=x;
    }
    
    public void sety(double y)
    {
        this.y=y;
    }
    
    public void setrho (double r)
    {
        this.rho=r;
    }
    
    public void setteta (double t)
    {
        this.teta=t;
    }
    
    public void translation (double dx, double dy)
    {
        x=x+dx;
        y=y+dy;
    }
    
    public void rotationOrig (double dteta) //rotation : augmenter teta
    {
        teta+=dteta;
    }
    
    public void afficheStand()
    {
        System.out.println("x = "+x+" ,y= "+y+" ,rho = "+rho+ " ,teta= "+teta+" TERMINUS");
    }
    
    
    
            
    
}
