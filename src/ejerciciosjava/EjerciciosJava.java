package ejerciciosjava;

import java.util.Arrays;

/**
 *
 * @author Carlos Abia
 */
public class EjerciciosJava {

    public int[] maximo(int[] listaNumeros) {
        int[] numerosMaximos = {0, 0};

        for (int i = 0; i < listaNumeros.length; i++) {
            if (numerosMaximos[0] < listaNumeros[i]) {
                numerosMaximos[1] = numerosMaximos[0];
                numerosMaximos[0] = listaNumeros[i];
            } else if (numerosMaximos[1] < listaNumeros[i]) {
                numerosMaximos[1] = listaNumeros[i];
            }
        }

        return numerosMaximos;
    }

    public boolean palindromo(String palin) {
        palin = palin.toLowerCase();
        String acentos = "áàäéèëíìïóòöúùuñç";
        String normal = "aaaeeeiiiooouuunc";
        for (int i = 0; i < acentos.length(); i++) {
            palin = palin.replace(acentos.charAt(i), normal.charAt(i));
        }

        palin = palin.replaceAll("\\s+", "").replaceAll(",", "");
        int longitud = palin.length();
        String newWord = "";

        for (int i = longitud; i > 0; i--) {

            newWord += palin.substring(i - 1, i);

        }

        if (newWord.equals(palin)) {
            return true;
        } else {
            System.out.println(newWord);
            return false;
        }

    }

    public boolean isograma(String str) {
        int longitud = str.length();
        String comprobar = "";
        for (int i = 0; i < longitud; i++) {
            if (comprobar.contains(str.substring(i, i + 1))) {
                return false;
            }
            comprobar += str.substring(i, i + 1);

        }
        return true;
    }

    public void ejemplosString() {
        String cadena1 = "Acaso hubo buhos aca";

        System.out.println(cadena1.charAt(7));

        System.out.println(cadena1.substring(6, 9));

        String[] arrayPalabras = cadena1.split(" "); //split le dice qué es lo que separa a las palabras.

        System.out.println(cadena1.indexOf("b")); //da la posición numérica de un determinado caracter.

    }

    public void calendario(int dia) {
        
//        Esto fue lo primero que se me ocurrió. xD
//        int[] arrayDias = {1, 2, 3, 4, 5, 6, 7};
//        for(int k=0; k<5; k++){
//            if(k == 0){
//                for(int i=0; i<7; i++){
//                    System.out.print(arrayDias[i]);    
//                }
//            }
//            else{
//                for(int i=0; i<7; i++){
//                    arrayDias[i] += 7;
//                    if(arrayDias[i] > 31){
//                        arrayDias[i] = 0;
//                    }
//                    if(i == 0){
//                        System.out.println(arrayDias[i]);    
//                    }
//                    
//                    else{
//                        System.out.print(arrayDias[i]);
//                    }
//                    
//                    
//                }
//            }
//        }  

        String[] arrayDias = new String[35];
        int day = 1;

        for (int j = 0; j < 35; j++) {
            if (j == 7 || j == 14 || j == 21 || j == 28) {
                System.out.println();
            }
            if (dia > j || day > 31) {
                System.out.print("XX" + "  ");

            } else {
                if (day < 10) {
                    System.out.print("0" + (arrayDias[j] = Integer.toString(day)) + "  ");
                    day += 1;
                } else {
                    System.out.print((arrayDias[j] = Integer.toString(day)) + "  ");
                    day += 1;
                }

            }
        }

    }
    
    
    public boolean escalera (char ladder [][]){
        for(int i=0; i<ladder.length; i++){
            if(ladder [i] ==ladder [i+1] && ladder [i+1] ==ladder [i+2]){
                
            }
        }return true;
    }
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EjerciciosJava ejercicio1 = new EjerciciosJava();
//        int[] listaNumeros = {50, 31, 27, 2, 5, 99};
//        int[] listaNumeros2 = {150, 31, 27, 2, 5, 99};
//        System.out.println(ejercicio1.maximo(listaNumeros)[0]);
//        System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));
//         System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros2)));
//        
//        EjerciciosJava ejercicio2 = new EjerciciosJava();
//        String palindromo = "Allí por la tropa portado, traído a ese paraje de maniobras, una tipa como capitán usar boina me dejara, pese a odiar toda tropa por tal ropilla";
//        System.out.println(ejercicio2.palindromo(palindromo));
//
//        EjerciciosJava ejercicio3 = new EjerciciosJava();
//        String iso = "asdfghklñ";
//        System.out.println(ejercicio2.isograma(iso));

//        ejercicio1.ejemplosString();
        ejercicio1.calendario(3);
        char[][] ladder= {
        {'P',	'A',	'T',	'A'}, 
        {'P',	'A',	'T',	'O'},
        {'R',	'A',	'T',	'O'},
	{'R',	'A',	'M',	'O'},
	{'G',	'A',	'M',	'O'},
	{'G',	'A',	'T',	'O'},
	{'M',	'A',	'T',	'O'},
	};
         System.out.println(ejercicio1.escalera(ladder));

    }

}
