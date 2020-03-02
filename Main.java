import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

   //Scanner scan = new Scanner(System.in);
	double v= createRand(5.5,22.2);
  //km/h--->m/s
	System.out.println("Getting random velocity from [5.5,22.2]: "+v);

    //float v = scan.nextFloat();
     double dist = createRand(10,150);
    System.out.println("Getting random Intersection [10-150] : "+dist);

    double t = createRand(2,5);
    System.out.println("Getting random duration for yellow light[2,5] : "+t);

       double s = createRand(2,5);
    System.out.println("Getting random intersection width [5,20] : " +s);

     double a_p = createRand(1,3);
    System.out.println("Getting random positive acceleration [1,3] : " + a_p);

     double a_n = createRand(1,3);
    System.out.println("Getting random negative acceleration [1,3] : " +a_n);


      double d = createRand(10,100);
    System.out.println("distance [10, 100]");

		double v_exp= createRand(13.8,27.7);
  //km/h--->m/s
	System.out.println("Getting random speed [13.8,27.7]: "+v);

   // scan.close();
   //first part of problem
     project car = new project(v, dist, t, s, a_p, a_n);
     car.yes_no();


//second part
	System.out.println("--------------Second Task");
	double v2= createRand(20,80);

  //km/h--->m/s
	System.out.println("Getting random speed for secont car from interval [5.5,22.2]: "+v);

  //As i understood the distance between first car and intersection is equal to distance between second car and firs car. I solved it that way. Also I assumed that they have different velocities but from the same interval. Also I assumed that there is only one driving line, thus second car is right behing the first car

     project car1 = new project(v, d, t, s, a_p, a_n);
     project car2 = new project(v2,2*d, t, s, a_p, a_n);
     car1.two_cars(car2);
  }
  public static double createRand(double min, double max){ // just in case we want to try random values
        if(min >= max){
            System.out.println("Wrong arguments");
        }
        double random = min + Math.random() * (max - min);
        return random;
    }
}
