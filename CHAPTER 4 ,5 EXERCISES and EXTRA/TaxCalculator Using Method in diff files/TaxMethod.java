
public class TaxMethod{

    public static double taxCalc(long earnings){
    
    return earnings <=30000 ? earnings*0.15 : earnings * 0.20;
    
  }
}
