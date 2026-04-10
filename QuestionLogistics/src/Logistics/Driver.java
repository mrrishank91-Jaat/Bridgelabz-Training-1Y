package Logistics;

public class Driver {
    String name;
    String id;
    RouteLinkedList<CheckPoint>
    public Driver(String name, String id){
        this.name=name;
        this.id=id;
        this.route = new RouteLinkedList<>();
    }
}
