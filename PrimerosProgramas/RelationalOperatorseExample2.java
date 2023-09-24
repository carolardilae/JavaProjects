
package relationaloperatorsexample2;

public class EqualsNotEquals {

    public static void main(String[] args) {
        int songsA =9;
        int songsB = 9;
        int albumsLengthA = 41;
        int albumsLengthB = 53;
        boolean sameNumberOffSongs = songsA == songsB;
        boolean differentLenght = albumsLengthA != albumsLengthB;
        
        System.out.println(sameNumberOffSongs);
        System.out.println(differentLenght);
    }
    
}
