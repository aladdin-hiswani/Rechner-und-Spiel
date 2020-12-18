package ahteschenrechnerspiel;
import java.util.Scanner; 
public class AHTeschenrechnerSpiel {
static Scanner input = new Scanner (System.in);
static int wahl; 
static char Buchstabe; 
static boolean weiter = false ; 
static int auswahl; 
public static void main(String[] args) {
HauptMenu();
        
        
    }
public static void HauptMenu(){
do {
    System.out.println("wählen Sie aus: ");
    System.out.println("1. Rechner\n2. Spiel\n3. Beenden");
    wahl = input.nextInt();
    switch (wahl) {
        case 1:
               Rechner();             
            break;
        case 2:
               Spiel();             
            break;
        case 3:
               Beenden();             
            break;
        default:
            System.out.println("ungültige eingabe");
            weiter = false; 
    }
}while (!weiter); 
    
}
public static void Rechner(){
   int auswahl; 
        boolean weiter = false; 
        double ErsteZahl, ZweiteZahl; 
char operetur ;
    do {
        System.out.println(">>>>>>Taschenrechner<<<<<<");
        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        ErsteZahl = input.nextDouble(); 
        
        System.out.println("die Operatur");
        operetur = input.next().charAt(0);
        
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        ZweiteZahl = input.nextDouble(); 
      
        if (operetur == '*')
            System.out.println("Ergebnis = " + (ErsteZahl * ZweiteZahl));
        else if (operetur == '/')
            System.out.println("Ergebnis = " + (ErsteZahl / ZweiteZahl));
        else if (operetur == '+')
            System.out.println("Ergebnis = " + (ErsteZahl + ZweiteZahl));
        else if (operetur == '-')
            System.out.println("Ergebnis = " + (ErsteZahl - ZweiteZahl));
        else 
            System.out.println("ungültige eingabe");
        System.out.println("wählen Sie aus");
        System.out.println("bitte 1 für zurück, 2 für nochmal");
        auswahl = input.nextInt(); 
        if (auswahl ==2)
        weiter = false;
        else if (auswahl ==1)
            weiter =true; 
        
    } while (!weiter) ;   
}
public static void Spiel(){
    do {
        System.out.println("wählen Sie aus: ");
    
    System.out.println("a. Gerade und Ungerade Zahl \nb. zurück");
    Buchstabe = input.next().charAt(0);
    switch (Buchstabe) {
        case 'a':
               GeradeUngerade();             
            break;
        case 'b':
               System.out.println("wählen Sie aus");
        System.out.println("bitte 1 für zurück, 2 für nochmal");
        auswahl = input.nextInt(); 
        if (auswahl ==2)
        weiter = false;
        else if (auswahl ==1)
            weiter =true; 
            break;
        default:
            System.out.println("ungültige eingabe");
            weiter = false; 
    }
    }while (!weiter);
}
public static void Beenden(){
    System.out.println("Sind Sie sicher?");
    System.out.println("(j) für beenden, (n) für weiter");
    Buchstabe = input.next().charAt(0); 
    if (Buchstabe == 'n' )
        weiter = false; 
    else if (Buchstabe == 'j')
        weiter = true; 
    System.out.println("Danke für deine Besuch, Programm beendet");
}
public static void GeradeUngerade(){
    boolean weiter = false; 
    do {
        int zahl;
        System.out.println("Bitte geben Sie eine Zahl: ");
        zahl = input.nextInt();
        if (zahl % 2 == 0) 
            System.out.println("Zahl ist gerade");
         else 
            System.out.println("Zahl ist ungerade");
            zahl++;
        

        System.out.println("wählen Sie aus");
        System.out.println("bitte 1 für zurück, 2 für nochmal");
        auswahl = input.nextInt();
        if (auswahl == 2) {
            weiter = false;
        } else if (auswahl == 1) {
            weiter = true;
        }
    } while (!weiter);
    
}

}
//HaupMenu
//1. Taschenrechner
//2. Spiele
//3. Beenden
//
//
//1 gibt
//        . erste Zahl
//        . operation eingeben (/ * - +)
//        . zweite Zahl
//        . Ergebnis
//1. nochmal     2. zurück
// 
//HaupMenu
//1. Taschenrechner
//2. Spiele
//3. Beenden
// 
//2 gibt
// 
//1. Primzahl
//2. Gerade oder Ungerade
//3. Max oder Min
//4. Summe
//5. Array
//6. zurück
// 
//1 gibt
//  bitte eine Zahl eingeben:
//  231
//  sie ist/nicht Primzahl
//1. nochmal     2. zurück    
// 
//
//1. Taschenrechner
//    a. / * - +
//        . erste Zahl
//        . operation eingeben (/ * - +)
//        . zweite Zahl
//        . Ergebnis
//        
//    b. eine Zahl geben
//        - Primzahl
//        - Gerade/Ungerade
//        
//    c. durch Scanner-> mehere Zahlen-> Nutzer soll sagen wieviel?!!
//        -  Max
//        -  Min
//        -  Addtion
//        -  Ein Dimensionale Array
//
