class Fibo{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        scanner.close();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial:"+fact);
    }
}