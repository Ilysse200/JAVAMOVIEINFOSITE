/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 25078
 */
public class operationModel implements Serializable{
    private int movieId;
    private String serial_Num;
    private String movieName;
    private String director;
    private String ProdCompany;
    private String site;
    
    //constructor with no arguments

    public operationModel() {
    }
    //constructor with one argument

    public operationModel(int movieId) {
        this.movieId = movieId;
    }
    //constructor with all arguments

    public operationModel(int movieId, String serial_Num, String movieName, String director, String ProdCompany, String site) {
        this.movieId = movieId;
        this.serial_Num = serial_Num;
        this.movieName = movieName;
        this.director = director;
        this.ProdCompany = ProdCompany;
        this.site = site;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getSerial_Num() {
        return serial_Num;
    }

    public void setSerial_Num(String serial_Num) {
        this.serial_Num = serial_Num;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProdCompany() {
        return ProdCompany;
    }

    public void setProdCompany(String ProdCompany) {
        this.ProdCompany = ProdCompany;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }  
}