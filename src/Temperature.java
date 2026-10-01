import java.util.Scanner;
public class Temperature{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        double brojMjerenja = 0;
        int brojPovisenih = 0;
        double najniza = Double.MAX_VALUE;
        double najvisa = -Double.MIN_VALUE;
        int suma = 0;

        System.out.println("Unesi temperature u Celzijevim stupnjevima, 0 za kraj.");

        while(true){
            System.out.print("Temperatura:");
            double temp = scanner.nextDouble();

            if(temp == 0){
                break;
            }

            brojMjerenja++;
            suma += temp;
            
            if (temp < najniza){
                najniza = temp;
            }

            if (temp > najvisa){
                najvisa = temp;
            }

            if (temp > 37.0){
                brojPovisenih++;
            }
            
        }

        if (brojMjerenja == 0){
            System.out.println("Nije uneseno nijedno mjerenje.");
        }
        else{
            double prosjek = suma / brojMjerenja;

            System.out.printf("Broj mjerenja: %n", + brojMjerenja);
            System.out.printf("Najniza: %.2f °C%n", najniza);
            System.out.printf("Najveća: %.2f °C%n", najvisa);
            System.out.printf("Prosjek: %.2f °C%n", prosjek);
            System.out.printf("Broj povisenih mjerenja: %n", + brojPovisenih);

            if(brojPovisenih > 0){
                System.out.println("Povisena temperatura je zabilježena.");
            }
            else{
                System.out.println("Sva mjerenja u granicama normale.");
            }


        }
        
        scanner.close();


    }
}