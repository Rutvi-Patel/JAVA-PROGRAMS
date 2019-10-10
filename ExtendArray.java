package ArraysAndList;

public class ExtendArray {
    private String [] userArray = new String [3];
    public static int counter = 0;
    public static int realSize = 2;
    
    public void set(int index, String word){
    	userArray[index] = word;
    }
    public void add(String word) {
        if (counter > realSize) {
        	resize(counter + 1);
        }
        set(counter,word);
        counter++;
        
        }
    private void resize(int newSize){
  
    	realSize = newSize-1;
       String [] userArray1 =new String [newSize];
       for (int i = 0; i<userArray.length;++i) {
    	   userArray1[i] = userArray[i];
       }
       userArray = userArray1;
       
    }
    public String toString(){
      String y = "";
       for (int i = 0; i<userArray.length;++i){
          y = y +i+": "+ userArray[i] +"\n";
       }
       return (y);
    }
   public static void main(String[] args) {
       ExtendArray myList = new ExtendArray();
       myList.add("First");
       myList.add("Second");
       myList.add("third");
       myList.add("rutvi");
       myList.add("choco");
       myList.add("chica");
       myList.set(3,"fight");
       System.out.println(myList);

   }//end main
}//end class