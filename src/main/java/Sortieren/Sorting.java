public class Sorting{

  //Instanzvariablen

  public static void main(String[] args){
    System.out.println("Test");
  }

  // Hilfsmittel
  public static void swtch(int[] folge, int i, int j){
    int temp = folge[i];
    folge[i] = folge[j];
    folge[j] = temp;
  }

  // Sortieralgorithmen
  public static void quicksort(int[] series){
    quicksort(series,0,series.length-1);
  }
  public static void quicksort(int[] series, int left, int right) {
    int indexLeft = left;
    int indexRight = right;
    int pivot = series[left + (right-left)/2];

    // Divide into two lists
     while (indexLeft <= indexRight) {
       while (series[indexLeft] < pivot) {
           indexLeft++;
       }
       while (series[indexRight] > pivot) {
           indexRight--;
       }
       if (indexLeft <= indexRight) {
           swtch(series, indexLeft, indexRight);
           indexLeft++;
           indexRight--;
       }
     }
     // divide and conquer
     if (left < indexRight)
         quicksort(series, left, indexRight);
     if (indexLeft < right)
         quicksort(series, indexLeft, right);
  }

  public static String printSeries(int[] series){
    String output = "";
    for(int i = 0; i < series.length; i++){
      output = output+Integer.toString(series[i])+" ";
    }
    return output.replaceAll("\\s+$", "");
  }
}
