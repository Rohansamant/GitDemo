public class PracticeStrings {
    public static void main(String[] args) {
        String str = "Thank you for downloading Intellij IDEA!";
        String [] words = str.split("d");
        for(String st : words )
        {
            System.out.println(st);
        }
        String s = "123456789a";
        System.out.println(s.matches("[0-9]+"));



        int [][] nums = new int [4][2];
        nums [0][0]=10;
        nums [0][1]=20;
        nums [1][0]=30;
        nums [1][1]=40;
        nums [2][0]=50;
        nums [2][1]=60;
        nums [3][0]=70;
        nums [3][1]=80;

        for( int i=0; i<nums.length; i++){
            for(int j=0;j<nums[i].length; j++){
                System.out.println(nums [i][j]);
            }
        }

               // printGreeting(names);
        String names = {"Rohan","Vidhi"};
        printGreeting(...names: "Rohan","Vidhi");
    }
    public static void printGreeting(String...names){
        for(String n: names){
            System.out.println("Hello " + n);
        }
    }
}
