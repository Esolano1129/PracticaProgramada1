package src;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.*;

public class main{

    public static void main(String[] args) {

    List<Movie> movielist = new ArrayList<>();

    movielist.add(new Drama("La lista de Schindler",1993, 3.5,"Drama", "Belico"));
    movielist.add(new Anime("Howl's Moving Castle",2004, 2.0,"Anime", "Studio Ghibli"));
    movielist.add(new Documental("Una verdad incómoda",2015, 3.0,"Documental", "Historico"));
    movielist.add(new Anime("Mi vecino Totoro",1988, 1.5,"Anime", "Studio Ghibli"));
    movielist.add(new Drama("Oppenheimer",2023, 3.0,"Drama", "Thrillers"));
    movielist.add(new Documental("Escuadrón de la muerte",2019, 1.5,"Documental", "Accion"));


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                scanner.nextLine();
                System.out.println("\nCatalogo de Netflix");
                System.out.println("\nEliga una opcion: ");
                System.out.println("1. Películas de Anime");
                System.out.println("2. Películas de Drama");
                System.out.println("3. Películas de Documental");
                System.out.println("4. Todas las peliculas");
                System.out.println("5. Salir");

                int opc = scanner.nextInt();

                switch (opc) {
                    case 1:
                        boolean salir3 = false;
                        while(!salir3){
                        for (Object o : movielist){
                            boolean salir2 = false;
                            if (o instanceof Anime) {
                                while (!salir2){
                                    try {
                                        Anime anime1 = (Anime) o;
                                        System.out.println("\n"+anime1.Name);
                                        System.out.println("\nEliga una opcion: ");
                                        System.out.println("1. Ver informacion completa");
                                        System.out.println("2. Siguiente pelicula");
                                        System.out.println("3. Salir");
                                        int opc2 = scanner2.nextInt();
                                        if (opc2 == 1){
                                            System.out.println(anime1.toString());
                                        } else if (opc2 == 2) {
                                            salir2 = true;
                                        } else if (opc2 ==3 ) {
                                            salir2= true;
                                            salir3 = true;
                                            System.out.println("Saliendo al menu principal.");
                                        }
                                    }catch (InputMismatchException e) {
                                        System.out.println("Error: debe ingresar un numero.");
                                    }
                                }
                            }
                        }
                        }
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        salir = true;
                        System.out.println("Saliendo del catologo.");
                        break;
                    default:
                        System.out.println("Opcion no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero.");
            }
        }
    }



    }

