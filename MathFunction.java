public class MathFunction {
    public static void main(String args[]){
     System.out.println(roundoff(2.4));
    }
    public static double minimum(double a, double b){
        if(a<b)
            return a;
        else if(b<a)
            return b;
        else
            return a;

    }
    public static double maximum(double a, double b){
        if(a>b)
            return a;
        else if(b>a)
            return b;
        else
            return a;

    }
    public static double power(double a,double b){
        double ans=1;
            for(int i=0;i<=b-1;i++)
                ans=ans*a;
            return ans;
    }
    public static double absolute(double a){
        if(a<0)
            return -a;
        else
            return a;
    }
    public static int roundoff(double a){
        if(a>=0)
            return (int)(a+0.5);
        else
            return (int)(a-0.5);

    }
}
