package lab8;

public class Main {
    public static void main(String[] args) {
        Pills pills1 = new Pills("Аспірін",0.3, 2, 10, "біль");
        System.out.println("Pills 1");
        System.out.println(pills1.toString());
        Pills pills2 = new Pills("Аспірін",0.3);
        System.out.println("Pills 2");
        System.out.println(pills2.toString());
        System.out.println("Pills 1 equals Pills 2: " + pills1.equals(pills2));
        pills2.setDisease("головний біль");
        System.out.println("Pills 1");
        System.out.println(pills1.toString(1));
        System.out.println("Pills 2");
        System.out.println(pills2.toString(1));
        System.out.println("Pills 1 equals Pills 2: " + pills1.equals(pills2));
        System.out.println();

        Drops drops1 = new Drops("Краплі для очей",500, 2, 10, "почервоніння");
        System.out.println("Drops 1");
        System.out.println(drops1.toString());
        Drops drops2 = new Drops("Краплі для очей",500);
        System.out.println("Drops 2");
        System.out.println(drops2.toString());
        System.out.println("Drops 1 equals Drops 2: " + drops1.equals(drops2));
        drops2.setName("Краплі для вух");
        System.out.println("Drops 1");
        System.out.println(drops1.toString(2));
        System.out.println("Drops 2");
        System.out.println(drops2.toString(2));
        System.out.println("Drops 1 equals Drops 2: " + drops1.equals(drops2));
    }
}
