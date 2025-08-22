package PROXY_Methord;

// Proxy subject
class ProxyDataBase implements DatabaseExecute {
    private DataBase dataBase;
    private String desig;

    public ProxyDataBase(String desig) {
        this.desig = desig;
        this.dataBase = new DataBase();
    }

    @Override
    public void executeQuery(String type) {
        if (desig.equals("ADMIN")) {
            dataBase.execute(type + " query", desig);
        } else if (desig.equals("HR")) {
            if (type.equals("Read")) {
                dataBase.execute(type + " query", desig);
            } else {
                System.out.println("HR does not have permission to execute " + type + " query");
            }
        } else if (desig.equals("EMPLOYEE")) {
            if (type.equals("Read")) {
                dataBase.execute(type + " query", desig);
            } else {
                System.out.println("EMPLOYEE does not have permission to execute " + type + " query");
            }
        }
    }
}
