package com.flong.kdp.createmode.abstractFactory

 
interface IAnimalFactory {
	
	fun createCat(): ICat

	fun createDog(): IDog
}

public interface ICat {
	fun eat()
}

public interface IDog {
	fun eat()
}