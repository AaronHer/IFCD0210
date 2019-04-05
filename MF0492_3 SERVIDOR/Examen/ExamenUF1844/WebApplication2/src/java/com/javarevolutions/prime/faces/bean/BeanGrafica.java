/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.prime.faces.bean;

import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author User
 */
@ManageBean(name="beanGrafica")
public class BeanGrafica {
    
    private PieChartModel model;

   
    
    public BeanGrafica(){
        llenaModelo();
    }
    
    private void llenaModelo(){
    
         model = new PieChartModel();
         
         model.set("Me gusta", 900);
         model.set("No me gusta", 100);
         model.set("Me super agrada", 1000);
         model.set("Lo recomiendo", 300);
    }
    
     public PieChartModel getModel() {
        return model;
    }

    public void setModel(PieChartModel model) {
        this.model = model;
    }
    
}

