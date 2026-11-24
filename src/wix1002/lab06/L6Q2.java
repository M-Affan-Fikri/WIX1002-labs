package wix1002.lab06;

public class L6Q2 {
    public static void main(String[] args) {
        // print triangle
        for(int i=1;i<7;i++){
            multiPrint(7-i,' '); // print spaces
            multiPrint(2*i-1,'*'); // (2*i-1 = i + i-1) print '*' left, and right less 1
            System.out.println();
        }
        // print diamond with 2 triangle
        for(int h=1;h<7;h++){
            multiPrint(7-h,' ');
            multiPrint(2*h-1,'*'); // h + h-1 = 2*h-1
            System.out.println();
            }
        for(int m=0;m<6;m++){
                multiPrint(m+2,' ');
                multiPrint(9-2*m,'*');
                System.out.println();
        }
    }
    static void multiPrint(int n,char c){
        for(int j=0;j<n;j++){
            System.out.print(c);
        }
    }
}