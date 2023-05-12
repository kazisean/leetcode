public class Test {
    
    public static void main (String[] args){
         int [] bb = {7,10,10,15,15,15,15,10,10,10,15,10,10};

         int cc= findLongest(bb, 10);
         
        System.out.println(cc);

    }

    public static int findLongest(int [] a, int num){
    int rep = 0, maxRep = 0;
    for (int i = 0; i < a.length; i++){
        if (a[i] == num){
            rep++; }
            
        else {
            rep = 0;
        }

        if (rep > maxRep){
        maxRep = rep;
        }
    }
    return maxRep;
    }

}