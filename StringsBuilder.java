
public class StringsBuilder {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        // System.out.println(sb);

        //chsr at 0 index
        // System.out.println(sb.charAt(0));
        // //char set at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);


        //insert
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //delete
        // sb.delete(2, 4);
        // System.out.println(sb);


        //append join               for String
        // sb.append("H");         //str = str + "H";
        // sb.append("E");         //str = str + "E";
        // sb.append("L");         //str = str + "l";
        // sb.append("O");         //str = str + "O";
        // System.out.println(sb);


        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;  //5-1-0=> 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
