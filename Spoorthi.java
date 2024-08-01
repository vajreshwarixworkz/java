class Spoorthi{
public static boolean sendMsg(String name,String msg,int quantity)
{
	System.out.println("start sendmsg in Spoorthi");
	System.out.println("Name: " + name);
    System.out.println("Message: " + msg);
    System.out.println("Quantity: " + quantity);
	boolean sendMsg=Queue.accept("sent");
	System.out.println("sendMsg :"+sendMsg);
	System.out.println("end sendmsg in Spoorthi");
	return true;
}


}