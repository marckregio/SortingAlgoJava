
package sortingalgojava;

public abstract class Algo extends drawUI{
    static int smallIndex, temp, minIndex, index;
    
    public static void insertion(int [] list, int listLength){
        long start = System.currentTimeMillis();
        for (minIndex=1; minIndex<listLength; minIndex++)
        {
            temp = list[minIndex];
            index = minIndex;
            while ((index>0) && (list[index-1]>temp))
            {
                list[index] = list[index-1];
                index--;
            }
            list[index] = temp;
            for(loop = 0;loop<listLength;loop++){
                    txtarea.append(list[loop]+" ");
                    mainpanel.updateUI();
                }
            txtarea.append("\n");
            pass++;
            if(handler.isSorted(list) == true)
                break;
        }
        passNum.setText(""+pass);
        long end = System.currentTimeMillis();
        long time = end-start;
        execTime.setText(time+" milliseconds");
    }
    public static void bubble(int list[], int listLength)
    {     
        long start = System.currentTimeMillis();
        for(index=0; index<listLength;index++){
            for(minIndex=1; minIndex<listLength-index; minIndex++){
                if(list[minIndex-1]>list[minIndex])
                {
                    temp = list[minIndex-1];
                    list[minIndex-1] = list[minIndex];
                    list[minIndex] = temp;
                }
                for(loop = 0;loop<listLength;loop++){
                    txtarea.append(list[loop]+" ");
                    mainpanel.updateUI();
                }
                txtarea.append("\n");
             }
            txtarea.append("\n");
            pass++;
            if(handler.isSorted(list) == true)
                break;
        }
        passNum.setText(""+pass);
        long end = System.currentTimeMillis();
        long time = end-start;
        execTime.setText(time+" milliseconds");
    }
    public static int[] Merge (int list[], int listLength){
        
        long start = System.currentTimeMillis();
        if (listLength > 1){
            int array1Length = listLength /2;
            int array2Length = listLength - array1Length;
            int array1[] = new int[array1Length];
            int array2 [] = new int[array2Length];
            
            for(index = 0; index< array1Length; index++)
                array1[index] = list[index];
            for(index = array1Length; index< array1Length+array2Length; index++)
                array2[index-array1Length] = list[index];
            
            array1 = Merge(array1 , array1.length);
            array2 = Merge(array2 , array2.length);
            
            int i=0, j=0, k=0;
            while(array1.length != j && array2.length != k){
                if(array1[j] <= array2[k]){
                list[i] = array1[j];
                i++; j++;
                } else {
                list[i] = array2[k];
                i++; k++;
                }
            }
            
            while(array1.length != j){
                list[i] = array1[j];
                i++; j++;
            }
            for(loop = 0;loop<array1Length;loop++){
                    txtarea.append(array1[loop]+" ");
                    mainpanel.updateUI();
            }
            txtarea.append("|");
            while(array2.length != k){
                list[i] = array2[k];
                i++; k++;
            }
            for(loop = 0;loop<array2Length;loop++){
                    txtarea.append(array2[loop]+" ");
                    mainpanel.updateUI();
            }
            txtarea.append("\n");
            for(loop = 0;loop<listLength;loop++){
                    txtarea.append("->"+list[loop]+" ");
                    mainpanel.updateUI();
            }
            txtarea.append("\n \n");
            pass++;
        }
        passNum.setText(""+pass);
        long end = System.currentTimeMillis();
        long time = end-start;
        execTime.setText(time+" milliseconds");
        return list;
        
    }
}