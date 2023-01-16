 public class StringsBook{
 
 
 public static void main(String [] args){

    System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
    System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
    System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
    System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
    System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));
    System.out.println("\nstartsWith");
    System.out.println(startsWith("architecture", &quot;arch&quot;));
    System.out.println(startsWith(&quot;architecture&quot;, &quot;a&quot;));
    System.out.println(startsWith(&quot;arch&quot;, &quot;architecture&quot;));
    System.out.println(startsWith(&quot;architecture&quot;, &quot;rch&quot;));
    System.out.println(startsWith(&quot;architecture&quot;, &quot;architecture&quot;));
    }
 }