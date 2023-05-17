public class bitmanulation {
    public static void main (String args[]){
        int n =5;
        int pos = 2;
        int bitmask = 1 <<pos;         // here we are finding the bit mask for 5 

        if((bitmask & n)== 0){                            // here we are checking the " AND " result of the bitmask and 5
            System.out.println("bit is zero");
        }                                              // this program is to get bit
                                                        // mean to get the bit value is  one or zero-;.-
        else{
            System.out.println("bit is one");
        }

        int i = 5 ;
        int posn = 3;
        int bitMask = i<<posn;

        if ((bitMask & i)==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one ");
        }
    }
    
}
