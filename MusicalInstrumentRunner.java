class MusicalInstrumentRunner{
	public static void main(String[] value){
		System.out.println("start main in MusicalInstrumentRunner");
		MusicalInstrument ref=new MusicalInstrument();
		ref.brand="gibson";
		ref.color="bright";
		System.out.println("brand:"+ref.brand);
		System.out.println("color:"+ref.color);
		
		MusicalInstrument ref1=new MusicalInstrument();
		ref1.brand="harmanProfessional";
		ref1.color="dark";
		System.out.println("brand:"+ref1.brand);
		System.out.println("color:"+ref1.color);
		
		MusicalInstrument ref2=new MusicalInstrument();
		ref2.brand="shure";
		ref2.color="warm";
		System.out.println("brand:"+ref2.brand);
		System.out.println("color:"+ref2.color);
		
		MusicalInstrument ref3=new MusicalInstrument();
		ref3.brand="yamaha";
		ref3.color="harsh";
		System.out.println("brand:"+ref3.brand);
		System.out.println("color:"+ref3.color);
		
		MusicalInstrument ref4=new MusicalInstrument();
		ref1.brand="ref1";
		ref1.color="ref1";
		System.out.println("brand:"+ref4.brand);
		System.out.println("color:"+ref4.color);
		
		MusicalInstrument ref5=new MusicalInstrument();
		ref1.brand="ref1";
		ref1.color="ref1";
		System.out.println("brand:"+ref5.brand);
		System.out.println("color:"+ref5.color);
		
		MusicalInstrument ref6=new MusicalInstrument();
		ref1.brand="ref2";
		ref1.color="ref2";
		System.out.println("brand:"+ref6.brand);
		System.out.println("color:"+ref6.color);
		System.out.println("end main in MusicalInstrumentRunner");
	}
}