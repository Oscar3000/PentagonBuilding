$fs=0.25;$fa=6;
union() {
difference(){translate([1100,500,300])rotate([0,0,90])cube([1500,500,500],center=true);
translate([1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([1000,500,500])rotate([0,0,90])cube([1200,100,300],center=true);
translate([-1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([1200,500,500])rotate([0,0,90])cube([1200,100,300],center=true);
translate([1400,1100,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,900,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,700,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,500,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,300,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,700,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,900,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([1400,1100,200])rotate([0,0,90])cube([90,150,100],center=true);
}difference(){translate([-1100,500,300])rotate([0,0,-90])cube([1500,500,500],center=true);
translate([-1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([-1000,500,500])rotate([0,0,90])cube([1200,100,300],center=true);
translate([-1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([-1200,500,500])rotate([0,0,90])cube([1200,100,300],center=true);
translate([-1400,1100,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,900,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,700,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,500,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,300,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,700,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,900,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1400,1100,200])rotate([0,0,90])cube([90,150,100],center=true);
}difference(){translate([0,-100,300])cube([2700,500,500],center=true);
translate([0,0,500])cube([1500,100,300],center=true);
translate([0,-200,500])cube([1500,100,300],center=true);
translate([-1100,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-900,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-700,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-500,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-300,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-100,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([100,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([300,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([500,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([700,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([900,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([1100,-350,450])rotate([0,0,90])cube([90,150,100],center=true);
translate([-1100,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([-900,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([-700,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([-500,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([500,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([700,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([900,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([1100,-350,200])rotate([0,0,90])cube([90,150,100],center=true);
translate([1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([-1360,60,130])rotate([-180,90,180])cube([200,150,100],center=true);
translate([0,-370,130])rotate([-90,90,180])cube([200,150,100],center=true);
}translate([0,2500,300])cylinder(h=550, r=90, center=true);
difference(){translate([540,1710,300])rotate([0,0,-45])cube([1780,500,500],center=true);
translate([1020,1580,130])rotate([135,90,180])cube([200,150,100],center=true);
translate([1200,1400,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([1000,1600,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([800,1800,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([600,2000,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([600,2000,250])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([400,2200,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([400,2200,250])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([200,2400,450])rotate([0,0,45])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([200,2400,250])rotate([0,0,45])cube([90,150,100],center=true);
}difference(){translate([-540,1710,300])rotate([0,0,45])cube([1780,500,500],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-1100,1500,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-900,1700,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-700,1900,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-500,2100,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-500,2100,250])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-300,2300,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-300,2300,250])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-100,2500,450])rotate([0,0,135])cube([90,150,100],center=true);
translate([-1040,1560,130])rotate([45,90,180])cube([200,150,100],center=true);
translate([-100,2500,250])rotate([0,0,135])cube([90,150,100],center=true);
}translate([100,-300,0])union() {
translate([1300,400,300])rotate([0,0,90])cube([700,500,100],center=true);
translate([1550,400,300])rotate([90,90,180])cylinder(h=500, r=40, center=true);
translate([1550,200,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
translate([1550,600,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
}
translate([400,400,0])rotate([0,0,45])union() {
translate([1300,400,300])rotate([0,0,90])cube([700,500,100],center=true);
translate([1550,400,300])rotate([90,90,180])cylinder(h=500, r=40, center=true);
translate([1550,200,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
translate([1550,600,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
}
translate([100,1000,0])rotate([0,0,135])union() {
translate([1300,400,300])rotate([0,0,90])cube([700,500,100],center=true);
translate([1550,400,300])rotate([90,90,180])cylinder(h=500, r=40, center=true);
translate([1550,200,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
translate([1550,600,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
}
translate([-150,500,0])rotate([0,0,180])union() {
translate([1300,400,300])rotate([0,0,90])cube([700,500,100],center=true);
translate([1550,400,300])rotate([90,90,180])cylinder(h=500, r=40, center=true);
translate([1550,200,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
translate([1550,600,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
}
translate([-400,900,0])rotate([0,0,-90])union() {
translate([1300,400,300])rotate([0,0,90])cube([700,500,100],center=true);
translate([1550,400,300])rotate([90,90,180])cylinder(h=500, r=40, center=true);
translate([1550,200,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
translate([1550,600,150])rotate([0,0,90])cylinder(h=300, r=25, center=true);
}
}
