package ClassObjectExercises;

import java.util.ArrayList;

public class Client {
    private int ID;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int ID, String name, String phone) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;

       this.accounts=new ArrayList<>();
    }
    public boolean addAccount(Account account){
        this.accounts.add(account);
        System.out.println("the account had been added successfully");
        return true;
    }
    public boolean removeAccount(int accountID){
        for (int i=0;i<accounts.size();i++)
            if(accounts.get(i).getID()==accountID){
                accounts.remove(i);
                System.out.println("the account had been removed");
                return true;
            }
        return false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String s =  "Client{" +
                "ID=" + ID +
                ", name='" + name +
                ", phone='" + phone + "\n" ;
        for (Account account:accounts)
            s += account.toString() + "\n";
        return s;
    }


}
