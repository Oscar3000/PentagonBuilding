/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab5;

import java.util.ArrayList;
import java.util.List;


import eu.printingin3d.javascad.models.Cube;
import eu.printingin3d.javascad.models.Cylinder;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.tranzitions.Union;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.tranzitions.Difference;
/**
 *
 * @author Oscar
 */
public class Building extends Union  {
    private static final double BUILDING_WIDTH = 2700;
    private static final double BUILDING_HEIGHT = 500;
    private static final double BUILDING_DEPTH = 500;
    private static final double Coords_X = 0;
    private static final double Coords_Y = -100;
    private static final double Coords_Z = 300;
    private static final double Angle_Z = 90;
    
    
   public Building(){
        super(getModels());
    }
   
    private static List<Abstract3dModel> getModels(){
        List<Abstract3dModel> models = new ArrayList<>();
       models.addAll(sideBuild());
       models.add(frontBuild());
       models.add(FrontTower());
       models.addAll(cornerBuild());
       models.addAll(Gates());
       return models;
        
    }
    
    private static List<Abstract3dModel> SideBuilding(){
        double coords_x = 1100;
        int a =90;
        List<Abstract3dModel> build = new ArrayList();
        for(int i=0;i<2;i++){
            build.add(SideBuildingDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,500,Coords_Z)));
            a-=180;
            coords_x-=2200;
        }
        return build;
    }
        
    
     
  private static List<Abstract3dModel> CornerBuilding(){
       double coords_x = 540;
        int a = -45;
        List<Abstract3dModel> build = new ArrayList<>(); 
        for(int i=0; i<2;i++){
            build.add(CornerBuildingDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,1710,Coords_Z)));
            a+=90;
            coords_x -=1080;
        }
        
        return build;
    }
  
  private static List<Abstract3dModel> FrontBuildingCorridor(){
      double coords_y = 0;
      List<Abstract3dModel> build = new ArrayList<>();
      for(int i =0; i<2;i++){
          build.add(FrontBuildingCorridorDraw().move(new Coords3d(0,coords_y,Coords_Z+200)));
          coords_y -=200;
      }
      return build;
  }
  
  private static List<Abstract3dModel> SideBuildingCorridor(){
      double coords_x = 1000; double a = 90;
      List<Abstract3dModel> build = new ArrayList<>();
      for(int i =0; i<4;i++){
          if(i<=1){
             build.add(SideBuildingCorridorDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,Coords_Y+600,Coords_Z+200))); 
             coords_x +=200;
          }else{
              coords_x = -(200*i) - 600;
              build.add(SideBuildingCorridorDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,Coords_Y+600,Coords_Z+200)));
      }
    }
       return build;
  }
  
  private static List<Abstract3dModel> CornerWindow(){
      double coords_x = 1200, coords_y = 1400, a =45;
      List<Abstract3dModel> build = new ArrayList<>();
      for(int i=0;i<12;i++){
          if(i<=2){
          build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,coords_y,450)));
          coords_x-=200; coords_y+=200;
            }else if(i>2&&i<=5){
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,coords_y,450)));
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,coords_y,250)));
              coords_x-=200; coords_y+=200;  
            }else if(i>5&&i<=8){
                coords_x = (i*200) - 2300; coords_y = (i*200) + 300;
                build.add(WindowDraw().rotate(new Angles3d(0,0,a+90)).move(new Coords3d(coords_x,coords_y,450)));
            }else if(i>8&&i<=11){
                coords_x = (i*200) - 2300; coords_y = (i*200) + 300;
                build.add(WindowDraw().rotate(new Angles3d(0,0,a+90)).move(new Coords3d(coords_x,coords_y,450)));
                build.add(WindowDraw().rotate(new Angles3d(0,0,a+90)).move(new Coords3d(coords_x,coords_y,250)));
            }
      }
      return build;
  }
  
  private static List<Abstract3dModel> SideWindow(){
      double coords_y = 1100; double a =90;
      List<Abstract3dModel> build = new ArrayList<>();
      for(int i=0;i<16;i++){
          if(i<=4){
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(Coords_X+1400,coords_y,Coords_Z+150)));
              coords_y -= 200;
          }else if(i>4&&i<=9){
              coords_y = 2100-(200*i); 
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(-(Coords_X+1400),coords_y,Coords_Z+150)));
          }else if(i>9&&i<=12){
              coords_y = (200*i) - 1300;
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(Coords_X+1400,coords_y,Coords_Z-100)));
          }else{
              coords_y = (200*i)-1900;
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(-(Coords_X+1400),coords_y,Coords_Z-100)));
          }
      }
      return build;
  }
  
  private static List<Abstract3dModel> FrontWindow(){
      double coords_x = -1100, a =90, coords_y = 100;
      List<Abstract3dModel> build = new ArrayList<>();
      for(int i=0;i<20;i++){
          if(i<12){
          build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,Coords_Y-250,Coords_Z+150)));
          coords_x+=200;
         }else if(i>=12 && i<16){
             coords_x = (i*200) - 3500;
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,Coords_Y-250,Coords_Z-100)));
          }else{
             coords_x = (i*200) - 2700;
              build.add(WindowDraw().rotate(new Angles3d(0,0,a)).move(new Coords3d(coords_x,Coords_Y-250,Coords_Z-100)));
         }
      }
      
      return build;
  }
  
  private static Difference frontBuild(){
      Difference FrontBuild;
      List<Abstract3dModel> frontModels = new ArrayList<>();
      Abstract3dModel model = FrontBuilding();
       for(int i =0; i<2;i++){
           frontModels.add(FrontBuildingCorridor().get(i));
       }
       for(int i=0;i<20;i++){
           frontModels.add(FrontWindow().get(i));
       }
       frontModels.add(Door().rotate(new Angles3d(0,90,0)).move(new Coords3d(1360,60,130)));
       frontModels.add(Door().rotate(new Angles3d(0,90,0)).move(new Coords3d(-1360,60,130)));
       frontModels.add(Door().rotate(new Angles3d(90,90,0)).move(new Coords3d(0,-370,130)));
       FrontBuild = new Difference(model,frontModels);
      return FrontBuild;
  }
  
  private static List<Abstract3dModel> sideBuild(){
      Difference SideBuild ;
       List<Abstract3dModel> sideModels = new ArrayList<>();
       List<Abstract3dModel> models = new ArrayList<>();
        int j =0, k=0, r=10;
       for(Abstract3dModel model: SideBuilding() ){
           for(int i =0; i <2; i++){
                if(i==0&& j<=0){
                  sideModels.add(Door().rotate(new Angles3d(0,90,0)).move(new Coords3d(1360,60,130)));
                }else{
                  sideModels.add(Door().rotate(new Angles3d(0,90,0)).move(new Coords3d(-1360,60,130)));  
                }
                  sideModels.add(SideBuildingCorridor().get(j));
                  j++;
           }
           for(int i =0; i<5; i++){
               sideModels.add(SideWindow().get(k));
               k++;
           }
           for(int i=0; i<3; i++){
               sideModels.add(SideWindow().get(r));
               r++;
           }
           SideBuild = new Difference(model,sideModels);
           models.add(SideBuild);
           sideModels.clear();
       }
       return models;
  }
  
  private static List<Abstract3dModel> cornerBuild(){
      Difference CornerBuild;
      List<Abstract3dModel> models = new ArrayList<>();
      List<Abstract3dModel> cornerModels = new ArrayList<>();
      int j =0;
      for(Abstract3dModel model:CornerBuilding()){
         for(int i=0; i<9; i++){
             if(i==0&&j<=0){
              cornerModels.add(Door().rotate(new Angles3d(0,90,45)).move(new Coords3d(1020,1580,130)));
             }else{
               cornerModels.add(Door().rotate(new Angles3d(0,90,135)).move(new Coords3d(-1040,1560,130)));   
             }
             cornerModels.add(CornerWindow().get(j));
             j++;
         }
         CornerBuild = new Difference(model,cornerModels);
         models.add(CornerBuild);
         cornerModels.clear();
       }
      return models;
  }
  
  private static List<Abstract3dModel> Gates(){
      List<Abstract3dModel> build = new ArrayList<>();
      build.add(Gate().rotate(Angles3d.ZERO).move(new Coords3d(100,-300,0)));
      build.add(Gate().rotate(new Angles3d(0,0,45)).move(new Coords3d(400,400,0)));
      build.add(Gate().rotate(new Angles3d(0,0,135)).move(new Coords3d(100,1000,0)));
      build.add(Gate().rotate(new Angles3d(0,0,180)).move(new Coords3d(-150,500,0)));
      build.add(Gate().rotate(new Angles3d(0,0,270)).move(new Coords3d(-400,900,0)));
      return build;
  }
  
    private static Abstract3dModel FrontBuilding(){
        return new Cube(new Dims3d(BUILDING_WIDTH,BUILDING_HEIGHT,BUILDING_DEPTH)).move(new Coords3d(Coords_X,Coords_Y,Coords_Z));
    }
    private static Abstract3dModel SideBuildingDraw(){
        return new Cube(new Dims3d(BUILDING_WIDTH-1200,BUILDING_HEIGHT,BUILDING_DEPTH));
    }
    private static Abstract3dModel CornerBuildingDraw(){
        return new Cube(new Dims3d(BUILDING_WIDTH-920,BUILDING_HEIGHT,BUILDING_DEPTH));
    }
    private static Abstract3dModel FrontTower(){
        return new Cylinder(550,90).move(new Coords3d(0,2500,Coords_Z));
    }
    private static Abstract3dModel FrontBuildingCorridorDraw(){
        return new Cube(new Dims3d(BUILDING_WIDTH-1200,BUILDING_HEIGHT-400,BUILDING_DEPTH-200));
    }
    private static Abstract3dModel SideBuildingCorridorDraw(){
        return new Cube(new Dims3d(BUILDING_WIDTH-1500,BUILDING_HEIGHT-400,BUILDING_DEPTH-200));
    }
    private static Abstract3dModel WindowDraw(){
        return new Cube(new Dims3d(BUILDING_WIDTH-2610,BUILDING_HEIGHT-350,BUILDING_DEPTH-400));
    }
    private static Abstract3dModel Door(){
        return new Cube(new Dims3d(200,150,100));
    }
    private static Abstract3dModel Gate(){
        List<Abstract3dModel> models = new ArrayList<>();
        models.add(new Cube(new Dims3d(BUILDING_WIDTH-2000,BUILDING_HEIGHT,BUILDING_DEPTH-400)).rotate(new Angles3d(0,0,90)).move(new Coords3d(1300,400,300)));
        models.add(new Cylinder(500,40).rotate(new Angles3d(0,90,90)).move(new Coords3d(1550,400,300)));
        models.add(new Cylinder(300,25).rotate(new Angles3d(0,0,90)).move(new Coords3d(1550,200,150)));
        models.add(new Cylinder(300,25).rotate(new Angles3d(0,0,90)).move(new Coords3d(1550,600,150)));
        Union gatePro = new Union(models);
        return gatePro;
    }
}
