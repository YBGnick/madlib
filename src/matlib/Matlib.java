import java.util.Scanner;
public class Matlib {

    
    static String toProperNoun(String txt) {
        return txt.substring(0, 0).toUpperCase() + txt.substring(1).toLowerCase();

    }

    static String noun(String txt) {
        return txt.toLowerCase();
    }

    static String adg(String txt) {
        return txt.toLowerCase();
    }
    static String verb(String txt) {
        return txt.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Insert Adjective ending in -ing:\t");
        String adg1 = adg(s.nextLine());
        System.out.print("Insert Adjective:\t");
        String adg3 = adg(s.nextLine());
        System.out.print("\nInsert Animal:\t");
        String animal = noun(s.nextLine());
        System.out.print("\nInsert Noun:\t");
        String noun1 = noun(s.nextLine());
        System.out.print("\nInsert Adjective:\t");
        String adv1 = adg(s.nextLine());
        System.out.print("\nInsert Body Part:\t");
        String bodyPart = noun(s.nextLine());
        System.out.print("\nInsert Proper Noun:\t");
        String properNoun = toProperNoun(s.nextLine());
        System.out.print("\nInsert Adjective:\t");
        String adg2 = adg(s.nextLine());
        System.out.print("\nInsert Professor:\t");
        String prof = noun(s.nextLine());
        System.out.print("\nInsert Number:\t");
        String num = s.nextLine();
        System.out.print("\nInsert Adjective:\t");
        String adv3 = adg(s.nextLine());
        System.out.print("\nInsert Noun:\t");
        String noun2 = noun(s.nextLine());

        String res = String.format(
            "I just had the %s day ever. My %s pet %s destroyed my %s.\nI immediatly started %s and hurt my %s. \nAfter being hospitailized, my %s came to my room to check on me.  \nMy %s doctor, who was a actually a former %s. %s days later, I was %s released to go back to my job as a professional %s.",
                adg1 ,
                adg3,
                animal ,
                noun1 ,
                adv1 ,
                bodyPart ,
                properNoun ,
                adg2 ,
                prof ,
                num ,
                adv3 ,
                noun2);


        System.out.println(res);
        s.close();
    }


}