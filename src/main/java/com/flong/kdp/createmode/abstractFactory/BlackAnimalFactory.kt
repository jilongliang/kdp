package com.flong.kdp.createmode.abstractFactory

class BlackAnimalFactory : IAnimalFactory {
	
	override fun createCat(): ICat {
		return BlackCat();
	}

	override fun createDog(): IDog {
		return BlackDog();
	}
}