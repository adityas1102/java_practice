public class Strings {
    public static void main(String[] args) {
        //concatenation
        // String firstName = "MS"; 
        // String lastName = "Dhoni"; 
        // String fullName = firstName +"@"+ lastName;
        // System.out.println(fullName); 
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
    // }


        //compair
        String name1 = "Tony";
        String name2 = "kakkar";
        // if (name1.compareTo(name2) == 0){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("strings are no equal");
        // }

        if(name1 == name2){
            System.out.println("string are equal");
        }else{
            System.out.println("strings are no equal");
        }

        String sentence = "TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);


        //strings are immutable

    }
}
