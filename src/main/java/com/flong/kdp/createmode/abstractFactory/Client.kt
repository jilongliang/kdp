package com.flong.kdp.createmode.abstractFactory

fun main(args: Array<String>) {

	var blackAnimalFactory = BlackAnimalFactory();
	
	var blackCat = blackAnimalFactory.createCat();
	blackCat.eat();
	
	var blackDog = blackAnimalFactory.createDog();
	blackDog.eat();
	
	
	
	var whiteAnimalFactory = WhiteAnimalFactory();
    
	var whiteCat = whiteAnimalFactory.createCat();
    whiteCat.eat();
	
    var whiteDog = whiteAnimalFactory.createDog();
    whiteDog.eat();


}