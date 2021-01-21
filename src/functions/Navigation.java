package functions;

public class Navigation {
    private final String login = "/resources/fxml/login.fxml";
    private final String register = "/resources/fxml/register.fxml";
    private final String dashboard = "/resources/fxml/dashboard.fxml";


    public String getLogin() {
      return  login;
  }
    public String getRegister() {return  register;}
    public String getDashboard() {return  dashboard;}
}
