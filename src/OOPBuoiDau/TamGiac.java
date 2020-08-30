/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPBuoiDau;

/**
 *
 * @author tuandung
 */
public class TamGiac {
    public int canhA;
    
    public void setCanhA(int canhA){
        this.canhA= canhA;
    }
    public TamGiac(int canhA){
        this.canhA= canhA;
    }
    public int tinhchuvi(){
        return this.canhA+this.canhA+this.canhA;
    }
}
    
