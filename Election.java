class Election
{
public static void vote(int age)
{
System.out.println("voting age");
if(age>=18)
{
System.out.println("eligibale for vote");
}
else 
{
System.out.println("not eligible for voting");
}
}
public static void main(String[] args)
{
System.out.println("start main in Election");
vote(19);
vote(15);
vote(25);
System.out.println("end main in Election");
}
}

