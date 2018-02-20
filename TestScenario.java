/* Adam Martinez
  Co Sci
*/
  
  public class TestScenario{
    public static void main(String[] args){
    
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 90){
      System.out.println("You get a soda");
    }
    if (randomNum <= 45){
      System.out.println("You get a cup of tea");
    }
      else if(randomNum <= 80 && randomNum >=70){
      System.out.println("You get a mixed drink.");
    }
      else{
        System.out.println("You get a cup of water.");
       
    }
   }
}  