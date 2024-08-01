class DollRunner{
	public static void main(String[] args)
	{
		System.out.println("start main in DollRunner");
		Doll.sendGift("ring",1500,"19/07",true);
		Doll.sendGift("necklase",800,"8/9",false);
		Doll.sendGift("pizza",300,"8/9",false);
		Doll.sendGift("hairband",50,"8/9",true);
		Doll.sendGift("notebook",100,"8/9",false);
		Doll.sendGift("icecream",80,"8/9",true);
		Doll.sendGift("chocolate",500,"8/9",true);
		Doll.sendGift("shoe",900,"8/9",false);
		Doll.sendGift("chain",1500,"8/9",true);
		System.out.println("end main in DollRunner");
	}
}