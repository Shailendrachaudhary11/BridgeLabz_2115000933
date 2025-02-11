class Movie{
    String movieTitle;
    String movieDirector;
    String movieRealseDate;
    int movieRating;
    Movie next;
    Movie prev;
    Movie(String movieTitle,String movieDirector,String movieRealseDate,int movieRating){
        this.movieTitle=movieTitle;
        this.movieDirector=movieDirector;
        this.movieRealseDate=movieRealseDate;
        this.movieRating=movieRating;
        this.next=null;this.next = null;
    }
}
class MovieList{
    private Movie head,tail;
    public void addAtBegining(String movieTitle,String movieDirector,String movieRealseDate,int movieRating){
        Movie newMovie=new Movie(movieTitle, movieDirector, movieRealseDate, movieRating);
        if(head==null){

            head=newMovie;
            tail=newMovie;
        }
        else{
            newMovie.next=head;
            head.prev=newMovie;
            head=newMovie;
        }
    }
    public void addAtEnding(String movieTitle,String movieDirector,String movieRealseDate,int movieRating){
        Movie newMovie=new Movie(movieTitle, movieDirector, movieRealseDate, movieRating);
        if(tail==null){
            head=newMovie;
            tail=newMovie;
        }
        tail.next=newMovie;
        newMovie.prev=tail;
        tail=newMovie;
    }
    public void addAtPosition(String movieTitle,String movieDirector,String movieRealseDate,int movieRating,int position){
        Movie newMovie=new Movie(movieTitle, movieDirector, movieRealseDate, movieRating);
        if(position<=0){
            addAtBegining(movieTitle,movieDirector,movieRealseDate,movieRating);
        }
        Movie temp=head;
        for(int i=0;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            addAtEnding(movieTitle,movieDirector,movieRealseDate,movieRating);
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        temp.next.prev = newMovie;
        temp.next = newMovie;
        tail = newMovie;

    }
    public void displayStarting(){
        Movie temp=head;
        while(temp!=null){
            System.out.println("Name: "+temp.movieTitle+" ,director: "+temp.movieDirector+" ,realse-date: "+temp.movieRealseDate+" and rating: "+temp.movieRating);
            temp=temp.next;
        }
    }
    public void displayEnding(){
        Movie temp=tail;
        while(temp!=null){
            System.out.println("Name: "+temp.movieTitle+" ,director: "+temp.movieDirector+" ,realse-date: "+temp.movieRealseDate+" and rating: "+temp.movieRating);
            temp=temp.prev;
        }
    }
    public void removeMovieByTitle(String title) {
        Movie temp = head;

        while (temp != null && !temp.movieTitle.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie '" + title + "' removed successfully.");
    }

    // Search a movie by director
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.movieDirector.equalsIgnoreCase(director)) {
                System.out.println("Movie: " + temp.movieTitle + ", Year: " + temp.movieRealseDate + ", Rating: " + temp.movieRating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    // Search movies by rating
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.movieRating == rating) {
                System.out.println("Movie: " + temp.movieTitle + ", Director: " + temp.movieDirector + ", Year: " + temp.movieRealseDate);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    // Update movie rating by title
    public void updateMovieRating(String title, int newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {
                temp.movieRating = newRating;
                System.out.println("Updated rating of '" + title + "' to " + newRating);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }
}
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList movielist=new MovieList();
        movielist.addAtBegining("Animal","dejkf","23-02-2000",4);
        movielist.addAtBegining("Animwehfhsal","dauk","13-1-2020",2);
        movielist.addAtBegining("dad","dejddfkf","23-01-2202",5);
        movielist.addAtEnding("df","qq","01-02-2202",5);
        movielist.updateMovieRating("Animal",4);
        movielist.displayStarting();
        System.out.println();
        movielist.displayEnding();
    }
}
