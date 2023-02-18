/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localizarePoligonConvex;

/**
 *
 * @author baq
 */
public class Puncte {
    
    public int x;
    public int y;
    int cadran;
    
    
    public Puncte(int x,int y){
        
        this.x=x;
        this.y=y;
        
    }
    
    public void calculeazaCadran(){
        
        if(x>0){
            if(y>0)cadran=1;
        }
        if(x>=0)
            if(y<0)cadran=4;
        if(x<0)
            if(y<=0)cadran=3;
        if(x<=0)
            if(y<0)cadran=2;
        
    }
    
    public int getCadran(){
        
        return cadran;
        
    }
    
    
    public int getX(){
        
        return x;
        
    }
    
    public int getY(){
        
        return y;
        
    }
    
    
    
}
