/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Kareem.Kamel
 */
public class manage {
    private manageint manager;
    public void setmanageint(manageint manager){
        this.manager = manager;
    }
    public void manage(){
        manager.work();
        manager.takebraek();
    }
}
