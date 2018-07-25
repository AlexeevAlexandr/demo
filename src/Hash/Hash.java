package Hash;


import java.util.HashMap;
import java.util.Map;

public class Hash {
    static class Account{
        private Integer amount;

        Account(int amount){
            this.amount = amount;
        }

        Integer getAmount() {
            return amount;
        }

        void income(Integer amount){
            this.amount += amount;
        }

        @Override
        public String toString(){
            return "" + amount + '$';
        }
    }
    public static void main(String[] args) {
        Map<String, Account> map = new HashMap<>();

        //put to map data
        map.put("Sasha", new Account(100));
        map.put("Peta", new Account(55));
        System.out.println(map);

        //get data by key
        map.get("Sasha").income(-80);
        map.get("Peta").income(-50);
        System.out.println(map);

        //insert change to all
        for (Map.Entry<String, Account> entry : map.entrySet()){
            entry.getValue().income(-5);
        }
        System.out.println(map);

        if (map.get("Peta").getAmount() == 0){
            map.remove("Peta");
        }
        System.out.println(map);
    }
}
