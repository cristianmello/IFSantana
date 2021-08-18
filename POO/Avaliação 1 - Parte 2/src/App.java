import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Scanner;

public class App extends CadastroMultas {

    public App(String nomeConductor, String tipoHabilitacao, LocalDate dataNascimiento, String placaMultada,
            String conductorMultado, String tipoMulta, LocalDate dataMulta) {
        super(nomeConductor, tipoHabilitacao, dataNascimiento, placaMultada, conductorMultado, tipoMulta, dataMulta);
    }

    static ArrayList<CadastroVeiculos> veiculos = new ArrayList<CadastroVeiculos>();
    static ArrayList<CadastroConductor> conductores = new ArrayList<CadastroConductor>();
    static ArrayList<CadastroMultas> multas = new ArrayList<CadastroMultas>();

    static CadastroVeiculos newVehiculo;
    static CadastroConductor conductor;
    static CadastroPropietarios newPropietario;
    static CadastroMultas newMulta;
    static String nombrePropietario, placa;
    static boolean pEncontrada = false;
    static boolean pCondEncontrada = false;
    static boolean propietarioEncontrado = false;
    static boolean multaEncontrada = false;

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        boolean condition = true;
        String tipoHabilitacion = null;

        // Menu, condition == false cierra programa.
        while (condition) {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Cadastrar conductor");
            System.out.println("2.Cadastrar veiculo");
            System.out.println("3.Cadastrar propietario");
            System.out.println("4.Cadastrar multa");
            System.out.println("5.Consulta pontuacion de multas");
            System.out.println("6.Consulta de multas por placa");
            System.out.println("7.Vender vehículo");
            System.out.println("8.Consultar infracciones");
            System.out.println("9.Finalizar programa");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nIngrese su nombre:");
                    String nome = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese su tipo de habilitacion(ingrese numero): 1.carro, 2.moto, 3.caminhão)");
                    option = new Scanner(System.in).nextInt();

                    if (option == 1) {
                        tipoHabilitacion = "carro";
                    } else if (option == 2) {
                        tipoHabilitacion = "moto";
                    } else if (option == 3) {
                        tipoHabilitacion = "caminhão";
                    }

                    System.out.println("Ingrese su fecha de nacimiento(DD/MM/YYYY):");
                    String nascimiento = new Scanner(System.in).nextLine();
                    // Tuve que utilizar tipo de dato LocalDate ya que me dificulto usar Date o
                    // Data.
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(nascimiento, formato);

                    conductor = new CadastroConductor(nome, tipoHabilitacion, fecha);

                    // Se añade al arrayList conductores los datos del objeto conductor.
                    conductores.add(conductor);

                    // Muestra los datos actuales del arrayList conductores
                    for (CadastroConductor cadastroConductor : conductores) {
                        System.out.print("Nombre:" + cadastroConductor.getNome() + ", ");
                        System.out.print("Habilitación:" + cadastroConductor.getTipoHabilitacao() + ", ");
                        System.out.println("Nascimiento:" + cadastroConductor.getDataNascimineto());
                    }
                    break;

                case 2:
                    System.out.println("\nIngrese la placa de su vehiculo:");
                    placa = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese el color de su automovil:");
                    String color = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese el año del vehiculo");
                    int ano = new Scanner(System.in).nextInt();

                    // Instancio un objeto de la clase CadastroVeiculos
                    newVehiculo = new CadastroVeiculos();

                    newVehiculo.setPlaca(placa);
                    newVehiculo.setCor(color);
                    newVehiculo.setAno(ano);

                    // Se añade al arrayList veiculos los datos que fueron seteados en el objeto
                    // newVehiculo.
                    veiculos.add(newVehiculo);

                    // Muestra los datos actuales del arrayList veiculos
                    for (CadastroVeiculos cVeiculos : veiculos) {
                        System.out.print("Placa registrada:" + cVeiculos.getPlaca() + ", ");
                        System.out.print("Color:" + cVeiculos.getCor() + ", ");
                        System.out.println("Año:" + cVeiculos.getAno());
                    }
                    break;

                case 3:
                    System.out.println("\nQuiere registrar una persona fisica o juridica? 1.P.FIsica, 2.P.Juridica");
                    option = new Scanner(System.in).nextInt();

                    // Instancio un objeto de la clase CadastroPropietarios.
                    newPropietario = new CadastroPropietarios();

                    // Dependiendo si es una persona fisica o juridica se van a obtener determinados
                    // valores.
                    if (option == 1) {

                        newPropietario.setTipo("P.Fisica");

                        System.out.println("Ingrese su Nombre:");
                        nombrePropietario = new Scanner(System.in).nextLine();
                        newPropietario.setNome(nombrePropietario);

                        System.out.println("Ingrese su CPF:");
                        String cpf = new Scanner(System.in).nextLine();
                        newPropietario.setCpf(cpf);

                    } else if (option == 2) {
                        newPropietario.setTipo("P.Juridica");

                        System.out.println("Ingrese el nombre de su empresa:");
                        nombrePropietario = new Scanner(System.in).nextLine();
                        newPropietario.setNome(nombrePropietario);

                        System.out.println("Ingrese su CNPJ:");
                        String cnpj = new Scanner(System.in).nextLine();
                        newPropietario.setCnpj(cnpj);

                    }

