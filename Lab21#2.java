public class Lab212{


public static int [] reverse (int[] list){
  int[] result = new int[list.lenght];
  
  for (int i = 0, j = result.lenght - 1;
       i < list.lenght; i++ , j--) {
  result[j] = list[i];     
       }
return result;


}
}