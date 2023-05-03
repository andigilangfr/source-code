public class Array {
    public static void main(String[] args) {
        int firstArray[] = {1,2,3,4,5,6,7};
        int secondArray[] = {1,2,3,4,8,9,10};
        for(int i=0; i<firstArray.length; i++){
            if(firstArray[i]==secondArray[i]){
                System.out.println("First Value is equals with Comparasion Value ! First Value is "+firstArray[i]+ ", Second Value is " +secondArray[i]);
            } 
        }
    }
}
