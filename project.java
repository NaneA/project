import java.util.Scanner;

public class project {
	double v;
  double dist;
	double t;
	double s;
	double a_p;
	double a_n;

	public project(double v,double x,double t,double s,double a_x ,double a_n) {

    this.v=v;
    this.dist=dist;
    this.t=t;
    this.s=s;
    this.a_p=a_p;
    this.a_n=a_n;

    }

public void yes_no(){
if((dist+s)/(v+a_p*t)<=t)
    System.out.println("it can pass the intersection");
else if(t*(v-a_n*t)<=dist){
  System.out.println("it should stop");
}
else{
System.out.println("pray for the best :)");
}

}

public boolean temp(){
if((dist+s)/(v+a_p*t)<=t){
  return true;
}
else{
  return false;
}
}
public double get_t(){
  return this.t;
}

public void two_cars(project car2) {
  if(temp() && car2.temp()){
    if(car2.get_t()-get_t()>0){
      System.out.println("At some point before passing intersection they will crush");
    }
    else{
    System.out.println("Both will pass");
    }
  }
else if(temp()==true){
    if(car2.temp()!=true){
    System.out.println("first one passes second one not");
    }
  }
else if(car2.temp()==true && temp()==false){
  System.out.println("they will crush");
}
  else {
    System.out.println("both of them won't pass");
  }
}


}





	
