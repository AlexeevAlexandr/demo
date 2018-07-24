package Hash;


import java.util.HashMap;
import java.util.Map;

public class Hash {
    static class Account{
        private Integer amount;

        Account(int amount){
            this.amount = amount;
        }

        public Integer getAmount() {
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

        map.put("Sasha", new Account(100));
        map.put("Peta", new Account(150));
        System.out.println(map);

        map.get("Sasha").income(-50);
        System.out.println(map);

        for (Map.Entry<String, Account> entry : map.entrySet()){
            entry.getValue().income(-5);

        }
    }
}
