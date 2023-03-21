public class Operators2 {
    static int a = 10;
    static int b = 15;
    static int c = 30;
    static String name = "Sanaya";
    static String name1 = "I am Living in London";
    static String name2 = "Sanaya";
    static String value = "£205,5";
    static double amount = 343.00;
    static int answer;
    static String surname = "Kakdiya";
    public static void main(String[] args) {
        System.out.println(name.contentEquals(surname));
        System.out.println(name.format(name2));
        System.out.println(name.isEmpty());//false
        System.out.println(name1.lastIndexOf("d"));
        System.out.println(name.replace("S",""));
        System.out.println(name.replaceFirst("S",""));

        String value1 =value.replaceAll("£","");
        System.out.println(value1);
        String value2 =value1.replaceAll(",","");
        System.out.println(value2);
        double amount1 = Double.parseDouble(value2);//for convert string into double
        System.out.println(amount1);
        System.out.println(amount1*2);
        String amountText = String.valueOf(amount);//for convert string
        System.out.println(amountText);// its convert in string so you cannot multiply

        System.out.println(name.toUpperCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        String[]parts = name1.split(" ");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
        System.out.println(parts[4]);
        System.out.println(name1.replaceAll("I am","She is"));
        System.out.println(name1.startsWith("She"));
        System.out.println(name1.endsWith("n"));
        System.out.println(name.contains("D"));
        System.out.println(name.compareTo(name2));
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println("San\taya");//  (one space)San aya
        System.out.println("San\baya");// one letter delete
        System.out.println("San\naya");//print in new line
        System.out.println("San\raya");//remains right side
        System.out.println("San\'aya");//add single quote
        System.out.println("San\"aya");//add double quote
        System.out.println("san\\aya");//add backward slash

        System.out.println(b%c);//15
        System.out.println(a++);//10
        System.out.println(a);//11
        System.out.println(++a);//12
        System.out.println(--b);//14
        System.out.println(b--);//14
        System.out.println(b);//13
        System.out.println(--b);//12
        System.out.println((a==b));//a=10,b=15,c=30.true
        System.out.println(!(b==c));//false
        System.out.println(a>c);//false
        System.out.println(b<a);//false
        System.out.println(b>=c);//false
        System.out.println(a<=c);//true
        // Logical operator &&
        System.out.println((a>b) && (b<c));//false //both condition should be true
        System.out.println((b>a) && (b<c));//true
        //logical operator ||
        System.out.println((a==c)||(b>c));//false//one condition should be true
        System.out.println((a>b) || (b>c));//false
        System.out.println((c==b)||(b<c));//true

        //logical not !
        System.out.println(!(a==b));//inside bracket condition true but answer come reverse way//answer true
        //Assignment operator
        int d =a+b;
        System.out.println(d);// assign for d value
        System.out.println(c=a+b);//
        System.out.println(c+=a);//c=a+c so c value is change
        System.out.println(c-=a);//c=a-c

    }

}





































































































