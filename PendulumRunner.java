class PendulumRunner{
	public static void main(String[] values){
		System.out.println("start main in PendulumRunner");
		
		Pendulum pendulum=new Pendulum("round","green");
		System.out.println("pendulum type:"+pendulum.type);
		System.out.println("pendulum shape:"+pendulum.shape);
		System.out.println("pendulum color:"+pendulum.color);
		pendulum.price=400;
		System.out.println("pendulum price:"+pendulum.price);
		
		Pendulum pendulum1=new Pendulum("angular","silver");
		System.out.println("pendulum type:"+pendulum1.type);
		System.out.println("pendulum shape:"+pendulum1.shape);
		System.out.println("pendulum color:"+pendulum1.color);
		pendulum1.price=380;
		System.out.println("pendulum price:"+pendulum1.price);
		System.out.println("end main in PendulumRunner");
	}
}