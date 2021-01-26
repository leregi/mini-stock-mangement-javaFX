package functions;

public class Navigation {
    private final String login = "/resources/fxml/login.fxml";
    private final String register = "/resources/fxml/register.fxml";
    private final String dashboard = "/resources/fxml/dashboard.fxml";
    private final String client = "/resources/fxml/client.fxml";
    private final String product = "/resources/fxml/produit.fxml";
    private final String transaction = "/resources/fxml/transaction.fxml";


    public String getLogin() {
      return  login;
  }
    public String getRegister() {return  register;}
    public String getDashboard() {return  dashboard;}
    public String getClient() {return  client;}
    public String getProduct() {return  product;}
    public String getTransaction() {return  transaction;}
}
