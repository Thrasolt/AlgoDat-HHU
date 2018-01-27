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
    System.out.println("Quicksort started");
    int pivot = series[right];
    int indexLeft = left;
    int indexRight = right-1;
    System.out.println("indexLeft start: "+indexLeft);

    // Tauschprozess
    while(indexLeft<indexRight){
      System.out.println("Tauschprozess");
      while(series[indexLeft] <= pivot && indexLeft<=right){
        indexLeft += 1;
        System.out.println("indexLeft: "+indexLeft);
      }
      while(series[indexRight] >= pivot && indexRight>=left){
        indexRight -= 1;
      }
      if(indexLeft<indexRight){
        System.out.println("Tausche: "+series[indexLeft]+" "+series[indexRight]);
        swtch(series, indexLeft, indexRight);
      }
    }

    // Pivot tauschen, falls laenge 2 und sinnvoll
    if(right-left>1){
      swtch(series, indexLeft, right);
    } else if(series[indexLeft]>=pivot){
      System.out.println("Tausche Pivot: "+series[indexLeft]+" "+pivot);
      swtch(series, indexLeft, right);
    }

    /*
    // Divide and Conquer
    indexLeft -= 1; // move to position in front of pivot
    if(indexLeft-left>1){
      quicksort(series,left,indexLeft);
    }
    if(right-indexRight>1){
      quicksort(series,indexRight,right);
    }
    */

  }

  public static String printSeries(int[] series){
    String output = "";
    for(int i = 0; i < series.length; i++){
      output = output+Integer.toString(series[i])+" ";
    }
    return output.replaceAll("\\s+$", "");
  }
}
