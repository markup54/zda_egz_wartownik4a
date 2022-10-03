import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Wylosowana lista:");
        ArrayList <Integer> wylosowane = wylosujListe();
        System.out.println("Podaj szukaną wartość");
        Scanner klawiatura  = new Scanner(System.in);
        int szukanaWartosc = klawiatura.nextInt();
        int indeks = wyszukajElement(szukanaWartosc,wylosowane);
        if(indeks == wylosowane.size()-1){
            System.out.println("Elementu nie ma w tablicy "+wylosowane);
        }
        else{
            System.out.println("Element jest w tablicy pod indeksem "+indeks);
        }

        //System.out.println(wylosowane);

    }
    public static ArrayList<Integer> wylosujListe(){
        ArrayList <Integer> wylosowane = new ArrayList<>();
        for(int i=0;i<50;i++){
            int liczba = (int)(Math.random()*100+1);
            wylosowane.add(liczba);
        }
        return wylosowane;
    }

    /**
     * nazwa funkcji : wyszukajElement
     * argumenty: element : przechowuje szukaną wartość typu int
     *            wylosowane : przechowuje listę w której szukamy elementu
     * typ zwracany : int, indeks pierwszej znalezionej wartości element w liście wylosowane
     * informacje : funkcja zwraca pierwszy indeks wystąpienia wartości szukanej w liście
     * autor : 000000000000000000 (pesel!!!!!!!)
     */
    public static int wyszukajElement(int element,ArrayList<Integer> wylosowane){
        wylosowane.add(element);
        int szukanyIndeks =0;
        for (int i=0;i<wylosowane.size();i++) {
            if(wylosowane.get(i)== element){
                return i;
            }
        }
        return 0;
    }
}