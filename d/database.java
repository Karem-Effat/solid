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
public class database {
    private databasesql Mysql;
    public database (){
        this.Mysql = new databasesql();
    }
    public void connect () {
        this.Mysql.connect();
    }
    public void disconnect() {
        this.Mysql.disconnect();
    }
}