                    System.out.println("Ingrese la placa del vehiculo que quiere comprar");
                    placa = new Scanner(System.in).nextLine();

                    boolean placaEncontrada = false;
                    for (int x = 0; x < veiculos.size(); x++) {
                        CadastroVeiculos vehiculo = veiculos.get(x);
                        if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                            placaEncontrada = true;
                            break;
                        }
                    }

                    // Si la placa es encontrada en el arrayList de vehiculos registrados que esta
                    // en la clase cadastroVeiculos entonces
                    // se seteara la placa ingresada en el objeto newPropietario y se añadira al
                    // arrayList de listaVehiculos.
                    if (placaEncontrada) {
                        newPropietario.setPlacaProp(placa);
                        listaVehiculos.add(newPropietario);
                        System.out.println(newPropietario.comprarVeiculo(nombrePropietario, placa));

                    } else {
                        System.out.println("\nPara comprar un vehiculo debe estar registrado el vehiculo\n");
                    }

                    break;

                case 4:
                    System.out.println("\nIngrese la placa multada");
                    String placaMultada = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese el nombre del conductor multado");
                    String conductorMultado = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese la fecha en que fue ocasionada la multa(DD/MM/YYYY):");
                    String fechaMulta = new Scanner(System.in).nextLine();

                    formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    fecha = LocalDate.parse(fechaMulta, formato);

                    placaEncontrada = false;

                    // Recorre el arrayList veiculos hasta que encuentre la placa anteriormente
                    // ingresada o hasta que la condicion del "for" finalice.
                    for (int x = 0; x < veiculos.size(); x++) {
                        CadastroVeiculos vehiculo = veiculos.get(x);
                        if (vehiculo.getPlaca().equalsIgnoreCase(placaMultada)) {
                            placaEncontrada = true;
                            break;
                        }
                    }
                    boolean conductorEncontrado = false;
                    // Recorre el arrayList conductores hasta que encuentre el nombre del conductor
                    // anteriormente
                    // ingresado, o hasta que la condicion del "for" finalice.
                    for (int x = 0; x < conductores.size(); x++) {
                        CadastroConductor conductor = conductores.get(x);
                        if (conductor.getNome().equalsIgnoreCase(conductorMultado)) {
                            conductorEncontrado = true;
                            break;
                        }
                    }

                    // En el caso de que se encuentren los valores se podra registrar la/s multas.
                    if (placaEncontrada && conductorEncontrado) {
                        System.out.println("Ingrese la cantidad de multas a registrar:");
                        int cantidad = new Scanner(System.in).nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println(
                                    "Ingrese el tipo de multa ocasionada: 1.Leve, 2.media, 3.grave, 4.gravissima");
                            option = new Scanner(System.in).nextInt();
                            String tipoMulta = "";

                            if (option == 1) {
                                tipoMulta = "Leve";
                            } else if (option == 2) {
                                tipoMulta = "Media";
                            } else if (option == 3) {
                                tipoMulta = "grave";
                            } else if (option == 5) {
                                tipoMulta = "Gravissima";
                            }
                            // Se instancia un objeto de la clase cadastroMultas con los argumento
                            // necesarios
                            // para luego añadir el objeto al arrayList de multas.
                            newMulta = new CadastroMultas(null, null, null, placaMultada, conductorMultado, tipoMulta,
                                    fecha);
                            multas.add(newMulta);
                        }
                    } else {
                        System.out.println(
                                "\nPara registrar una multa la placa del vehiculo y el nombre del conductor deben estar registrados\n");
                    }

                    for (CadastroMultas cMultas : multas) {
                        System.out.print("placa multada:" + cMultas.getPlacaMultada() + ", ");
                        System.out.print("Nombre del conductor:" + cMultas.getConductorMultado() + ", ");
                        System.out.println("Tipo:" + cMultas.getTipoMulta());
                    }

                    break;

                case 5:
                    if (multas.isEmpty()) {
                        System.out.println("\nNo hay multas registradas\n");
                    } else {
                        // Si el arrayList No esta vacio entonces se recorrera el mismo y dependiendo de
                        // que tipo de multa se encuentre se ejecutara la funcion consultaPuntuacaoMulta
                        // de una una forma o otra.
                        for (int x = 0; x < multas.size(); x++) {

                            CadastroMultas multa = multas.get(x);

                            if (multa.getTipoMulta().equalsIgnoreCase("Leve")) {
                                System.out.println(conductor.consultaPuntuacaoMulta(multa.getConductorMultado(),
                                        multa.getPlacaMultada(), 1));
                            } else if (multa.getTipoMulta().equalsIgnoreCase("Media")) {
                                System.out.println(conductor.consultaPuntuacaoMulta(multa.getConductorMultado(),
                                        multa.getPlacaMultada(), 2));
                            } else if (multa.getTipoMulta().equalsIgnoreCase("grave")) {
                                System.out.println(conductor.consultaPuntuacaoMulta(multa.getConductorMultado(),
                                        multa.getPlacaMultada(), 3));
                            } else if (multa.getTipoMulta().equalsIgnoreCase("gravissima")) {
                                System.out.println(conductor.consultaPuntuacaoMulta(multa.getConductorMultado(),
                                        multa.getPlacaMultada(), 5));
                            }
                        }
                    }

                    break;

                case 6:

                    if (multas.isEmpty()) {
                        System.out.println("\nNo hay multas registradas\n");
                    } else {

                        for (int x = 0; x < multas.size(); x++) {
                            CadastroMultas multa = multas.get(x);

                            System.out.println(
                                    newVehiculo.consultaMultasPlaca(multa.getPlacaMultada(), multa.getTipoMulta()));
                        }

                    }
                    break;

                case 7:
                    System.out.println("\nIngrese su Nombre:");
                    nombrePropietario = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese la placa del vehiculo que quiere vender:");
                    placa = new Scanner(System.in).nextLine();

                    boolean placayPropEncontrados = false;
                    multaEncontrada = false;

                    if (!(listaVehiculos.isEmpty())) {
                        // Recorre el arrayList listaVehiculos hasta que encuentre el nombre del
                        // propietario anteriormente ingresado o hasta que la condicion del "for"
                        // finalice.
                        for (int i = 0; i < listaVehiculos.size(); i++) {
                            if ((listaVehiculos.get(i).getNome().equalsIgnoreCase(nombrePropietario))
                                    || (listaVehiculos.get(i).getPlacaProp().equalsIgnoreCase(nombrePropietario))) {
                                placayPropEncontrados = true;
                            }

                        }
                        // Recorre el arrayList multas hasta que encuentre la multa anteriormente
                        // ingresada o hasta que la condicion del "for" finalice.
                        for (int i = 0; i < multas.size(); i++) {
                            if (multas.get(i).getPlacaMultada().equalsIgnoreCase(placa)) {
                                multaEncontrada = true;
                            }
                        }
                    }

                    // Si se cumplen las condiciones se ejecutara la funcion vender vehiculos con
                    // los datos ingresados anteriormente por el usuario.
                    if (placayPropEncontrados && !multaEncontrada) {
                        System.out.println(newPropietario.venderVehiculo(nombrePropietario, placa));
                    } else {
                        System.out.println(
                                "\nPara vender un vehiculo debe haber comprado uno primero y no puede tener multas.\n");
                    }

                    break;

                case 8:
                    // Si multas esta vacio solo se ejecutara un mensaje.
                    if (!multas.isEmpty()) {
                        System.out.println("\nIngrese la placa del vehiculo que quiere consultar:");
                        placa = new Scanner(System.in).nextLine();

                        pEncontrada = false;
                        pCondEncontrada = false;

                        // Si la placa no se encuentra
                        for (int i = 0; i < multas.size(); i++) {
                            for (int j = 0; j < veiculos.size(); j++) {
                                if (veiculos.get(j).getPlaca().equalsIgnoreCase(placa)) {
                                    pEncontrada = true;
                                    if (multas.get(i).getPlacaMultada().equalsIgnoreCase(placa)) {
                                        pCondEncontrada = true;
                                        System.out.println(newMulta.consultarInfracoes(multas.get(i).getPlacaMultada(),
                                                multas.get(i).getConductorMultado(), multas.get(i).getTipoMulta(),
                                                multas.get(i).getDataMulta()));
                                    }
                                }
                            }
                        }
                        // Si multas esta vacio solo se ejecutara el mensaje y se inicializara las
                        // variables con valor true para que no entre en ninguna de las siguientes
                        // condicionales.
                    } else {
                        System.out.println("\nNo hay multas en el registro actualmente\n");
                        pEncontrada = true;
                        pCondEncontrada = true;
                    }

                    // En el caso de no se encuentre la placa ingresada en el arrayList de veiculos
                    // directamente se mostrara este mensaje.
                    if (pEncontrada == false) {
                        System.out.println(
                                "\nLa placa que usted ingreso no encaja con los vehiculos registrados por lo tanto no tiene multas\n");
                        // En el caso de que se encuentre la placa ingresada en el arrayList de veiculos
                        // pero no se encuentre esa misma placa en el arrayList de multas entonces se
                        // mostrara el siguiente mensaje.
                    } else if (pEncontrada == true && pCondEncontrada == false) {
                        System.out
                                .println("\nLa placa que usted ingreso es correcta pero no posee ninguna infracion\n");
                    }
                    break;
                case 9:
                    condition = false;
                    break;
                default:
                    System.out.println("\nIngrese una opción valida\n");
                    break;
            }

        }
    }
}
