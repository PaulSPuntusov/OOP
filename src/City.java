import java.util.Arrays;

public class City {
    String name;
    Route[] routes;

    public City(String name, Route... routes) {
        this.name = name;
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", routes=" + Arrays.toString(routes) +
                '}';
    }
    public String toPrint(){
        String res = "City{" +
                "name='" + name;
        for(int i=0; i< routes.length;i++){
            res += " route ["+i+"]:{"+routes[i].city+" цена: "+Integer.toString(routes[i].cost)+" } ";
        }
        return res;
    }

    public void addRoute(Route route) {
        routes = Arrays.copyOf(routes,routes.length+1);
        routes[routes.length-1]=route;
    }

    public void addRoute(City city, int cost) {
        Route route = new Route(city, cost);
        addRoute(route);
    }

    public City travelBy(int n) {
        City destination = this;
        for (int i = 0; i <= n; i++) {
            if (routes[0].city == null) {
                break;
            } else {
                destination = destination.routes[0].city;
            }
        }
        return destination;
    }
}
