public class test1 {
    public static void main(String[] args) {
        //continue的运用 跳出本次循环
        int a,b,he=0;
        for(a=1;a<=100;a++)
        {
            if(a!=50)
            {
                he+=a;
            }
            else
                continue;

        }
        System.out.println(he);
    }
}
