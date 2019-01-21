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
public class book implements bookshow {
    private int num_pages;
    private String author;
    
    public book(String author ,int num_pages) {
        this.author= author ;
        this.num_pages = num_pages;
    }
    //getter and satter
    public int getnum_pages(){
        return num_pages;
    }
    public void setnum_pages(int num_pages){
        this.num_pages = num_pages;
    }
      public String getauthor(){
        return author;
    }
    public void setather(String author){
        this.author = author;
    }
    @Override
     public void print(){
         System.out.println("print");
     }
     
    @Override
     public void save(){
         System.out.println("save");
     }
    @Override
    public String toString(){
        return author + num_pages;
    }
}
