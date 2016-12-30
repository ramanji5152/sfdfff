class Invert
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);
        while(num > 0)
        {
            for(int j=1; j<=num; j++)
            {
                System.out.print(" "+num+" ");
            }
            System.out.print("\n");
            num--;
        }
    }
}