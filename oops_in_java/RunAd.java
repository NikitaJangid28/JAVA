class Add{
    int a,b,c;
  public void Add()  { //method
        c=a+b;
        System.out.println("Sum = "+c);
    }
}
class RunAd{
    public static void main(String[] args) {
        Add A1= new Add();
        Add A2 = new Add();
        A1.a=10;
        A1.b=20;

        A2.a =23;
        A2.b=21;

        A1.Add();
        A2.Add();
    }
}