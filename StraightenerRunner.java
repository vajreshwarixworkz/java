class StraightenerRunner{
	public static void main(String[] args){
		System.out.println("start main in StraightenerRunner");
		
		Straightener straightener=new Straightener("philips","blue");
		System.out.println("straightener type:"+straightener.type);
		System.out.println("straightener brand:"+straightener.brand);
		System.out.println("straightener color:"+straightener.color);
		straightener.price=3000;
		System.out.println("straightener price:"+straightener.price);
		
		Straightener straightener1=new Straightener("havells","black");
		System.out.println("straightener type:"+straightener1.type);
		System.out.println("straightener brand:"+straightener1.brand);
		System.out.println("straightener color:"+straightener1.color);
		straightener1.price=5690;
		System.out.println("straightener price:"+straightener1.price);
		System.out.println("end main in StraightenerRunner");
	}
}