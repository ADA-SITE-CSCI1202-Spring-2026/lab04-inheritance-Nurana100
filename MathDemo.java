package week04;

public class MathDemo {
    public static int min(int a,int b) {
        return (a<b) ? a:b;
    }
    
    public static int max(int a,int b) {
        return (a>b) ? a:b;
    }

    public static int sum(int[] args) {
        int total=0;
        for(int num:args) {
            total+=num;
        }
        return total;
    }
    public static int factorial(int n) {
        if(n==0 || n==1) return 1;
        int result=1;
        for(int i=2;i<=n;i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("min(4,9) = "+ MathDemo.min(4,9));
        System.out.println("max(4,9) = "+ MathDemo.max(4,9));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("sum([1-5])      = " + MathDemo.sum(numbers));

        System.out.println("factorial(5)    = " + MathDemo.factorial(5));
        System.out.println("factorial(0)    = " + MathDemo.factorial(0));
    }
}
