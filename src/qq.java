public class qq {
    public static void main(String[] args){
        int startPriceOld=2000, startPriceNew=8000,  savingperMonth=1000, month=0;
        double percentLossByMonth=1.5, percent, z=startPriceOld, zz=startPriceNew,save = 0;
        percent = ((100 - percentLossByMonth) / 100);
        while(zz>(z+save)){
            month++;
            z = z * percent;
            zz = zz * percent;
            save = save+savingperMonth;
            if(month%2==0){
                z = z *0.995;
                zz = zz *0.995;
            }
            System.out.println(month + " " + z+" "+zz);
        }
         int answer = (int)((z+save)-zz);
        System.out.println(month + " " + answer);
    }
}
