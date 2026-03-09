public class BackToSender{

    

    public static int getAmountPerParcel(int successfulDelivery){
    
        if(successfulDelivery>0 && successfulDelivery<=49) return 160;
        if(successfulDelivery>=50 && successfulDelivery<=59) return 200;
        if(successfulDelivery>=60 && successfulDelivery<=69) return 250;
        if(successfulDelivery>=70) return 500;
        
        return 0;
    }
    
    public static double getWages(int successfulDelivery){
        final double BASEPAY=5000;
        int amountPerParcel= getAmountPerParcel(successfulDelivery);
        double wages= amountPerParcel * successfulDelivery + BASEPAY;
            
        if(amountPerParcel==0) return 0;
        
        return wages;
    }
    

}
