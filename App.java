import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String lanches = "lanches";
        String bebidas = "bebidas";
        String porcoes = "porcoes";
        String pratosexecutivos = "pratosexecutivos";

        String[] arraylanches;
        String[] arraybebidas;
        String[] arrayporções;
        String[] arraypratosExecutivos;

        arraylanches = new String[]{"Hamburguer", "Cachooro quente", "Tapioca" };
        arraybebidas = new String[]{"Coca", "Cerveja", "Suco" };
        arrayporções = new String[]{"Fritas da Casa", "Coxinhas pulled pork", "Bananinha" };
        arraypratosExecutivos = new String[]{"Short Ribs", "Espetinho", "Ancho Angus" };

        Scanner scan = new Scanner(System.in);
        String item;

        System.out.println("qual tipo de item do cardapio deseja? lanches, bebidas, porcoes, pratosexecutivos?");
        item = scan.nextLine();
        if (!item.equalsIgnoreCase(lanches) && !item.equalsIgnoreCase(bebidas) && !item.equalsIgnoreCase(porcoes) && !item.equalsIgnoreCase(pratosexecutivos)) {
            do {
                System.out.println("Digite opçoes válidas: lanches, bebidas, porcoes, pratosexecutivos");
                item = scan.nextLine();

            } while (!item.equalsIgnoreCase(lanches) && !item.equalsIgnoreCase(bebidas) && !item.equalsIgnoreCase(porcoes) && !item.equalsIgnoreCase(pratosexecutivos));
        }
        switch (item) {
            case "lanches":
                for (String listalanches:arraylanches
                     ) {
                    System.out.println(listalanches);
                   break;
                }
            case "bebidas":
                for (String listabebidas:arraybebidas
                     ) {
                    System.out.println(listabebidas);
                    break;

                }
            case "porcoes":
                for (String listaporcoes:arrayporções
                     ) {
                    System.out.println(listaporcoes);
                    break;

                }
            case "pratosexecutivos":
                for (String listapratosexecutivos:arraypratosExecutivos
                     ) {
                    System.out.println(listapratosexecutivos);
                    break;

                }



        }
    }
}
