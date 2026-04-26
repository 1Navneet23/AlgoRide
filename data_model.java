import java.util.Scanner;
sc=new Scanner(System.in)
class Loaction{
    int id;
    String name;
    public Loaction(int id; String name){
        this.name=name;
        this.id=id;
    }
}
class Driver{
    int id;
    String name;
    double rating;
    String isAvailable;
    int Loactionid;
    public Driver(int id;String name;double rating;String isAvailable;int Loactionid){
        this.id=id;
        this.name=name;
        this.rating=rating;
        this.isAvailable=isAvailable;
        this.Loactionid=Loactionid;
    }

}
class Rider{
    int id;
    String name;
    int Loactionid;
    public Rider(int id;String name;int Loactionid){
        this.id=id;
        this.name=name;
        this.Loactionid=Loactionid;
    }
}

class Trip{
    int tripId;
    String rider;
    String driver;
    int sourceId;
    int destinationId;
    double fare;
    String status;
    public Trip(int tripId;String rider;String driver;int sourceId;int destinationId;double fare;String status){
        this.tripId=tripId;
        this.rider=rider;
        this.driver=driver;
        this.sourceId=sourceId;
        this.destinationId=destinationId;
        this.fare=fare;
        this.status=status;
    }
}
public static String start(){
    return "ONGOING";
}
public static int complete(){
    System.out.println("enter the fare");
    int fare=sc.next();
    status="COMPLETED";
    return fare;

}
public static String tostring(fare,rider,driver,status){
    String result=fare+ | +rider+ | +driver+ | +status;
    return result; 
}