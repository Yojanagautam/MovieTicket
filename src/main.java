import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 32, "romance", "hello", "qwertyui", "10am", 100);
        moviesList.add(m1);
        Movie m2 = new Movie(3,4, "sdfghjk", "god will hunting", "TGus Van Sant", "11 ", 12123);
        moviesList.add(m2);
        Movie m3 = new Movie(4,5, "Romance", " The note book ", "Nick Cassavetes", "12 ", 456789);
        moviesList.add(m3);



        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("aarya ", 19,"aarya@gmail.com");
        users.add(u1);
        User u2 = new User("ram", 18, "ram@gmail.com");
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Comfortable", 4);
        seats.add(s1);
        Seat s2 = new Seat(" uncomfortable", 5);
        seats.add(s2);

        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m3.getMovies("2");

    }
}
