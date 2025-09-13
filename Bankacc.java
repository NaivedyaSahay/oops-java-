public class Bankacc {
 public static void main(String[] args) {
     Bank sbi= new Bank();
     sbi.username="Naivedya";//it is possible since it is public and can be accesed anywhere
//     sbi.password="Navi";//not possible it will give compile time error
     sbi.setPassword("navi");
     sbi.display();
 }
}
class Bank{
    public String username;//properties
    private String password;//properties

    void setPassword(String pwd){//methods ,actions,operations
        password=pwd;
    }
    void display(){
        System.out.println(password);
    }
}