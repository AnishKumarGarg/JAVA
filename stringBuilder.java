public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        sb.append("Guys"); // last mein jodna
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        System.out.println(sb.charAt(2));
        System.out.println(sb.charAt(3));
        System.out.println(sb.charAt(4));
        System.out.println(sb.charAt(5));
        System.out.println(sb.charAt(6));

        System.out.println(sb.indexOf("l"));
        System.out.println(sb.indexOf("World"));

        System.out.println(sb.substring(3, 6)); // 3 included 6 not included

        sb.setCharAt(2, 'm');
        System.out.println(sb);

        sb.insert(4,'o');
        System.out.println(sb);

        sb.delete(12, 16); // 12 included 16 not included
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        System.out.println(sb.length());
        
        // System.out.println(sb.reverse());

        sb.insert(0,"You");
        System.out.println(sb);

        sb.replace(5, 6, "l"); // setCharAt for a range of indexes is replace.
        System.out.println(sb);

        


    

        
    }
}
