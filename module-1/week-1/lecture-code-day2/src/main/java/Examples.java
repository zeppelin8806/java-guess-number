public class Examples {
    public String isEven(int number){

        if(number % 2 == 0) {
            return "even";
        } else if(number % 2 == 1) {
            return "odd";
        }

        // code here, uh oh no string is returned ack!!!!
        //return "";
        return null;
    }
    // ^ There is an error here...why?

    // Given averageModuleScore of 0 - 3
    public boolean checkGoodAcademicStanding(double averageModuleScore) {

        // Answer 1
//        if( averageModuleScore >= 2.0 ){
//            return true;
//        } else {
//            return false;
//        }

        // Answer 2
//        if( averageModuleScore >= 2.0 ){
//            return true;
//
//            // no code after this point ^
//        }
//        return false;

        // Answer 3
        return averageModuleScore >= 2.0;
    }


    public int sumOddsBetweenValues(int start, int end){
        int diff = end - start;
        if(diff == 0){
            return 0;
        }
        int[] arr = new int[diff+1];
        arr[0] = start;
        arr[arr.length-1] = end;
        int n = arr[0];
        for (int i = 1; i <arr.length; i++){
            arr[i] = (start +1);
            if(arr[i]%2==1){
                n = n+arr[i];
            }
        }
        return n;
    }

}
