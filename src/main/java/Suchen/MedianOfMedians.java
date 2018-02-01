import java.util.Arrays;

public class MedianOfMedians{

  // Instanzvaribalen
  private final static int groupSize = 5;

  public static int findMedian(int[] folge, int i){
    int n = folge.length;
    int nrPackes = n/groupSize;
    int median;

    // Eingabepruefung
    if(n <= groupSize) {
      return findMedianDirectly(folge);
    }
    else {
      int[][] packs = createPackages(folge);
      int[] medianList= new int[nrPackes];
      for(int j=0; i<nrPackes; j++){
        medianList[j] = findMedianDirectly(packs[j]);
      }
      if(medianList.length <= groupSize){
        median = findMedianDirectly(medianList);
      }
      else{
        median = findMedian(medianList, i);
      }
    }
    return median;
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

  public static int[][] createPackages(int[] folge){
    int n = folge.length;
    int nrPackes = n/groupSize;
    if(n%groupSize!=0){
      nrPackes += 1;
    }

    int[][] outArray = new int[nrPackes][groupSize];
    int index = 0;
    for(int i=0; i<nrPackes; i++){
      for(int j=0; i<groupSize; j++){
        outArray[i][j]=folge[index];
        index++;
      }
    }

    return outArray;

    }

    public static int[] partition(int[] series, int i, int medOfMeds) {
      int left = 0;
      int right =series.length-1;
      int indexLeft = 0;
      int indexRight = series.length-1;
      int pivot = medOfMeds;

      // Tauschprozess
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
      int[] leftSeries = Arrays.copyOfRange(series, left, indexRight);
      if(leftSeries.length==i){
        System.out.println(" = i");
        return Arrays.copyOfRange(series, i+1, i+2);
      }
      if(leftSeries.length>i) {
        System.out.println(" > i");
        return leftSeries;
      }
      int[] rightSeries = Arrays.copyOfRange(series, indexLeft, right);
      System.out.println(" < i");
      return rightSeries;
    }

    // Hilfsmittel
    public static void swtch(int[] folge, int i, int j){
      int temp = folge[i];
      folge[i] = folge[j];
      folge[j] = temp;
    }
}
