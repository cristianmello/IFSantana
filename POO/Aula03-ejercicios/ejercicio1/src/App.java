import java.util.ArrayList;
import java.util.Scanner;

import ejercicio1.juridicalPerson;
import ejercicio1.person;
import ejercicio1.physicalPerson;

import ejercicio2.cd;
import ejercicio2.dvd;
import ejercicio2.media;
import ejercicio2.pendrive;

public class App {
    public static void main(String[] args) {
        System.out.println("que ejercicio quiere ejecutar? 1 o 2 ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int salario = 0, pax = 0, duration = 0, track = 0;
        boolean x;

        switch (option) {
            case 1:
                ArrayList<person> business = new ArrayList<person>();
                while (option != 4) {
                    System.out.println("registro de persona:");
                    System.out.println("1 - Persona Física");
                    System.out.println("2 - Persona Jurídica");
                    System.out.println("3 - Mostrar lista de registro");
                    System.out.println("4 - Salir");

                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            physicalPerson obj1 = new physicalPerson();

                            System.out.println("Ingrese su CPF");
                            String cpf = new Scanner(System.in).nextLine();
                            obj1.setCpf(cpf);

                            System.out.println("Ingrese su nombre");
                            String name = new Scanner(System.in).nextLine();
                            obj1.setName(name);

                            System.out.println("Ingrese su dirección");
                            String direction = new Scanner(System.in).nextLine();
                            obj1.setDirection(direction);

                            x = true;
                            while (x) {
                                try {
                                    System.out.println("Ingrese su salario");
                                    salario = new Scanner(System.in).nextInt();
                                    x = false;
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar solamente números");
                                }
                            }

                            obj1.setReceiveSalary(salario);
                            business.add(obj1);
                            break;
                        case 2:
                            juridicalPerson obj2 = new juridicalPerson();

                            System.out.println("Ingrese su CNPJ");
                            String cnpj = new Scanner(System.in).nextLine();
                            obj2.setCnpj(cnpj);

                            System.out.println("Ingrese su nombre");
                            name = new Scanner(System.in).nextLine();
                            obj2.setName(name);

                            System.out.println("Ingrese su rama de actividad");
                            String activity = new Scanner(System.in).nextLine();
                            obj2.setBranchActivities(activity);

                            System.out.println("Ingrese su dirección");
                            direction = new Scanner(System.in).nextLine();
                            obj2.setDirection(direction);
                            x = true;
                            while (x) {
                                try {
                                    System.out.println("Ingrese su impuesto");
                                    pax = new Scanner(System.in).nextInt();
                                    x = false;
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar solamente números");
                                }
                            }
                            System.out.println();
                            obj2.setPayTax(pax);
                            business.add(obj2);
                            break;
                        case 3:
                            for (int i = 0; i < business.size(); i++) {
                                System.out.println("Lista cadastrada: \n" + "Tipo: "
                                        + business.get(i).getClass().getName() + "\nNombre: "
                                        + business.get(i).getName() + "\nDirección: " + business.get(i).getDirection());

                                if (business.get(i) instanceof physicalPerson) {
                                    obj1 = (physicalPerson) business.get(i);
                                    System.out.println("CPF: " + obj1.getCpf());
                                    System.out.println("Salario: " + obj1.getReceiveSalary());

                                } else {
                                    obj2 = (juridicalPerson) business.get(i);
                                    System.out.println("CNPJ: " + obj2.getCnpj());
                                    System.out.println("Impuesto: " + obj2.getPayTax());
                                    System.out.println();
                                }

                            }
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                }

            case 2:
                ArrayList<Object> medias = new ArrayList<Object>();
                x = true;
                while (x) {
                    System.out.println("Registrar midia");
                    System.out.println("1.CD");
                    System.out.println("2.DVD");
                    System.out.println("3.Pendrive");
                    System.out.println("4.Mostrar lista de registro");
                    System.out.println("5.Salir");
                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            cd obj1 = new cd();
                            System.out.println("ingrese su Artista:");
                            String artist = new Scanner(System.in).nextLine();
                            obj1.setArtist(artist);

                            System.out.println("ingrese la Descripcion del CD:");
                            String description = new Scanner(System.in).nextLine();
                            obj1.setDescription(description);
                            x = true;
                            while (x) {
                                try {
                                    System.out.println("ingrese duracion:");
                                    duration = new Scanner(System.in).nextInt();
                                    x = false;
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar solamente números");
                                }
                            }
                            obj1.setDuration(duration);

                            x = true;
                            while (x) {
                                try {
                                    System.out.println("ingrese numero de faixas:");
                                    track = new Scanner(System.in).nextInt();
                                    x = false;
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar solamente números");
                                }
                            }

                            obj1.setTrack(track);

                            System.out.println("ingrese titulo de cd:");
                            String title = new Scanner(System.in).nextLine();
                            obj1.setTitle(title);

                            medias.add(obj1);
                            x = true;
                            break;
                        case 2:
                            dvd obj2 = new dvd();
                            System.out.println("ingrese su Clasificacion:");
                            String classification = new Scanner(System.in).nextLine();
                            obj2.setClassification(classification);

                            System.out.println("ingrese su director:");
                            String director = new Scanner(System.in).nextLine();
                            obj2.setDirector(director);

                            x = true;
                            while (x) {
                                try {
                                    System.out.println("ingrese duracion:");
                                    duration = new Scanner(System.in).nextInt();
                                    x = false;
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar solamente números");
                                }
                            }
                            obj2.setDuration(duration);

                            System.out.println("ingrese su estudio:");
                            String study = new Scanner(System.in).nextLine();
                            obj2.setStudy(study);

                            System.out.println("ingrese su Titulo:");
                            title = new Scanner(System.in).nextLine();
                            obj2.setTitle(title);

                            medias.add(obj2);
                            x = true;
                            break;
                        case 3:
                            pendrive obj3 = new pendrive();
                            while (x) {
                                System.out.println("ingrese el tipo de contenido (música, filme, arquivos");
                                String contentType = new Scanner(System.in).nextLine();

                                if (contentType.equalsIgnoreCase("musica") || contentType.equalsIgnoreCase("filme")
                                        || contentType.equalsIgnoreCase("filme")) {
                                    medias.add(obj3);
                                    x = false;
                                } else {
                                    System.out.println("Debe Ingresar un tipo de contenido válido");
                                    System.out.println();
                                }
                            }
                            x = true;
                            break;
                        case 4:
                            for (int i = 0; i < medias.size(); i++) {
                                System.out.println(
                                        "\nLista Registrada: \n" + "Tipo: " + medias.get(i).getClass().getName());
                                if (medias.get(i) instanceof cd) {
                                    obj1 = (cd) medias.get(i);
                                    System.out.println("Datos Del CD:");
                                    System.out.println("TItulo: " + obj1.getTitle());
                                    System.out.println("Artista: " + obj1.getArtist());
                                    System.out.println("Numero de Faixas: " + obj1.getTitle());
                                    System.out.println("Duracion: " + obj1.getDuration());
                                    System.out.println("Descripcion: " + obj1.getDescription());
                                } else if (medias.get(i) instanceof dvd) {
                                    obj2 = (dvd) medias.get(i);
                                    System.out.println("Datos de DVD:");
                                    System.out.println("Titulo: " + obj2.getTitle());
                                    System.out.println("Director: " + obj2.getDirector());
                                    System.out.println("Duracion: " + obj2.getDuration());
                                    System.out.println("Clasificacion: " + obj2.getClassification());
                                    System.out.println("Estudio: " + obj2.getStudy());
                                } else if (medias.get(i) instanceof pendrive) {
                                    obj3 = (pendrive) medias.get(i);
                                    System.out.println("Datos de PenDrive:");
                                    System.out.println("Capacidad: " + obj3.getCapacity());
                                    System.out.println("Tipo de Contenido: " + obj3.getContentType());
                                }
                            }
                            x = true;
                            break;
                        case 5:
                            x = false;
                            break;
                        default:
                            System.out.println("Elegiste una opción no válida!");
                            System.out.println();
                    }

                }
                break;

        }

    }

}
