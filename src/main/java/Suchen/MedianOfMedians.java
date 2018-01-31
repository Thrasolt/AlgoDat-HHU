public class MedianOfMedians{

  // Instanzvaribalen
  private final static int groupSize = 5;

  public static int findMedian(int[] folge, int i){
    int n = folge.length;

    // Eingabepruefung
    if(n <= groupSize) {

    }
    return 0;
  }

  public static int findMedianDirectly(int[] folge){
    int n = folge.length;
    if(n <= groupSize){

      // Sort
      Sorting sorter = new Sorting();
      sorter.quicksort(folge);
      return folge[n/2];
    }
    return 0;
  }

  public static int[][] splitSeries(int[] folge){
    int n = folge.length;
    int nrPackes = n/groupSize;
    if(n%groupSize!=0){
      nrPackes += 1;
    }

    int[][] outArray = new  int[nrPackes][groupSize];

    for(int i=0; i<nrPackes; i++){
      for(int j=0; i<groupSize; j++){
        
      }
    }

    return outArray;

    }
}
