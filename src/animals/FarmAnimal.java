package animals;

import point.Point;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class FarmAnimal {
	protected boolean hungry;
	protected int hungrytick;
	protected final int defaulthungrytick = 5;
	protected boolean producingproduct;
	protected Point currentPosition;
	int getHungryTick() {
		return hungrytick;
	}
	void setHungryTick(int _hungrytick){
		hungrytick = _hungrytick;
	}
	void move(){
		int minimum = 1, maximum = 4;
		int chooseMoveType = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
		hungrytick -= 1;
		if (hungrytick <= defaulthungrytick) {
			hungry = true;
		}
		switch (chooseMoveType) {
			case 1 :
				if (getCurrentPosition().getX()-1 > 4) {
					currentPosition.setX(currentPosition.getX()-1);
				}
				break;
			case 2 :
				if (getCurrentPosition().getX()+1 < 7) {
					currentPosition.setX(currentPosition.getX()+1);
				}
				break;
			case 3 :
				if (getCurrentPosition().getY()+1 < 11) {
					currentPosition.setY(currentPosition.getY()+1);
				}
				break;
			case 4 :
				if (getCurrentPosition().getY()-1 > 0) {
					currentPosition.setY(currentPosition.getY()-1);
				}
				break;
		}
	}
	boolean isProducingProduct() {
		return producingproduct;
	}
	void setProducingProduct(boolean _producingproduct){
		producingproduct = _producingproduct;
	}
	boolean isHungry(){
		return hungry;
	}
	void setHungry(boolean _hungry){
		hungry = _hungry;
	}
	Point getCurrentPosition(){
		return currentPosition;
	}
	void setCurrentPosition(Point _currentPosition){
		currentPosition = _currentPosition;
	}
}
