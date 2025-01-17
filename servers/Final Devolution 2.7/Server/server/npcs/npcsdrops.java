package server.npcs;

import java.io.*;
import server.players.*;
import server.util.*;
import server.*;
//import server.players.Quests.*;

public class npcsdrops {

public static int[][] drops = {

//man
{1, 526, 1, 0}, {1, 995, 1200+ misc.random(1300), 91}, {1, 995 ,200 + misc.random(300), 20},{1, 995 , 100 + misc.random(199), 10}, {1, 884 , 120 + misc.random(130), 90},
{2, 526, 1, 0}, {2, 995, 120, 6}, {2, 1019, 1, 3},
{2, 775, 1, 4}, {2, 1837, 1, 4},


//wizards (13)
{13, 526, 1, 0}, {13, 995, 100 + misc.random(200), 6}, {13, 554, 5 + misc.random(45), 80},{13, 556, 5 + misc.random(25), 60},
{13, 558, 5 + misc.random(25), 70},

{112, 532, 1, 0}, {112, 995, 12000+ misc.random(13000), 91}, {112, 995 ,2000 + misc.random(3000), 20},{112, 995 , 1000 + misc.random(1990), 10}, {112, 886 , 1200 + misc.random(1300), 90},

//woman
{6, 526, 1, 0}, {6, 995, misc.random(10), 3}, {6, 1731, 1, 12},

//pirates
{183, 526, 1, 0}, {183, 995, misc.random(200), 5}, {183, 2651, 1, 20}, {183, 7114, 1, 25},
{185, 526, 1, 0}, {185, 995, misc.random(200), 5}, {185, 2997, 1, 25}, {185, 7114, 1, 25},

//wolfves
{1030, 526, 1, 0}, {1030, 995, misc.random(140), 3}, {1030, 958, 1, 2},
{1033, 526, 1, 0}, {1033, 995, misc.random(140), 3}, {1033, 958, 1, 2},

//Zombie
{73, 526, 1, 0}, {73, 995, misc.random(1100), 2}, {73, 1351, 1, 5}, {73, 1359, 1, 95},

//wild dog
{1593, 526, 1, 0}, 

//guard
{9, 526, 1, 0}, {9, 995, 5000 +misc.random(5000), 70}, {9, 886, 100+misc.random(400), 60},

//paladin
{20, 526, 1, 0}, {20, 995, misc.random(210), 5}, {20, 4131, 1, 50},

//hero
{21, 526, 1, 0}, {21, 995, misc.random(180), 3}, {21, 1319, 1, 45}, {21, 1333, 1, 40},

//shade
{425, 526, 1, 0}, {425, 995, misc.random(150), 3}, {425, 6106, 1, 90}, {425, 6107, 1, 90}, {425, 6108, 1, 90}, {425, 6109, 1, 90}, {425, 6110, 1, 90}, {425, 6111, 1, 90},

//lesser
{82, 592, 1, 0}, {82, 995, misc.random(210), 5}, {82, 1149, 1, 15}, {82, 5698, 1, 25}, {82, 882, misc.random(1000), 1},
//slayernpcs

{1648, 526, 1, 0}, {1648, 995, misc.random(1100), 2}, {1648, 4129, 1, 30},

{1616, 526, 1, 0}, {1616, 995, misc.random(9100), 40}, 

{1637, 526, 1, 0}, {1637, 995, misc.random(12100), 40},{1637, 1149, 1, 68},{1637, 526, 1, 0}, {1637, 4087, 1, 85},{1637, 3140, 1, 90},

{1615, 526, 1, 0}, {1615, 4087, 1, 85},{1615, 3140, 1, 90},{1615, 4151, 1, 80},{1614, 995, misc.random(100000), 70},
};



}