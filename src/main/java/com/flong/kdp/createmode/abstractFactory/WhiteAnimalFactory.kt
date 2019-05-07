package com.flong.kdp.createmode.abstractFactory

class WhiteAnimalFactory : IAnimalFactory {
	
	override fun createCat(): ICat {
		return WhiteCat();
	}

	override fun createDog(): IDog {
		return WhiteDog();
	}
}