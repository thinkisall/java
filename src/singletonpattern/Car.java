package singletonpattern;

public class Car {
    private static int serialNum = 10000;
	private int carNum;
	
	public Car() {

	}

	public int getCarNum() {
        serialNum++;
		carNum = serialNum;
        return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
