
public class Babelkowe_z_wartownikiem {
	
 public void bubbleSort(Integer[] X) {
  int size = X.length - 1;
   for (int i = 0; i < X.length - 1; i++) {
    for (int j = 0; j < size; j++) {
     if (X[j] > X[j + 1]) {
     int temp = X[j];
     X[j] = X[j + 1];
     X[j + 1] = temp;
      }
      }
      size--;
     }
   }
}
