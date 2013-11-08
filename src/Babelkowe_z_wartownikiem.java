import java.util.Random;


public class Babelkowe_z_wartownikiem {
	
	class Tablica
	{
	int[] tab = new int[10];
	    void wypelnienie()
	    {
	        Random r = new Random();
	        for(int i=0;i<10;i++)
	        {
	            tab[i]=r.nextInt();
	            System.out.println(tab[i]);
	        }
	    }
	}
	    
public void bubbleSort(Integer[] X) {
 long start=System.currentTimeMillis();
  int size = X.length - 1; 
   for (int i = 0; i < X.length - 1; i++) {
	   boolean guard = true;
    for (int j = 0; j < size; j++) {
     if (X[j] > X[j + 1]) {
     int temp = X[j];
     X[j] = X[j + 1];
     X[j + 1] = temp;
     guard = false;
      }
      }
      size--;
      if (guard == true) break;
     }
   long stop=System.currentTimeMillis();
   System.out.println("Czas wykonania (w milisekundach): "+(stop-start));
   }
}
//Sortowanie z wartownikiem jest zawsze wolniejsze oprocz przypadku kiedy tablica jest juz wczesniej posortowana