/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab5;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;


/**
 *
 * @author Oscar
 */
/**
	 * @param args
	 * @throws IOException 
	 * @throws IllegalValueException 
	 */
public class Main {
    
    public static void main(String[] args) throws IllegalValueException, IOException{
          new SaveScadFiles(new File("G:/OpenSCAD-2015.03-2-x86-64/lab5")).
				addModel("building.scad", new Building()).
				saveScadFiles();   
    }
}
