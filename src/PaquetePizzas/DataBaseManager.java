package PaquetePizzas;

public class DataBaseManager implements DataBase{

    private String url;
    public DataBaseManager(String url) {
        this.url = url;
    }
public void procesarConsulta(String consulta) {
    System.out.println("Conectando a la base de datos: " + url);
    System.out.println("Ejecutando consulta: " + consulta);
    System.out.println("Consulta ejecutada correctamente.");
}

}
