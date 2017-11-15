/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Mobilia;
import cgd.GDMobilia;
import java.util.List;

/**
 *
 * @author reida
 */
public class GTMobilia {
    GDMobilia gdMobilia;

    public GTMobilia() {
        gdMobilia = new GDMobilia();
    }
    
    public List obterMobilias(){
        return gdMobilia.consultar(Mobilia.class);
    }
    
}
