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
        boolean salir = false;
        boolean salir2 = false;
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

                int opcion = scanner.nextInt();
                int opcion2 = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        for (Object o : movielist){
                            if (o instanceof Anime) {
                                Anime anime1 = (Anime) o;
                                System.out.println(anime1.Name);
                                while (!salir2){
                                    try{
                                        System.out.println("\nEliga una opcion: ");
                                        System.out.println("1. Ver informacion completa");
                                        System.out.println("2. Siguiente pelicula");
                                        System.out.println("3. Salir");
                                        switch (opcion2){
                                            case 1:
                                                System.out.println(anime1.toString());
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                salir = true;
                                                System.out.println("Saliendo al menu principal.");
                                                break;
                                            default:
                                                System.out.println("Opcion no válida.");
                                        }
                                } catch (Exception e) {
                                        System.out.println("Error: debe ingresar un numero.");
                                    throw new RuntimeException(e);
                                }
                                }
                            }}
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

